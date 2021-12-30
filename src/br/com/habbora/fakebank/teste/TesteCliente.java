package br.com.habbora.fakebank.teste;

import br.com.habbora.fakebank.modelos.Conta;

public class TesteCliente {
		
		public static void main(String[] args) {
			
			Conta c = new Conta("Alisson Queiroz de Azevêdo", "alisson.queirois@gmail.com", "99721808aA!");
			Conta c2 = new Conta("Vitor de Santana", "vitor@vitor", "12345");
			System.out.println(c.toString());
//			
//			System.out.println(c.depositar(100.0));
//			System.out.println(c.getSaldo());
//			c.sacar(50.0, "99721808aA!");
//			System.out.println(c.getSaldo());
//			System.out.println(c.tranferir(c2, 25.0, "99721808aA!"));
//			System.out.println(c.getSaldo());
//			System.out.println(c2.getSaldo());
			
		}
		
}
