package br.com.clientes.model;

import java.util.List;

public class DadosBasicos {
	
	private List<Telefone> telefones;
	
	private List<Email> emails;


	public DadosBasicos() {}
	
	public DadosBasicos(List<Telefone> telefones, List<Email> emails) {
		super();
		this.telefones = telefones;
		this.emails = emails;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
}
