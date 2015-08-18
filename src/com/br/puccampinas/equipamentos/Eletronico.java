package com.br.puccampinas.equipamentos;

import java.io.Serializable;

public class Eletronico extends Equipamento implements Serializable {

	// Construtores
	Eletronico() {
		super();
	}

	Eletronico(String nome, float potencia, int qtd, int qtdHora, int qtdDia) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
	}
}
