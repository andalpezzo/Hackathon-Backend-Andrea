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
	
	@GetMapping("/wellcome")
	public void welcomeUser() {
		System.out.println("Welcome Login & Register server");
		System.out.println("Created by Andrea Dal Pezzo");
	}
}
