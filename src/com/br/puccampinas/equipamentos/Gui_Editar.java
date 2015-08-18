package com.br.puccampinas.equipamentos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;




public class Gui_Editar implements ActionListener{
	
	private int posicaoObj;
	
	private Equipamento ep = new Equipamento();
	
	

	

	JFrame jf_tela_editar_equipamento = new JFrame("Edição de equipamento");
	JLabel jl_tipo_equipamento = new JLabel("Tipo Equipamento: ");
	JLabel jl_tipo_equipamentoNome = new JLabel("");
	JLabel jl_nome = new JLabel("Nome");
	JLabel jl_potencia = new JLabel("Potencia");
	JTextField jtf_nome = new JTextField();
	JTextField jtf_potencia = new JTextField();
	JButton jbtn_cancelar = new JButton("Cancelar");
	JButton jbtn_salvar = new JButton("Salvar");
	JSeparator linha_separadora = new JSeparator(SwingConstants.HORIZONTAL);

	public void inicializar() {
			
		jf_tela_editar_equipamento.setSize(270, 300);
		jf_tela_editar_equipamento.setAlwaysOnTop (true);
		//jf_tela_editar_equipamento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		jf_tela_editar_equipamento.setLayout(null);
		//jf_tela_editar_equipamento.setLocationRelativeTo(null);
		jtf_nome.setColumns(40);
		jtf_potencia.setColumns(40);

		//jbtn_salvar.addActionListener(this);

		// set bounds
		jl_tipo_equipamento.setBounds(30, 10, 200, 30);
		jl_tipo_equipamentoNome.setBounds(30, 35, 200, 30);
		jl_nome.setBounds(30, 70, 200, 30);
		jtf_nome.setBounds(30, 95, 200, 30);
		jl_potencia.setBounds(30, 130, 200, 30);
		jtf_potencia.setBounds(30, 155, 200, 30);
		linha_separadora.setBounds(0, 200, 800, 1); // definir posicao da linha !!
		jbtn_cancelar.setBounds(15, 215, 110, 40);
		jbtn_salvar.setBounds(135, 215, 110, 40);		
		
	jtf_nome.setText(ep.getNome());
	jtf_potencia.setText(String.valueOf(ep.getPotencia()));
	jl_tipo_equipamentoNome.setText(ep.getClass().getSuperclass().getName().substring(32));
	
		jbtn_salvar.addActionListener(this);
		jbtn_cancelar.addActionListener(this);
		jf_tela_editar_equipamento.add(jl_tipo_equipamento);
		jf_tela_editar_equipamento.add(jl_tipo_equipamentoNome);
		jf_tela_editar_equipamento.add(jl_nome);
		jf_tela_editar_equipamento.add(jtf_nome);
		jf_tela_editar_equipamento.add(jtf_potencia);
		jf_tela_editar_equipamento.add(jl_potencia);
		jf_tela_editar_equipamento.add(jbtn_cancelar);
		jf_tela_editar_equipamento.add(jbtn_salvar);
		jf_tela_editar_equipamento.add(linha_separadora);
		jf_tela_editar_equipamento.setVisible(true);
	}
	
	public Equipamento getEp() {
		return ep;
	}

	public void setEp(Equipamento ep) {
		this.ep = ep;
	}
	
	public int getPosicaoObj() {
		return posicaoObj;
	}

	public void setPosicaoObj(int posicaoObj) {
		this.posicaoObj = posicaoObj;
	}
	
	public JLabel getJl_tipo_equipamentoNome() {
		return jl_tipo_equipamentoNome;
	}

	public void setJl_tipo_equipamentoNome(String string) {
		this.jl_tipo_equipamentoNome.setText(string);
	}

	public String getNome(){
		return jl_nome.getText();
	}
	
	public String getPotenia(){
		return jl_potencia.getText();
	}
	
	
	public void setNome(String n){
		this.jtf_nome.setText(n);
	}
	
	public void setPotenia(String p){
		this.jtf_potencia.setText(p);
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		
		
		if(arg.getSource() == jbtn_salvar){


			try {
				
				ep.setNome(jtf_nome.getText());
				ep.setPotencia(Float.parseFloat(jtf_potencia.getText()));
				
				if (Float.parseFloat(jtf_potencia.getText())<1) {
					throw new Exception();
				}
				
				jf_tela_editar_equipamento.dispose();
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Parametro invalido");
			}
			
				
		}
	
	
		if(arg.getSource() == jbtn_cancelar){


		
				jf_tela_editar_equipamento.dispose();
				
			
			
				
		}
	
	
	
	
	}




}




