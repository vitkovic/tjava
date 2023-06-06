package com.example.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// expose "/" returns "Hello World"
	@GetMapping("/")
	public String sayHello() 
	{
		return "Hello World";
	}
}
