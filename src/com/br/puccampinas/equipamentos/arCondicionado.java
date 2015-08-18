package com.br.puccampinas.equipamentos;

public class arCondicionado extends CondicionadorAr{
	private int btu;

	
	public arCondicionado(String nome, float potencia, int qtd, int qtdHora, int qtdDia) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
	}
	//Getters and Setters
	public int getBtu() {
		return btu;
	}
	public void setBtu(int btu) {
		this.btu = btu;
	}
}
