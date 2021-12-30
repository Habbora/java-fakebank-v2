package br.com.habbora.fakebank.modelos;

public class Conta extends Cliente implements Comparable<Conta> {
	
	private static final long serialVersionUID = 1L;
	private Double saldo = 0.0;
	private Long conta = 0L;
	
	public void setConta(Long conta) {
		this.conta = conta;
	}
	
	public Long getConta() {
		return this.conta;
	}
	
	public Conta(String nome, String email, String senha) {
		super.setNome(nome);
		super.setEmail(email);
		super.mudarSenha("" , senha);
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public Boolean sacar(Double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public Boolean depositar(Double valor) {
		this.saldo += valor;
		return true;
	}
	
	@Override
	public String toString() {
		return "[ " + super.getNome() + ", " + super.getEmail() + ", " + this.getSaldo() + " ]";
	}

	@Override
	public int compareTo(Conta outraConta) {
		return this.getNome().compareTo(outraConta.getNome());
	}
	
}
