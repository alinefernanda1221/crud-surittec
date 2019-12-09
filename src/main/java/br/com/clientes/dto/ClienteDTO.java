package br.com.clientes.dto;

import java.util.List;

import br.com.clientes.model.Email;
import br.com.clientes.model.Telefone;

public class ClienteDTO {
	
	private String nome;
	
	private Long cpf;
	
	private EnderecoDTO endereco;
	
	private List<Email> emails;
	
	private List<Telefone> telefones;
	
	
	ClienteDTO() {}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Long getCpf() {
		return cpf;
	}


	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}


	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}


	public List<Email> getEmails() {
		return emails;
	}


	public void setEmails(List<Email> email) {
		this.emails = email;
	}


	public List<Telefone> getTelefones() {
		return telefones;
	}


	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	
}
