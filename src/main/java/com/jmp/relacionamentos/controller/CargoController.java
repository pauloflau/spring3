package com.jmp.relacionamentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.relacionamentos.entity.Cargo;
import com.jmp.relacionamentos.repository.CargoRepository;

@RestController
@RequestMapping("/cargos")
public class CargoController {
	@Autowired
	private CargoRepository repository;
	
	@GetMapping
	public List<Cargo> listar(){
		return repository.findAll();
	}
	
	@PostMapping
	public Cargo cadastrar(@RequestBody Cargo c) {
		return repository.save(c);
	}
}
