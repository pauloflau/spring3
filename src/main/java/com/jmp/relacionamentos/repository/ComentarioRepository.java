package com.jmp.relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jmp.relacionamentos.entity.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

}
