package com.jmp.relacionamentos.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="oistagens")
@Getter
@Setter
public class Postagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	private String titulo;
	private String texto;
	
	@OneToMany //uma postagem pode ter muitos comentarios
	@JoinColumn(name="codigo_postagem")
	private List<Comentario> comentarios;
}
