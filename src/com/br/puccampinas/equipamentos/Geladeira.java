package com.br.puccampinas.equipamentos;
public class Geladeira extends Refrigerador {
	private int qtdPorta;
	private boolean frostFree;

	// Construtores
	public Geladeira() {
		super();
		this.qtdPorta = 1;
		this.frostFree = false;
	}

	public Geladeira(String nome, float potencia, int qtd, int qtdHora, int qtdDia) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
		
	}

	// Getters and Setters
	public int getQtdPorta() {
		return qtdPorta;
	}

	public void setQtdPorta(int qtdPorta) {
		this.qtdPorta = qtdPorta;
	}

	public boolean isFrostFree() {
		return frostFree;
	}

	public void setFrostFree(boolean frostFree) {
		this.frostFree = frostFree;
	}
}
