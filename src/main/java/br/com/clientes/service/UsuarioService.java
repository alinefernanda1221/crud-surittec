package br.com.clientes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clientes.dto.UsuarioDTO;
import br.com.clientes.exception.NegocioException;
import br.com.clientes.model.Usuario;
import br.com.clientes.repository.UsuarioRepository;
import br.com.clientes.util.MessageUtil;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioDao;
	
	public void salvarUsuario(UsuarioDTO usuarioDTO) {		
		Usuario usuario = new Usuario(usuarioDTO.getLogin(), usuarioDTO.getSenha(), usuarioDTO.getPermissao());
		
		usuarioDao.save(usuario);
	}

	public UsuarioDTO efetuarLogin(UsuarioDTO usuarioDTO) throws NegocioException {
		Usuario usuarioBD = usuarioDao.findByLogin(usuarioDTO.getLogin());
		
		boolean existeUsuario = usuarioBD != null;
		boolean senhaEstaCorreta = existeUsuario && 
										usuarioDTO.getSenha().equals(usuarioBD.getSenha());
		
		if(existeUsuario) {
			if(senhaEstaCorreta) {
				return new UsuarioDTO(usuarioBD.getLogin(), usuarioBD.getPermissao());
			}else {
				throw new NegocioException(MessageUtil.MENSAGEM_SENHA_INCORRETA);
			}
		}else {
			throw new NegocioException(MessageUtil.MENSAGEM_NAO_EXISTE_CADASTRO);
		}		
	}
}
