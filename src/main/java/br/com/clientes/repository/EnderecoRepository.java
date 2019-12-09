package br.com.clientes.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.clientes.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, Long>{

	Endereco findByClienteId(Long id);
}
