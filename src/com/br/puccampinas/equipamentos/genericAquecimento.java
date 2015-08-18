package com.br.puccampinas.equipamentos;
public class genericAquecimento extends Aquecimento {

	// Construtores
	genericAquecimento() {
		super();
	}

	genericAquecimento(String nome, float potencia, int qtd, int qtdHora, int qtdDia) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
	}
}
