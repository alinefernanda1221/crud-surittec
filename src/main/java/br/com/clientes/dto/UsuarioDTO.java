package br.com.clientes.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.clientes.enums.PermissaoUsuario;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UsuarioDTO {

	private String login;
	
	private String senha;
	
	private PermissaoUsuario permissao;
	

	public UsuarioDTO(String login, PermissaoUsuario permissao) {
		this.login = login;
		this.permissao = permissao;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public PermissaoUsuario getPermissao() {
		return permissao;
	}

	public void setPermissao(PermissaoUsuario permissao) {
		this.permissao = permissao;
	}
	
}
