package com.allangomes.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaResource {
	
	@GetMapping(value="/categorias")
	public String listar() {
		return "REST is working!";
	}
	
}
