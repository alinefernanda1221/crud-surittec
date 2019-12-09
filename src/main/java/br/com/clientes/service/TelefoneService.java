package br.com.clientes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clientes.repository.TelefoneRepository;

@Service
public class TelefoneService {

	@Autowired
	private TelefoneRepository telefoneDAO;

	public void removerPorId(Long id) {
		telefoneDAO.deleteById(id);
	}
	
	
}
