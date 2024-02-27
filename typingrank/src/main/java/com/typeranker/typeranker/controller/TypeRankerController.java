/**
 * 
 */
package com.typeranker.typeranker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class TypeRankerController {
	
	@GetMapping("/")
	public String home() {
		
		return "index";
	}
	
	@GetMapping("/test")
	public String test() {
		
		return "test";
	}

}
