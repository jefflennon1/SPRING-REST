package com.assistencia.os.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assistencia.os.api.domain.model.Cliente;

@RestController
public class ClienteController {
 
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Maria joaquina");
		cliente1.setEmail("Doidonadorbd@gmail.com");
		cliente1.setTelefone("888888888");
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Flávia");
		cliente2.setEmail("rbd@gmail.com");
		cliente2.setTelefone("999999999");
		
		return Arrays.asList(cliente1,cliente2);
	}
}
