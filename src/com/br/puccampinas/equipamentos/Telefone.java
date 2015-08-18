package com.br.puccampinas.equipamentos;
public class Telefone extends Eletronico {
	private boolean fio;

	// Construtores
	Telefone() {
		super();
		this.fio = false;
	}

	Telefone(String nome, float potencia, int qtd, int qtdHora, int qtdDia, boolean fio) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
		this.fio = fio;
	}

	// Getters and Setters
	public boolean isFio() {
		return fio;
	}

	public void setFio(boolean fio) {
		this.fio = fio;
	}

}
