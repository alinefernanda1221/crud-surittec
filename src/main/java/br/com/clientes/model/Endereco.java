package br.com.clientes.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {

	@Id
	@Column(name = "ID_ENDERECO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonIgnore
	@OneToOne
    @JoinTable(name="CLIENTE_ENDERECO",  
    			joinColumns={@JoinColumn(name="ID_ENDERECO", 
    			referencedColumnName="ID_ENDERECO")},  
    			inverseJoinColumns={@JoinColumn(name="ID_CLIENTE", 
    			referencedColumnName="ID_CLIENTE")}) 
	@JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE", updatable = false)
	private Cliente cliente;
	
	@NotNull
	@Column(name = "CEP", nullable = false)
	private String cep;
	
	@NotNull
	@Column(name = "LOGRADOURO", nullable = false)
	private String logradouro;

	@NotNull
	@Column(name = "BAIRRO", nullable = false)
	private String bairro;

	@NotNull
	@Column(name = "CIDADE", nullable = false)
	private String cidade;
	
	@NotNull
	@Column(name = "UF", nullable = false)
	private String uf;

	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	public Endereco() {}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}


