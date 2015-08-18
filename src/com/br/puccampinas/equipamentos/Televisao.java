package com.br.puccampinas.equipamentos;
public class Televisao extends Eletronico {
	private int polegada;

	// Construtores
	Televisao() {
		super();
		this.polegada = 0;
	}

	public Televisao(String nome, float potencia, int qtd, int qtdHora, int qtdDia) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
		
	}

	// Getters and Setters
	public int getPolegada() {
		return polegada;
	}

	public void setPolegada(int polegada) {
		this.polegada = polegada;
	}
}
