package com.devopscycle.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")	
public class CalculatorController {
	
	@GetMapping("/soma")
	public int soma(@RequestParam int a, @RequestParam int b) { 
		
		return a + b;
	}

}
