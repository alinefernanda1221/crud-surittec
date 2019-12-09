package br.com.clientes.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.clientes.exception.NegocioException;
import br.com.clientes.model.Cliente;
import br.com.clientes.service.ClienteService;

@CrossOrigin
@RestController
//@RequestMapping(value = "/cliente")
@RequestMapping(
		  value = "/cliente", 
		  produces = "application/json",
		  method = {RequestMethod.GET, RequestMethod.PUT, 
				  	RequestMethod.POST, RequestMethod.DELETE,
				  	RequestMethod.OPTIONS, RequestMethod.HEAD}) 
public class ClienteREST {
	
	@Autowired 
	private ClienteService clienteService;
	
	@PostMapping(value = "/cadastrar", consumes = "application/json")
	public @ResponseBody String cadastrarCliente(@RequestBody Cliente cliente) throws NegocioException {
		clienteService.cadastrarCliente(cliente);
		return null;
	}
	
	@GetMapping("/consultaBasica/{id}")
	public @ResponseBody Cliente buscarPorID(@PathVariable(name = "id") Long id) {
		return clienteService.buscarInformacoesBasicasPorID(id);
	}

	@GetMapping("/consultaTodos")
	public List<Cliente> buscarPorTodos() {
		return clienteService.buscarInformacoesBasicasTodosClientes();
	}
	
	@GetMapping("/consultaCompleta/{id}")
	public @ResponseBody Cliente consultaClienteCompletoPorId(@PathVariable(name = "id") Long id) {
		return clienteService.consultaClienteCompletoPorId(id);
	}
	
	@PutMapping("/atualizar")
	public void atualizarImovel(@RequestBody Cliente cliente) {
		clienteService.atualizarCliente(cliente);
	}

    @RequestMapping(
            value = "/**",
            method = RequestMethod.OPTIONS
    )
    public ResponseEntity handle() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
