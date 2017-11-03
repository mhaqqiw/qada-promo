package com.qada.service.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qada.service.configuration.DBConn;
import com.qada.service.model.Promo;
import com.qada.service.model.Response;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class FuncController {
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  private static int DEFAULT_STATUS_PROMO_ORG = 1;
  private static int DEFAULT_STATUS_PROMO_DET = 1;

  public Response successAdd(Promo req){
    String msg = "";
    Response res = new Response();
    List<Object> dbRes = new ArrayList<Object>();
    int merchantId;
    int promoDetailId = 0;
    int promoId;

    String promoCode = req.getPromoCode();
    String promoOrg = req.getPromoOrg();
    String sDate = req.getStartDate();
    String eDate = req.getEndDate();
    String link = req.getPromoLink();
    String desc = req.getPromoDesc();

    if(checkFormatDate(sDate) == false){
      msg = msg + "Failed to format Start Date. please input valid format.\n";
    }
    if(checkFormatDate(eDate) == false){
      msg = msg + "Failed to format End Date. please input valid format.\n";
    }
    if(checksDateisBeforeeDate(sDate, eDate) == false){
      msg = msg + "Start Date is after End Date, please change.\n";
    }

    if(msg == ""){
      DBConn db = new DBConn();
      Timestamp start = parseTimeStamp(sDate);
      Timestamp end = parseTimeStamp(sDate);

      dbRes = db.getData("SELECT * FROM `promo_org` po WHERE po.promo_org_name = '"+promoOrg+"' LIMIT 1");
      if(dbRes.size() != 1){
        dbRes = db.setData("INSERT INTO `promo_org` VALUES (NULL, '"+promoOrg+"', "+DEFAULT_STATUS_PROMO_ORG+", NULL, CURRENT_TIMESTAMP, NULL)");
        msg = msg + "Success create Merchant\n";
        merchantId = Integer.parseInt(getValueByKey("generated_key", dbRes.get(0)));
      }
      else{
        merchantId = Integer.parseInt(getValueByKey("promo_org_id", dbRes.get(0)));
      }
      dbRes = db.getData("SELECT" +
          " pd.promo_details_id," +
          " p.promo_id," +
          " p.promo_code," +
          " pd.promo_sDate," +
          " pd.promo_eDate," +
          " pd.promo_status," +
          " pd.promo_link," +
          " pd.promo_desc" +
          " FROM promo p INNER JOIN promo_details pd ON p.promo_id = pd.promo_id" +
          " WHERE p.promo_code = '"+promoCode+"' AND p.promo_org_id = "+merchantId +" AND p.promo_type = 1" +
          " ORDER BY pd.promo_details_create_date DESC LIMIT 1");
      if(dbRes.size() == 0){
        dbRes = db.setData("INSERT INTO promo VALUES (NULL, '"+promoCode+"', '"+merchantId+"', 1, CURRENT_TIMESTAMP, NULL)");
        msg = msg + "Success create Promo\n";
        promoId = Integer.parseInt(getValueByKey("generated_key", dbRes.get(0)));
        dbRes = db.setData("INSERT INTO promo_details VALUES (NULL, '"+promoId+"', '"+start+"', '"+end+"', "+DEFAULT_STATUS_PROMO_DET+", '"+link+"', '"+desc+"', CURRENT_TIMESTAMP, NULL);");
        promoDetailId = Integer.parseInt(getValueByKey("generated_key", dbRes.get(0)));
        msg = msg + "Success create Promo Details\n";
      }
      else{
        int status = Integer.parseInt(getValueByKey("promo_status", dbRes.get(0)));
        if(status == 2){
          promoId = Integer.parseInt(getValueByKey("promo_id", dbRes.get(0)));
          dbRes = db.setData("INSERT INTO promo_details" +
              " VALUES (NULL, '"+promoId+"', '"+start+"', '"+end+"', '1', '"+link+"', '"+desc+"', CURRENT_TIMESTAMP, NULL);");
          promoDetailId = Integer.parseInt(getValueByKey("generated_key", dbRes.get(0)));
          msg = msg + "Success create Promo Details\n";
        }
        if(status == 1){
          promoDetailId = Integer.parseInt(getValueByKey("promo_details_id", dbRes.get(0)));
          msg = msg + "Promo masih aktif, diedit saja ya\n";
        }
        if(status == 3){
          promoDetailId = Integer.parseInt(getValueByKey("promo_details_id", dbRes.get(0)));
          msg = msg + "Promo pending nih, mungkin bisa diaktifkan\n";
        }
      }
      dbRes.add(promoDetailId);
    }

    res.setId("200");
    res.setMsg(msg);
    res.setData(dbRes);
    return res;
  }

  private String getValueByKey(String key, Object obj){
    Map<String,Object> objMap = (Map<String, Object>) obj;
    return objMap.get(key).toString();
  }

  public String checkMandatory(Object req, String[] key){
    String msg = "";
    ObjectMapper oMapper = new ObjectMapper();
    Map<String, Object> map = oMapper.convertValue(req, Map.class);
    int size = key.length;
    for(int i = 0; i < size; i++){
      try {
        if(map.containsKey(key[i]) == true){
          map.get(key[i]).toString();
        }
        else{
          msg = msg + "'" + key[i]+"' is doesn't exist.\n";
        }
      }
      catch (NullPointerException e){
        msg = msg + "'" + key[i]+"' is mandaroty field. should not be NULL\n";
      }

    }
    return msg;
  }

  private Timestamp parseTimeStamp(String time){

    Date date = new Date();
    try {
      date = sdf.parse(time);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return new Timestamp(date.getTime());
  }

  private boolean checkFormatDate(String time){
    boolean res;
    try {
      sdf.parse(time);
      res = true;
    } catch (ParseException e) {
      res = false;
    }
    return res;
  }

  private boolean checksDateisBeforeeDate(String sDate, String eDate){
    boolean res = false;
    try {
      Date d1 = sdf.parse(sDate);
      Date d2 = sdf.parse(eDate);
      if(d1.before(d2)){
        res = true;
      }
      else{
        res = false;
      }
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return res;
  }
}
