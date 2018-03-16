package com.msfa.contact.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ChatBot")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String deneme()
	{
		return "denemee";
	}
	
}
