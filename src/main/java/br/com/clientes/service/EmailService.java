package br.com.clientes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clientes.repository.EmailRepository;

@Service
public class EmailService {

	@Autowired
	private EmailRepository emailDAO;

	public void removerPorId(Long id) {
		emailDAO.deleteById(id);
	}
	
	
}
