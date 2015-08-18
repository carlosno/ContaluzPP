package com.br.puccampinas.equipamentos;


public class Tanquinho extends Motor {
	private int capacidadeKg;

	// Construtores
	Tanquinho() {
		super();
		this.capacidadeKg = 0;
	}

	Tanquinho(String nome, float potencia, int qtd, int qtdHora, int qtdDia,
			int capacidadeKg) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
		this.capacidadeKg = capacidadeKg;
	}

	// Getters and Setters
	public int getCapacidadeKg() {
		return capacidadeKg;
	}

	public void setCapacidadeKg(int capacidadeKg) {
		this.capacidadeKg = capacidadeKg;
	}
}
