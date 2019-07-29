package com.example.NonvoiceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.NonvoiceBean.VerifyOTPReq;

@Controller
public class VerifyOTP {

	@RequestMapping(value = "/verifyOTP", method = RequestMethod.POST)
	  @ResponseBody
	  public Boolean verifyOTP(@RequestParam String verify) {
		  	
		 	VerifyOTPReq vf = new VerifyOTPReq();
		 	boolean verifyBoolean = false;
		 	vf.setVerify(verify);
		 	
		 	if(vf.getVerify().equals("123456")|| vf.getVerify().equals("000000")) {
		 		verifyBoolean = true ;
		 	}
		 	return verifyBoolean;
		  }
	
}
