package br.com.clientes.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

	@Id
	@Column(name = "ID_CLIENTE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@NotNull
	@Column(name = "CPF", nullable = false)
	private Long cpf;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name="CLIENTE_ENDERECO",
    			joinColumns={@JoinColumn(name="ID_CLIENTE",  
    			referencedColumnName="ID_CLIENTE")},  
    			inverseJoinColumns={@JoinColumn(name="ID_ENDERECO",   
    			referencedColumnName="ID_ENDERECO")})
	private Endereco endereco;
	
//	@JsonIgnore
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Email> emails;
	
//	@JsonIgnore
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Telefone> telefones;

	
	public Cliente() {}
	
	public Cliente(Long id, @NotNull String nome, @NotNull Long cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Cliente(Long id, @NotNull String nome, @NotNull Long cpf, Endereco endereco, List<Email> emails,
			List<Telefone> telefones) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.emails = emails;
		this.telefones = telefones;
	}
	
	
	

	public Cliente(Long id, @NotNull String nome, @NotNull Long cpf, List<Email> emails, List<Telefone> telefones) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.emails = emails;
		this.telefones = telefones;
	}

	public Cliente(Long id, @NotNull String nome, @NotNull Long cpf, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
