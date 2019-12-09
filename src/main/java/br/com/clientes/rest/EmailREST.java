package br.com.clientes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clientes.service.EmailService;

@CrossOrigin
@RestController
@RequestMapping(value = "/email")
public class EmailREST {
	
	@Autowired 
	private EmailService emailService;

	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable(name = "id") Long id){
		emailService.removerPorId(id);
	}
}
