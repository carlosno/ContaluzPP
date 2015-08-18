package com.br.puccampinas.equipamentos;
public class Computador extends Eletronico {

	private int memoriaRam;
	private String processador;
	private int hd;
	private String placaMae;

	// Getters and Setters
	
	public Computador(String nome, float potencia, int qtd, int qtdHora, int qtdDia) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
	}
	
	
	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getHd() {
		return hd;
	}

	public void setHd(int hd) {
		this.hd = hd;
	}

	public String getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(String placaMae) {
		this.placaMae = placaMae;
	}
}
