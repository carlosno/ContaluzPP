package com.br.puccampinas.equipamentos;


public class lavadoraRoupa extends Motor {
	private int capacidadeKg;

	// Construtores
	public lavadoraRoupa() {
		super();
		this.capacidadeKg = 0;
	}

	public lavadoraRoupa(String nome, float potencia, int qtd, int qtdHora, int qtdDia){
		super(nome, potencia, qtd, qtdHora, qtdDia);
		
	}

	// Getters and Setters
	public int getCapacidadeKg() {
		return capacidadeKg;
	}

	public void setCapacidadeKg(int capacidadeKg) {
		this.capacidadeKg = capacidadeKg;
	}
}
