package com.br.puccampinas.equipamentos;
public class Aquecimento extends Equipamento {

	// Construtores
	Aquecimento() {
		super();
	}

	public Aquecimento(String nome, float potencia, int qtd, int qtdHora, int qtdDia) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
	}
}
