package com.assistencia.os.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assistencia.os.api.domain.model.Cliente;
import com.assistencia.os.api.domain.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	/*@PersistenceContext
	private EntityManager manager; //O entityManager é uma interface do jakata persistence que é usada para fazer as operações nas entidades como consulta, criação, exclusão e etc..
	/*
	 * 
	 */
	@Autowired
	private ClienteRepository  clienteRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return  clienteRepository.findAll();
				//clienteRepository.findByNome("manoel"); // Testando a implementação de buscar pelo nome;
				//clienteRepository.findByNomeContaining("Joao");//Método que vai buscar no banco usando um like, onde encontrará algum nome que tenha "joão" no meio.
	}
	
	@GetMapping("/clientes/{clienteId}")
	public Cliente buscar(@PathVariable long clienteId) {
		 Optional<Cliente> cliente = clienteRepository.findById(clienteId);  // Optional é um container que pode conter alguma coisa dentro dele ou não.
		 return cliente.orElse(null);/// Extraio que tá dentro do optional no retorno, senão haver nada retorno NULL.
	}
}
 