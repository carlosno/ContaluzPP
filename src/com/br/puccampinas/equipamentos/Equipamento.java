package com.br.puccampinas.equipamentos;

public class Equipamento {
	private String nome;
	private float potencia;
	private int qtd;
	private int qtdHora;
	private int qtdDia;
	
	//Construtores
	Equipamento (){
		this.setNome("");
		this.setPotencia(0);
		this.setQtd(0);
		this.setQtdHora(0);
		this.setQtdDia(0);
	}
	Equipamento (String nome, float potencia, int qtd, int qtdHora, int qtdDia){
		this.setNome(nome);
		this.setPotencia(potencia);
		this.setQtdDia(qtd);
		this.setQtdHora(qtdHora);
		this.setQtdDia(qtdDia);
	}

	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public int getQtdHora() {
		return qtdHora;
	}
	public void setQtdHora(int qtdHora) {
		this.qtdHora = qtdHora;
	}
	public int getQtdDia() {
		return qtdDia;
	}
	public void setQtdDia(int qtdDia) {
		this.qtdDia = qtdDia;
	}
}