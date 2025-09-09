package com.jmp.relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmp.relacionamentos.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
	Curso findByCodigo(long codigo);
}
