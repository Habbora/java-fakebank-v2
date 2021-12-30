package br.com.habbora.fakebank.teste;

import java.io.IOException;

import br.com.habbora.fakebank.modelos.Contas;

public class TesteLerBancoClientes {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String arquivo = "bancoDeContas.bin";
		Contas banco = new Contas(arquivo);
		
		System.out.println(banco.toString());
		
		banco.save(arquivo);
		
	}
	
}
