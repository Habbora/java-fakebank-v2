package br.com.habbora.fakebank.modelos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Contas implements Serializable {
	
	private static final long serialVersionUID = 2L;
	private ArrayList<Conta> banco;
	
	
	public Contas(String arquivo) throws IOException, ClassNotFoundException {
		try {this.load(arquivo); }
		catch (Exception e) {banco = new ArrayList<>(); }
	}
	
	public void save(String arquivo) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo));
		oos.writeObject(this.banco);
		oos.close();
	}
	
	@SuppressWarnings("unchecked")
	private void load(String arquivo) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
		this.banco =  (ArrayList<Conta>) ois.readObject();
		ois.close();
		
	}
	
	public void add(Conta conta) throws IOException {
		conta.setConta(Integer.toUnsignedLong(this.banco.size()));
		this.banco.add(conta);
		Collections.sort(banco);
	}
	
	public void remove(Conta conta) {
		
	}
	
	
	
	@Override
	public String toString() {
		
		String string = "";
		
		for (Conta conta : banco) {
			string = string + "Conta: " + conta.getConta() + ", " + conta.toString() + "\n";
		}
		
		return string;
	}
	
	public Boolean tranferir(Conta contaOrigem, Long contaDestino, Double valor, String senha) {
		
		Conta refContaOrigem = null;
		Conta refContaDestino = null;
		
		for (Conta conta : banco) {
			if(conta.equals(contaOrigem)) refContaOrigem = conta;
			if(conta.getConta().equals(contaDestino)) refContaDestino = conta;
		}
		
		if(refContaOrigem == null) {
			System.out.println("Conta de origem invalida!");
			return false;
		}
		
		if(refContaDestino == null) {
			System.out.println("Conta de destino invalida!");
			return false;
		}
		
		if(refContaOrigem.senhaIsValid(senha)) {
			if(refContaOrigem.sacar(valor)) {
				refContaDestino.depositar(valor);
				System.out.println("Tranferencia efetuada!");
				return true;
			}
			else {
				System.out.println("Saldo insuficiente!");
				return false;
			}
			
		}
		
		System.out.println("Senha incorreta!");
		return false;
	}
	
	public Conta getConta(Long conta, String senha) {
		for (Conta contas : banco) {
			if(contas.getConta().equals(conta)) {
				if(contas.senhaIsValid(senha)) return contas;
				return null;
			}
		}
		return null;
	}

	public Conta getConta(String email, String senha) {
		for (Conta contas : banco) {
			if(contas.getEmail().equals(email)) {
				if(contas.senhaIsValid(senha)) {
					System.out.println("Conta encontrada!");
					return contas;
				}
				System.out.println("Senha Incorreta!");
				return null;
			}
		}
		System.out.println("Conta não encontrada!");
		return null;
	}



}
