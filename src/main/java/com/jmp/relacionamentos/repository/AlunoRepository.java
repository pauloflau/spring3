package com.jmp.relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmp.relacionamentos.entity.Aluno;
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	Aluno findByCodigo(long codigo);

}
