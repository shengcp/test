package com.sheng.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@EnableAutoConfiguration
public class ExampleController {
	@RequestMapping(value="/sayHello",method=RequestMethod.GET)
	public ResponseBase<String> sayHello(){
		return ResponseBase.success("hello world");
	}
}
