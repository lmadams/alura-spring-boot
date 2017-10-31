package br.com.alura.listavip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "convidado")
public @Data class Convidado {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String email;
	private String telefone;
}
