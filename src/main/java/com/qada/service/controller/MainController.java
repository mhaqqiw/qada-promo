package com.qada.service.controller;

import com.qada.service.configuration.DBConn;
import com.qada.service.model.Promo;
import com.qada.service.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

	@RequestMapping(value = "/add-promo", method = RequestMethod.POST)
	public ResponseEntity<Response> addPromo(@RequestBody Promo req) {
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
		  return new ResponseEntity<Response>(res, HttpStatus.OK);
	}

	@RequestMapping(value = "/get-org", method = RequestMethod.GET)
	public ResponseEntity<Response> getPromoOrg() {
		  List<Object> dbRes;
		  Response res = new Response();
		  DBConn db = new DBConn();

		  dbRes = db.getData("SELECT promo_org_id, promo_org_name, promo_org_desc FROM promo_org po");
		  res.setId("200");
		  res.setMsg("Request success");
		  res.setData(dbRes);
		  return new ResponseEntity<Response>(res, HttpStatus.OK);
	}
}
