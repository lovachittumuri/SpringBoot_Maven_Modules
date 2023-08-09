package com.cl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/hi")
	public String sayGreetings() {
		return "Sandya Chittumuri";
	}

}
