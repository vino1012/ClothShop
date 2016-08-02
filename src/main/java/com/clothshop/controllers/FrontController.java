package com.clothshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FrontController {
	@RequestMapping("/")
	public ModelAndView showHome()
	{
		return new ModelAndView("index");
	}
	@RequestMapping("/contact")
	public ModelAndView showContact()
	{
		return new ModelAndView("contact");
	}
	@RequestMapping("/product")
	public ModelAndView showProduct()
	{
		return new ModelAndView("product");
	}

}
