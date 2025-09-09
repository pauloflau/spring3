package com.jmp.relacionamentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.relacionamentos.entity.Postagem;
import com.jmp.relacionamentos.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
public class PostagemController {

	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public List<Postagem> listar(){
		return repository.findAll();
	}
	
	@PostMapping
	public Postagem cadastrar(@RequestBody Postagem c) {
		return repository.save(c);
	}
}
