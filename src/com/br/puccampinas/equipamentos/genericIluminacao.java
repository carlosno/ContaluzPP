package com.br.puccampinas.equipamentos;
public class genericIluminacao extends Iluminacao {
	private int lumen;

	// Construtores
	genericIluminacao() {
		super();
		this.lumen = 0;
	}

	genericIluminacao(String nome, float potencia, int qtd, int qtdHora, int qtdDia, int lumen) {
		super(nome, potencia, qtd, qtdHora, qtdDia, lumen);
		this.lumen = lumen;
	}

	// Getters and Setters
	@Override
	public int getLumen() {
		return lumen;
	}

	@Override
	public void setLumen(int lumen) {
		this.lumen = lumen;
	}
}
