package com.example.NonvoiceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.NonvoiceBean.CitizenReq;
import com.example.NonvoiceBean.MobileReq;
@Controller
public class RequestOTPController {

		
	
	 @RequestMapping(value = "/mobile", method = RequestMethod.POST)
	  @ResponseBody
	  public Boolean mobile( @RequestParam String mobile) {
		  
		 	MobileReq mr = new MobileReq();
		 	boolean  mobileBoolean = false ;
		 	mr.setMobile(mobile);
		 	
		 	if(mr.getMobile().equals("0999999999") || mr.getMobile().equals("0888888888"))
		 	{
		 		mobileBoolean = true;
		 	}
		 	return mobileBoolean;
		  }
	 
	 @RequestMapping(value = "/citizen", method = RequestMethod.POST)
	  @ResponseBody
	  public Boolean citizen(@RequestParam String citizen) {
		  	
		 	CitizenReq ct = new CitizenReq();
		 	boolean citizenBoolean = false;
		 	ct.setCitizen(citizen);
		 	
		 	if(ct.getCitizen().equals("9999999999999999999")|| ct.getCitizen().equals("1111111111111111111")) {
		 		citizenBoolean = true ;
		 	}
		 	return citizenBoolean;
		  }
	 
	 @RequestMapping(value = "/requestOTP", method = RequestMethod.POST)
	  @ResponseBody
	  public String requestOTP(String requestOTP) {
		  System.out.println(requestOTP);
		    return requestOTP;
		  }
	
	
}
