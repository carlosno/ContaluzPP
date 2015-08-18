package com.br.puccampinas.equipamentos;

import java.io.Serializable;



public class CirculadorAr extends Motor implements Serializable {
	
	// Construtores
	public CirculadorAr() {
		super();
	}

	public CirculadorAr(String nome, float potencia, int qtd, int qtdHora, int qtdDia) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
	}
}
