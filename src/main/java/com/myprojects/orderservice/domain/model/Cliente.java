package com.myprojects.orderservice.domain.model;

import lombok.Data;

@Data
public class Cliente {

	private long id;
	private String nome;
	private String email;
	private String telefone;

	public Cliente(long id, String nome, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
}
