package com.br.puccampinas.equipamentos;
public class lampadaLed extends Iluminacao {

	// Construtores
	public lampadaLed() {
		super();
	}

	public lampadaLed(String nome, float potencia, int qtd, int qtdHora, int qtdDia, int lumen) {
		super(nome, potencia, qtd, qtdHora, qtdDia, lumen);
	}
}
