package com.helloworld.hello.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class HelloControler {
	
	@GetMapping	
	public String hello() {
		return "Hello Generation!!";
		
	}
	public String PrimeiraAplicacao() {
		return "Orientação ao detalhe";
	}
	public String SegundaAplicacao() {
		return "Vencer a preguiça";
	}
}
