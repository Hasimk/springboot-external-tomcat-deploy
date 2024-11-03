package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	
	@RequestMapping("/")
	public String pageController() {
		return "home";
		
				
	}
	
	@GetMapping("/about")
	public String aboutPage() {
		return "about";
	}

}
