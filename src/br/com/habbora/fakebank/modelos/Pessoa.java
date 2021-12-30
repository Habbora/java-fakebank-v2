package br.com.habbora.fakebank.modelos;

import java.io.Serializable;

public class Pessoa extends Object implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String dataDeNacimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDataDeNacimento() {
		return dataDeNacimento;
	}
	public void setDataDeNacimento(String dataDeNacimento) {
		this.dataDeNacimento = dataDeNacimento;
	}
	
}
