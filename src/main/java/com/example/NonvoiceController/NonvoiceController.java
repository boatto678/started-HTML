package com.example.NonvoiceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NonvoiceController {

	  @RequestMapping("/")
	  public String defualt() {
	    return "index.html";
	  }
	
	  @RequestMapping("/index")
	  public String index() {
	    return "index.html";
	  }
	  
	 
}
 	