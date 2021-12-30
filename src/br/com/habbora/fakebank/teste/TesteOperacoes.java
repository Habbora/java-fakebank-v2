package br.com.habbora.fakebank.teste;

import java.io.IOException;

import br.com.habbora.fakebank.modelos.Conta;
import br.com.habbora.fakebank.modelos.Contas;

public class TesteOperacoes {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		String arquivo = "bancoDeContas.bin";
		Contas banco = new Contas(arquivo);
		Conta conta = banco.getConta( "vitor", "1234");
		
		System.out.println(banco);
		
		conta.depositar(200.0);
		
		System.out.println(banco);
		
		banco.tranferir(conta, 0L, 100.0, "1234");
		
		System.out.println(banco);
		
		System.out.println(conta);
		
		
	}

}
