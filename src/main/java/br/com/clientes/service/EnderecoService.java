package br.com.clientes.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.clientes.dto.EnderecoDTO;
import br.com.clientes.exception.NegocioException;
import br.com.clientes.util.MessageUtil;

@Service
public class EnderecoService {

	RestTemplate restTemplate = new RestTemplate();

	private static final String URI_VIACEP = "http://viacep.com.br/ws/{cep}/json";
	
	
	public EnderecoDTO buscaEnderecoCEP(String cep) throws NegocioException {
		Map<String, String> params = new HashMap<>();
		params.put("cep", cep);
		
		EnderecoDTO enderecoDTO = restTemplate.getForObject(URI_VIACEP, EnderecoDTO.class, params);	
		
		if(enderecoDTO.getCep() != null) {
			return enderecoDTO;					
		}else {
			throw new NegocioException(MessageUtil.MENSAGEM_ENDERECO_NAO_ENCONTRADO);								
		}
		
	}
}
