package com.myprojects.orderservice.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myprojects.orderservice.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> Listar() {
		var cliente1 = new Cliente(1l, "joao", "Joao@email.com", "91-99334-4123");
		var cliente2 = new Cliente(2l, "Pedro", "pedro@email.com", "91-00011-1532");
		var cliente3 = new Cliente(3l, "Maria", "Maria@email.com", "91-1456-4168");
		return Arrays.asList(cliente1, cliente2, cliente3);
	}
}
