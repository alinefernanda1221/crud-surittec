package br.com.clientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clientes.model.TipoTelefone;
import br.com.clientes.repository.TipoTelefoneRepository;

@Service
public class TiposTelefoneService {

	@Autowired
	TipoTelefoneRepository tipoTelefoneDAO;
	
	public List<TipoTelefone> buscarTodosTipoTelefone(){
		return (List<TipoTelefone>) tipoTelefoneDAO.findAll();
	}
}
