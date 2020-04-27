package com.assistencia.os.api.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assistencia.os.api.domain.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
		List<Cliente> findByNome(String nome); // Estou criando essa implementação para teste, caso eu queria buscar diretamente um dado pelo NOME
		List<Cliente> findByNomeContaining(String nome); // A busca será semelhante a um Like no sql
}
