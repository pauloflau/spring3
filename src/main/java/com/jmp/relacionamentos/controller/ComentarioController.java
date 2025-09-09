package com.jmp.relacionamentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.relacionamentos.entity.Comentario;
import com.jmp.relacionamentos.repository.ComentarioRepository;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
	@Autowired
	private ComentarioRepository repository;
	
	@GetMapping
	public List<Comentario> listar(){
		return repository.findAll();
	}
	
	@PostMapping
	public Comentario cadastrar(@RequestBody Comentario c) {
		return repository.save(c);
	}
}
