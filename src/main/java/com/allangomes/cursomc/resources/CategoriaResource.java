package com.allangomes.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allangomes.cursomc.domain.Categoria;

@RestController
public class CategoriaResource {
	
	@GetMapping(value="/categorias")
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		return list;
	}
	
}
