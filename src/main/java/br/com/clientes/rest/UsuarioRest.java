package br.com.clientes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.clientes.dto.UsuarioDTO;
import br.com.clientes.exception.NegocioException;
import br.com.clientes.service.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioRest {

	@Autowired
	private UsuarioService usuarioService;
	
	
	@GetMapping("/login")
	public @ResponseBody UsuarioDTO efetuarLogin(UsuarioDTO usuarioDTO) throws NegocioException {
		return usuarioService.efetuarLogin(usuarioDTO);
	}
	
	@PostMapping("/salvar")
	public void salvarUsuario(UsuarioDTO usuarioDTO) {
		usuarioService.salvarUsuario(usuarioDTO);
	}
}
