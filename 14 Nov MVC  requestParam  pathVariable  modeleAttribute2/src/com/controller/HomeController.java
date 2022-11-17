package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;

@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/pagecall")
	public String m1(@RequestParam("uname") String un, @RequestParam("pass") String ps) {
		
		System.out.println("Data Get Using Request Param : " + un + " " + ps);
		System.out.println("Page Called");
		
		return "success";
	}
	
	@RequestMapping(value = "/reg/{uname}/{pass}")
	public String m2(@PathVariable("uname") String uname , @PathVariable("pass") String pass) {
		
		System.out.println("Data Get Using Path Variable : " + uname + " " + pass);
		
		return "success";
	}

	@RequestMapping(value = "/register")
	public String m2(@ModelAttribute Student student , Model m) {
		
		System.out.println("Data Get Using Model Attribute : " + student);
		
		m.addAttribute("stu", student);
		
		return "success";
	}

	
	
	
	
}
