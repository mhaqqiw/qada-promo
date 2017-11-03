package com.qada.service.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qada.service.controller.FuncController;
import com.qada.service.model.Promo;
import com.qada.service.model.Response;

import java.io.IOException;

public class TestCon {

  public static void main(String[] args) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    String jsonInString = "{\n" +
        "\t\"promoCode\":\"APP\",\n" +
        "\t\"promoOrg\":\"tokopedia\",\n" +
        "\t\"promoType\": 1,\n" +
        "\t\"startDate\":\"12/10/2017\",\n" +
        "\t\"endDate\":\"13/10/2017\",\n" +
        "\t\"promoLink\":\"sdfsd\",\n" +
        "\t\"promoDesc\":\"sdf\"\n" +
        "}";
//    String jsonInString = "{\n" +
//        "\t\"promoCode\":\"APPCODE\"\n" +
//        "}";
    Promo req = mapper.readValue(jsonInString, Promo.class);
    Response res = new Response();
    FuncController method = new FuncController();
    String[] mand = {"promoCode", "promoOrg", "promoType", "startDate", "endDate"};
    String resMan = method.checkMandatory(req, mand);
    if(resMan == ""){
      res = method.successAdd(req);
    }
    else{
      res.setId("200");
      res.setMsg(resMan);
    }
    System.out.println(mapper.writeValueAsString(res));
  }
}
