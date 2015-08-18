package com.br.puccampinas.equipamentos;
public class Freezer extends Refrigerador {
	private boolean vertical;

	// Construtores
	public Freezer() {
		super();
		this.vertical = false;
	}

	public Freezer(String nome, float potencia, int qtd, int qtdHora, int qtdDia
			) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
		
	}

	// Getters and Setters
	public boolean isVertical() {
		return vertical;
	}

	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}

}
