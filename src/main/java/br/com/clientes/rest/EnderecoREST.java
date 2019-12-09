package br.com.clientes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clientes.dto.EnderecoDTO;
import br.com.clientes.exception.NegocioException;
import br.com.clientes.service.EnderecoService;

@CrossOrigin
@RestController
@RequestMapping(value = "/endereco")
public class EnderecoREST {
	
	@Autowired EnderecoService enderecoService;
	
	@GetMapping("/consultaCEP/{cep}")
	public ResponseEntity<EnderecoDTO> buscaEnderecoPorCEP(@PathVariable String cep) throws NegocioException {
		EnderecoDTO enderecoDTO = enderecoService.buscaEnderecoCEP(cep);
		
		return new ResponseEntity<>(enderecoDTO, HttpStatus.OK);		

	}
}
