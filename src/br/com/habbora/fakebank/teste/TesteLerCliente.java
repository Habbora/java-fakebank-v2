package br.com.habbora.fakebank.teste;

import br.com.habbora.fakebank.modelos.Conta;

public class TesteLerCliente {

	public static void main(String[] args) {
		Conta conta = new Conta("Alisson Queiroz", "alisson@habbora.com.br", "99721808aA!");
		
		System.out.println(conta.toString());

	}

}
