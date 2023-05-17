package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Andrea Dal Pezzo
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Rest controller
@RequestMapping("/")
public class WelcomeController {
	
	@GetMapping("/")
	public String welcomeUser() {
		String wellcome = "Welcome Login & Register server (Created by Andrea Dal Pezzo)";
		return wellcome;
	}
}
