package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "login";
	}
	@RequestMapping("/create")
	public String create() {
		return "create";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/manage")
	public String manage() {
		return "manage";
	}
	@RequestMapping("/search")
	public String search() {
		return "search";
	}

}
