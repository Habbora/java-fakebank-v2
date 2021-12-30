package br.com.habbora.fakebank.teste;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import br.com.habbora.fakebank.modelos.Contas;
import br.com.habbora.fakebank.modelos.Conta;

public class TesteCriarContaConsole {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String arquivo = "bancoDeContas.bin";
		Contas banco = new Contas(arquivo);
		
		Scanner bis = new Scanner(new InputStreamReader(System.in));
		
		System.out.println("Vamos criar uma nova conta para você:");
		System.out.print("Digite seu Nome: ");
		String nome  = bis.nextLine();
		System.out.print("Digite seu E-mail: ");
		String email = bis.nextLine();
		System.out.print("Digite sua nova senha: ");
		String senha = bis.nextLine();
		
		Conta cliente = new Conta(nome, email, senha);
		
		bis.close();
		
		System.out.println("Sua nova conta é:");
		System.out.println("Titular: " + cliente.getNome());
		System.out.println("E-mail : " + cliente.getEmail());
		
		
		banco.add(cliente);
		banco.save(arquivo);
		
	}
	
}
