package exercicio_01B;

import java.util.Objects;
import java.util.Scanner;

public class Produto {
	private int ID;
	private double preco;
	private String nome;
	public Produto(int ID, double preco, String nome) {
		this.ID = ID;
		this.preco=preco;
		this.nome=nome;
	}
	
	
	@Override
	public String toString() {
		return "ID:" + ID + "\nPreco:" + preco + "\nNome:" + nome;
	}


	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getID());
	}

	@Override
	public boolean equals(Object obj) {
		Produto p = (Produto)obj;
		if(this.getID()==p.getID())
			return true;
		else
			return false;
	}
	
	
	
	
	

}
