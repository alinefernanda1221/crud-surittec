package br.com.clientes.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clientes.model.TipoTelefone;
import br.com.clientes.service.TelefoneService;
import br.com.clientes.service.TiposTelefoneService;

@CrossOrigin
@RestController
@RequestMapping(value = "/telefone")
public class TelefoneREST {

	@Autowired 
	private TiposTelefoneService tipoTelefoneService;

	@Autowired 
	private TelefoneService telefoneService;
	
	@GetMapping("/tiposTelefone")
	public List<TipoTelefone> buscarTodosTipoTelefone() {
		return tipoTelefoneService.buscarTodosTipoTelefone();
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable(name = "id") Long id){
		telefoneService.removerPorId(id);
	}
}
