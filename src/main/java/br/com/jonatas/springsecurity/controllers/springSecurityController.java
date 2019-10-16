package br.com.jonatas.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class springSecurityController {
	
	@GetMapping(path = "teste/")
	public void teste() {
		System.out.println("TESTANDO 123");
	}
}
