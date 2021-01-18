package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/cognizant")
public class WelcomeRestController {
    //@GetMapping("/welcome") //binding to HTTP get request with "/welcome"
	//@RequestMapping("/welcome")
	@RequestMapping(path = "/welcome" , method = RequestMethod.GET)
	public String welcomeMsg() {
		String msg = "welcome to cognizant ";
		return msg ;
	}
}
 