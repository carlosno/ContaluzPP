package com.br.puccampinas.equipamentos;


public class Ventilador extends Motor {
	
	// Construtores
	Ventilador() {
		super();
	}

	Ventilador(String nome, float potencia, int qtd, int qtdHora, int qtdDia) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
	}
}
