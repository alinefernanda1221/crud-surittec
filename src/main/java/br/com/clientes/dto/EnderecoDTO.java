package br.com.clientes.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnderecoDTO {
    
	private String cep;
	
	private String logradouro;

	private String complemento;
	
	private String bairro;
	
	private String localidade;
	
	private String cidade;
	
	private String uf;

	@JsonIgnore
	private String unidade;
	
	@JsonIgnore
	private String ibge;
	
	@JsonIgnore
	private String gia;
	
	public EnderecoDTO() {}
	
//	public EnderecoDTO(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
//		this.cep = cep;
//		this.logradouro = logradouro;
//		this.complemento = complemento;
//		this.bairro = bairro;
//		this.localidade = localidade;
//		this.uf = uf;
//	}

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

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public String getCidade() {
		return localidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
