package com.br.puccampinas.parametrizacaoGeral;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Cadastro_parametrizacaoGeral extends JFrame implements
		ActionListener {
	private static final long serialVersionUID = 1L;
	
	ParametrizacaoGeral PG = new ParametrizacaoGeral();
	

	JFrame jf_tela_cadastro_paramGeral = new JFrame("Parametrizacao Geral");

	JLabel jl_percent_bandeira_verde = new JLabel("Bandeira verde (%)");
	JLabel jl_percent_bandeira_amarela = new JLabel("Bandeira amarela (%)");
	JLabel jl_percent_bandeira_vermelha = new JLabel("Bandeira vermelha (%)");
	JLabel jl_percent_icms = new JLabel("ICMS (%)");
	JLabel jl_percent_pis_cofins = new JLabel("PIS - Cofins (%)");
	JLabel jl_tarifa = new JLabel("Tarifa (R$)");

	JTextField jtf_percent_bandeira_verde = new JTextField();
	JTextField jtf_percent_bandeira_amarela = new JTextField();
	JTextField jtf_percent_bandeira_vermelha = new JTextField();
	JTextField jtf_percent_icms = new JTextField();
	JTextField jtf_percent_pis_cofins = new JTextField();
	JTextField jtf_tarifa = new JTextField();

	JButton Jbtn_salvar = new JButton("Salvar");

	public void inicializar() {

	jf_tela_cadastro_paramGeral.setSize(270, 480);
	jf_tela_cadastro_paramGeral.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	jf_tela_cadastro_paramGeral.setLayout(null);
	jf_tela_cadastro_paramGeral.setLocationRelativeTo(null);

	jtf_percent_icms.setColumns(8);
	jtf_percent_pis_cofins.setColumns(8);
	jtf_percent_bandeira_verde.setColumns(8);
	jtf_percent_bandeira_amarela.setColumns(8);
	jtf_percent_bandeira_vermelha.setColumns(8);
	jtf_tarifa.setColumns(8);

	Jbtn_salvar.addActionListener(this);

	// set bounds
	jl_percent_icms.setBounds(30, 10, 50, 30);
	jtf_percent_icms.setBounds(30, 35, 50, 30);
	
	jl_percent_pis_cofins.setBounds(30, 70, 100, 30);
	jtf_percent_pis_cofins.setBounds(30, 95, 50, 30);

	jl_tarifa.setBounds(30, 130, 100, 30);
	jtf_tarifa.setBounds(30, 155, 50, 30);
	
	jl_percent_bandeira_verde.setBounds(30, 190, 200, 30);
	jtf_percent_bandeira_verde.setBounds(30, 215, 50, 30);
	
	jl_percent_bandeira_amarela.setBounds(30, 250, 200, 30);
	jtf_percent_bandeira_amarela.setBounds(30, 275, 50, 30);
	
	jl_percent_bandeira_vermelha.setBounds(30, 310, 200, 30);
	jtf_percent_bandeira_vermelha.setBounds(30, 335, 50, 30);

	JSeparator linha_separadora = new JSeparator(SwingConstants.HORIZONTAL);
	linha_separadora.setBounds(0, 380, 800, 1); // definir posicao da linha
													// !!

	Jbtn_salvar.setBounds(30, 400, 200, 40);
	
	// iniciar com valores 
	jtf_percent_icms.setText(String.valueOf(PG.getPercentual_icms()));
	jtf_percent_pis_cofins.setText(String.valueOf(PG.getPercentual_pis_cofins()));
	jtf_tarifa.setText(String.valueOf(PG.getTarifa()));
	jtf_percent_bandeira_amarela.setText(String.valueOf(PG.getPercentual_bandeira_amarela()));
	jtf_percent_bandeira_verde.setText(String.valueOf(PG.getPercentual_bandeira_verde()));
	jtf_percent_bandeira_vermelha.setText(String.valueOf(PG.getPercentual_bandeira_vermelha()));
	
	
	
	jf_tela_cadastro_paramGeral.add(jl_percent_icms);
	jf_tela_cadastro_paramGeral.add(jtf_percent_icms);
	jf_tela_cadastro_paramGeral.add(jl_percent_pis_cofins);
	jf_tela_cadastro_paramGeral.add(jtf_percent_pis_cofins);
	jf_tela_cadastro_paramGeral.add(jl_tarifa);
	jf_tela_cadastro_paramGeral.add(jtf_tarifa);
	jf_tela_cadastro_paramGeral.add(jl_percent_bandeira_verde);
	jf_tela_cadastro_paramGeral.add(jtf_percent_bandeira_verde);
	jf_tela_cadastro_paramGeral.add(jl_percent_bandeira_amarela);
	jf_tela_cadastro_paramGeral.add(jtf_percent_bandeira_amarela);
	jf_tela_cadastro_paramGeral.add(jl_percent_bandeira_vermelha);
	jf_tela_cadastro_paramGeral.add(jtf_percent_bandeira_vermelha);
	jf_tela_cadastro_paramGeral.add(linha_separadora);
	jf_tela_cadastro_paramGeral.add(Jbtn_salvar);
	
	jf_tela_cadastro_paramGeral.setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == Jbtn_salvar) {
		
			try {
								
				PG.setPercentual_bandeira_verde(Float.parseFloat(jtf_percent_bandeira_verde.getText()));
				PG.setPercentual_bandeira_amarela(Float.parseFloat(jtf_percent_bandeira_amarela.getText()));
				PG.setPercentual_bandeira_vermelha(Float.parseFloat(jtf_percent_bandeira_vermelha.getText()));
				PG.setPercentual_icms(Float.parseFloat(jtf_percent_icms.getText()));
				PG.setPercentual_pis_cofins(Float.parseFloat(jtf_percent_pis_cofins.getText()));
				PG.setTarifa(Float.parseFloat(jtf_tarifa.getText()));
				jf_tela_cadastro_paramGeral.dispose();
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Parametro invalido");
			}
			
			
			
			
		}
	}

}
