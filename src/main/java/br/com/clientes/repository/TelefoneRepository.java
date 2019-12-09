package br.com.clientes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.clientes.model.Telefone;

public interface TelefoneRepository extends CrudRepository<Telefone, Long>{
	
	List<Telefone> findByClienteId(Long id);
}	
