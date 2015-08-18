package Simulação;

import java.util.ArrayList;

import com.br.puccampinas.equipamentos.Equipamento;
import com.br.puccampinas.parametrizacaoGeral.ParametrizacaoGeral;

public class Simulacao {

		
	private float Khw;
	private float KhwTarifado;
	private float ValorConta;
	private float ValorICMS;
	private float ValorPIS;
	private float ValorContaBandeiraVerde;
	private float ValorContaBandeiraAmarela;
	private float ValorContaBandeiraVermelha;
	
	
	public float calculaKhw(ArrayList<Equipamento> ep){
		
		float qtdKhw=0;
		
		
		for(int i=0;i<ep.size();i++){
		
			
			qtdKhw+=(ep.get(i).getPotencia()*ep.get(i).getQtdDia()*ep.get(i).getQtdHora()*ep.get(i).getQtd())/1000;	
		
					
		}	
		return qtdKhw;	
		
	}
	
	
	
	public float calculaConta(ArrayList<Equipamento> ep,ParametrizacaoGeral PG){
		
		this.Khw = calculaKhw(ep);
				
		this.KhwTarifado=Khw*PG.getTarifa();
		
		this.ValorICMS=KhwTarifado*PG.getPercentual_icms();
		
		this.ValorPIS=KhwTarifado*PG.getPercentual_pis_cofins();
		
		this.ValorConta=KhwTarifado+ValorICMS+ValorPIS;
		
		return ValorConta;
	}
	
	public void calculaBandeira(ParametrizacaoGeral PG){

		int qtdBandeira;
		
		qtdBandeira=(int) (Khw/100);
		
		this.ValorContaBandeiraVerde=ValorConta+(PG.getPercentual_bandeira_verde()*qtdBandeira);
		this.ValorContaBandeiraAmarela=ValorConta+(PG.getPercentual_bandeira_amarela()*qtdBandeira);
		this.ValorContaBandeiraVermelha=ValorConta+(PG.getPercentual_bandeira_vermelha()*qtdBandeira);
	
	}
	
	
	
	public float getKhw() {
		return Khw;
	}



	public void setKhw(float khw) {
		Khw = khw;
	}



	public float getKhwTarifado() {
		return KhwTarifado;
	}



	public void setKhwTarifado(float khwTarifado) {
		KhwTarifado = khwTarifado;
	}



	public float getValorConta() {
		return ValorConta;
	}



	public void setValorConta(float valorConta) {
		ValorConta = valorConta;
	}



	public float getValorContaBandeiraVerde() {
		return ValorContaBandeiraVerde;
	}



	public void setValorContaBandeiraVerde(float valorContaBandeiraVerde) {
		ValorContaBandeiraVerde = valorContaBandeiraVerde;
	}



	public float getValorContaBandeiraAmarela() {
		return ValorContaBandeiraAmarela;
	}



	public void setValorContaBandeiraAmarela(float valorContaBandeiraAmarela) {
		ValorContaBandeiraAmarela = valorContaBandeiraAmarela;
	}



	public float getValorContaBandeiraVermelha() {
		return ValorContaBandeiraVermelha;
	}



	public void setValorContaBandeiraVermelha(float valorContaBandeiraVermelha) {
		ValorContaBandeiraVermelha = valorContaBandeiraVermelha;
	}

	

	public float getValorICMS() {
		return ValorICMS;
	}



	public void setValorICMS(float valorICMS) {
		ValorICMS = valorICMS;
	}



	public float getValorPIS() {
		return ValorPIS;
	}



	public void setValorPIS(float valorPIS) {
		ValorPIS = valorPIS;
	}



	public static void main(String[] args) {

		
		
	}
}