package com.sheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class ExampleController {
	
	@RequestMapping(value="/sayHello",method=RequestMethod.GET)
	public String sayHello(){
		return "a";
	}
}
