package com.carrito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
private final String paginaAngular = "forward:/index.html";
	
	@GetMapping(path = "prueba/componente1")
	public String paginaComponente1(){
		
		return paginaAngular;
	}
	
	@GetMapping(path = "prueba/componente2")
	public String paginaComponente2(){
		
		return paginaAngular;
	}

}
