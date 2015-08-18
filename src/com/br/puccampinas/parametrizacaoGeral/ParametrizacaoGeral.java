package com.br.puccampinas.parametrizacaoGeral;
public class ParametrizacaoGeral {
	private static float percentual_icms= (float) 0.25;
	private static float percentual_pis_cofins=(float) 0.05;
	private static float tarifa=(float) 0.49;
	private static float percentual_bandeira_verde =0;
	private static float percentual_bandeira_amarela=(float) 2.50;
	private static float percentual_bandeira_vermelha=(float) 5.50;
	
	//Getters and Setters
	public float getPercentual_icms() {
		return percentual_icms;
	}
	
	public void setPercentual_icms(float d) {
		ParametrizacaoGeral.percentual_icms = d;
	}
	public float getPercentual_pis_cofins() {
		return percentual_pis_cofins;
	}
	public void setPercentual_pis_cofins(float percentual_pis_cofins) {
		ParametrizacaoGeral.percentual_pis_cofins = percentual_pis_cofins;
	}
	public float getTarifa() {
		return tarifa;
	}
	public void setTarifa(float tarifa) {
		ParametrizacaoGeral.tarifa = tarifa;
	}
	public float getPercentual_bandeira_verde() {
		return percentual_bandeira_verde;
	}
	public void setPercentual_bandeira_verde(float percentual_bandeira_verde) {
		ParametrizacaoGeral.percentual_bandeira_verde = percentual_bandeira_verde;
	}
	public float getPercentual_bandeira_amarela() {
		return percentual_bandeira_amarela;
	}
	public void setPercentual_bandeira_amarela(float percentual_bandeira_amarela) {
		ParametrizacaoGeral.percentual_bandeira_amarela = percentual_bandeira_amarela;
	}
	public float getPercentual_bandeira_vermelha() {
		return percentual_bandeira_vermelha;
	}
	public void setPercentual_bandeira_vermelha(float percentual_bandeira_vermelha) {
		ParametrizacaoGeral.percentual_bandeira_vermelha = percentual_bandeira_vermelha;
	}
}
