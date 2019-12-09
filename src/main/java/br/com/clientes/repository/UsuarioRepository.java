package br.com.clientes.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.clientes.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	Usuario findByLogin(String login);
	
}
