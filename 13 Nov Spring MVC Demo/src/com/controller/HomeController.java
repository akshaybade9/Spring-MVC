package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/reg")
	public String getRegisteredPageCall() {
		
		System.out.println("Registered Method Called...");
		return "register";
	}

}
