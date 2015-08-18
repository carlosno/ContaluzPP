package com.br.puccampinas.equipamentos;
public class AparelhoSom extends Eletronico {

	private int volumeMax;
	private boolean am;
	private boolean fm;
	private boolean cd;
	private boolean bluetooth;

	// Construtores
	AparelhoSom() {
		super();
		this.volumeMax = 0;
		this.am = false;
		this.fm = false;
		this.cd = false;
		this.bluetooth = false;
		
	}

	public AparelhoSom(String nome, float potencia, int qtd, int qtdHora, int qtdDia
			) {
		super(nome, potencia, qtd, qtdHora, qtdDia);
	
	}

	// Getters and Setters
	public int getVolumeMax() {
		return volumeMax;
	}

	public void setVolumeMax(int volumeMax) {
		this.volumeMax = volumeMax;
	}

	public boolean isAm() {
		return am;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public boolean isFm() {
		return fm;
	}

	public void setFm(boolean fm) {
		this.fm = fm;
	}

	public boolean isCd() {
		return cd;
	}

	public void setCd(boolean cd) {
		this.cd = cd;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
}
