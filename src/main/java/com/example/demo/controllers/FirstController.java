package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping("/ramram")
public String	FirstTest(){
		return "ramramaSTS";
	}
	
	@GetMapping("/second")
public String	secondTest(){
		return "second";
	}
}
