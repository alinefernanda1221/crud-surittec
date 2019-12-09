package br.com.clientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clientes.exception.NegocioException;
import br.com.clientes.model.Cliente;
import br.com.clientes.model.Email;
import br.com.clientes.model.Telefone;
import br.com.clientes.repository.ClienteRepository;
import br.com.clientes.repository.EmailRepository;
import br.com.clientes.repository.EnderecoRepository;
import br.com.clientes.repository.TelefoneRepository;
import br.com.clientes.util.MessageUtil;

@Service
public class ClienteService {

	
	@Autowired 
	private ClienteRepository clienteDAO;
	
	@Autowired 
	private TelefoneRepository telefoneDAO;
	
	@Autowired 
	private EmailRepository emailDAO;
	
	@Autowired 
	private EnderecoRepository enderecoDAO;
	
	/* USAR O MAPSTRUCT DA PROXIMA VEZ PARA FAZER OS DTO'S! */
	public String cadastrarCliente(Cliente cliente) throws NegocioException {
		try {
			clienteDAO.save(cliente);
			
			for(Telefone telefone : cliente.getTelefones()) {
				telefone.setCliente(cliente);
				telefoneDAO.save(telefone);
			}
			
			for(Email email : cliente.getEmails()) {
				email.setCliente(cliente);
				emailDAO.save(email);
			}
			
			return MessageUtil.CLIENTE_CADASTRO_SUCESSO;
		}catch (Exception e) {
			throw new NegocioException(MessageUtil.CLIENTE_CADASTRO_ERRO + e.getMessage());
		}
		
	}
	
	public Cliente buscarInformacoesBasicasPorID(Long id) {
		return clienteDAO.consultaBasicaClientePorId(id);
	}

	public Cliente buscarPorID(Long id) {
		return clienteDAO.consultaBasicaClientePorId(id);
	}

	public List<Cliente> buscarInformacoesBasicasTodosClientes() {
		return (List<Cliente>) clienteDAO.consultaBasicaTodosClientes();
	}

	public void atualizarCliente(Cliente cliente) {
		for(Telefone telefone : cliente.getTelefones()) {
			if(telefone.getId() == null) {
				telefone.setCliente(cliente);
				telefoneDAO.save(telefone);				
			}
		}
		
		for(Email email : cliente.getEmails()) {
			if(email.getId() == null) {
				email.setCliente(cliente);
				emailDAO.save(email);				
			}
		}
		clienteDAO.save(cliente);
	}

	public Cliente consultaClienteCompletoPorId(Long id) {
		return clienteDAO.findById(id).get();
	}
}
