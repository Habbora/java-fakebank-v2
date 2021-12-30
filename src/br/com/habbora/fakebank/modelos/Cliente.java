package br.com.habbora.fakebank.modelos;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 2L;
	
	private String 	email = "";
	private String 	senha = "";
	
	public Boolean mudarSenha(String senha, String novaSenha) {
		if(this.getSenha().equals(senha)) {
			this.setSenha(novaSenha);
			return true;
		}
		return false;
	}
	
	public Boolean senhaIsValid(String senha) {
		return this.getSenha().equals(senha);
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	private String getSenha() {
		return this.senha;
	}
	
	private void setSenha(String senha) {
		this.senha = senha;
		return;
	}
	
}
