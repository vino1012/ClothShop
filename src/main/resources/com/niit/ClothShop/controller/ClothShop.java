package com.niit.ClothShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClothShop {
	
	@RequestMapping("/ClothShop")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

}
