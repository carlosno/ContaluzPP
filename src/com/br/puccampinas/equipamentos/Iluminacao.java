package com.br.puccampinas.equipamentos;
public class Iluminacao extends Equipamento {
	private int lumen;

	// Construtores
	Iluminacao() {
		super();
		this.lumen = 0;
	}

	Iluminacao(String nome, float potencia, int qtd, int qtdHora, int qtdDia, int lumen) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
		this.lumen = lumen;
	}

	// Getters and Setters
	public int getLumen() {
		return lumen;
	}

	public void setLumen(int lumen) {
		this.lumen = lumen;
	}
}
