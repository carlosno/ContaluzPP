package com.br.puccampinas.equipamentos;
public class Microondas extends Aquecimento {
	private float litragem;

	// Construtores
	public Microondas() {
		super();
		this.litragem = 0;
	}

	public Microondas(String nome, float potencia, int qtd, int qtdHora, int qtdDia) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
		
	}

	// Getters and Setters
	public float getLitragem() {
		return litragem;
	}

	public void setLitragem(float litragem) {
		this.litragem = litragem;
	}
}
