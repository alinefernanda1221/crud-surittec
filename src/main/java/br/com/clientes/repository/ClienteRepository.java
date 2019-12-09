package br.com.clientes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.clientes.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
	@Query(" SELECT new Cliente (c.id, c.nome, c.cpf) from Cliente c WHERE c.id = :idCliente")
	public Cliente consultaBasicaClientePorId(@Param("idCliente") Long id);

	@Query(" SELECT new Cliente (c.id, c.nome, c.cpf) from Cliente c")
	public List<Cliente> consultaBasicaTodosClientes();
	
	@Query("SELECT c FROM Cliente c WHERE c.id = :idCliente")
	public Cliente consultaClienteCompletoPorId(@Param("idCliente") Long id);

	Cliente findByCpf(Long cpf);
}
