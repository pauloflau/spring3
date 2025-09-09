package com.jmp.relacionamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.relacionamentos.entity.Aluno;
import com.jmp.relacionamentos.entity.Curso;
import com.jmp.relacionamentos.repository.AlunoRepository;
import com.jmp.relacionamentos.repository.CursoRepository;

@RestController
public class ControllerAlunoCurso {
	@Autowired
	private AlunoRepository alunoRepository;
	@Autowired
	private CursoRepository cursoRepository;

	// Método para cadastrar um aluno
	@PostMapping("/cadastrarAluno")
	public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	// Método para cadastrar um curso
	@PostMapping("/cadastrarCurso")
	public Curso cadastrarAluno(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}

	@GetMapping("/listarCurso")
	public Iterable<Curso> listarCurso() {
		return cursoRepository.findAll();
	}

	@GetMapping("/listarAluno")
	public Iterable<Aluno> listarAluno() {
		return alunoRepository.findAll();
	}

	// Método para vincular um aluno a um determinado curso
	@PostMapping("/vincular/{codigoCurso}/{codigoAluno}")
	public Aluno cadastrarAlunoCurso(@PathVariable Long codigoCurso, @PathVariable Long codigoAluno) {
		// Obter as informações do curso
		Curso c = cursoRepository.findByCodigo(codigoCurso);
		// Obter as informações do aluno
		Aluno a = alunoRepository.findByCodigo(codigoAluno);
		// Adicionar o objeto de curso no atributo de cursos do aluno
		a.getCursos().add(c);
		// Atualizar o objeto aluno (irá cadastrar um novo curso)
		alunoRepository.save(a);
		return a;
	}
}
