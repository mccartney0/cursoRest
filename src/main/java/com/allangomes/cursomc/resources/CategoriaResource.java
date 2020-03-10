package com.allangomes.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.allangomes.cursomc.domain.Categoria;
import com.allangomes.cursomc.services.CategoriaService;

@RestController
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping(value="/categorias/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value={"/", "/login"})
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
	
	@GetMapping(value="/admin/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName", "Bem vindo " + " /" + " Seu e-mail: (" + ")");
        modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        modelAndView.setViewName("admin/home");
        return modelAndView;
    }
}
