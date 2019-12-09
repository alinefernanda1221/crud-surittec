package br.com.clientes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.clientes.enums.PermissaoUsuario;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "LOGIN", nullable = false)
	private String login;
	
	@NotNull
	@Column(name = "SENHA", nullable = false)
	private String senha;
	
	@NotNull
	@Column(name = "PERMISSAO", nullable = false)
	@Enumerated(EnumType.STRING)
	private PermissaoUsuario permissao;
	
	public Usuario() {}

	public Usuario(String login, String senha, PermissaoUsuario permissao) {
		this.login = login;
		this.senha = senha;
		this.permissao = permissao;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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
