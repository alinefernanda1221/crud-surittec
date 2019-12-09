package br.com.clientes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.clientes.model.Email;

public interface EmailRepository extends CrudRepository<Email, Long>{

	List<Email> findByClienteId(Long id);

}
