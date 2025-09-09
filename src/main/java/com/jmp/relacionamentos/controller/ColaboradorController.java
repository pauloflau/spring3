package com.jmp.relacionamentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.relacionamentos.entity.Colaborador;
import com.jmp.relacionamentos.repository.ColaboradorRepository;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {
	
	@Autowired
	private ColaboradorRepository repository;
	
	@GetMapping
	public List<Colaborador> listar(){
		return repository.findAll();
	}
	
	@PostMapping
	public Colaborador cadastrar(@RequestBody Colaborador c) {
		return repository.save(c);
	}
}
