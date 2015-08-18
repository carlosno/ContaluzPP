package com.br.puccampinas.equipamentos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Simulação.*;

public class Gui_Cadastro extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	JFrame jf_tela_cadastro_equipamento = new JFrame("Cadastro de equipamento");
	JLabel jl_tipo_equipamento = new JLabel("Tipo Equipamento");
	JLabel jl_nome = new JLabel("Nome");
	JLabel jl_potencia = new JLabel("Potencia");
	JTextField jtf_nome = new JTextField();
	JTextField jtf_potencia = new JTextField();
	JButton Jbtn_cadastrar = new JButton("Cadastrar");

	static public String[] lista_tipo_equipamento = new String[] {"Iluminação","Motores","Refrigeracao","Eletrônico","Condicionadores de ar","Aquecimento"};

	JComboBox<String> jcb_tipo_equipamento = new JComboBox<>(
			lista_tipo_equipamento);

	public void inicializar() {

		jf_tela_cadastro_equipamento.setSize(270, 300);
		jf_tela_cadastro_equipamento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		jf_tela_cadastro_equipamento.setLayout(null);
		//jf_tela_cadastro_equipamento.setLocationRelativeTo(null);
		jf_tela_cadastro_equipamento.setAlwaysOnTop (true);
		
		jtf_nome.setColumns(40);
		jtf_potencia.setColumns(40);

		Jbtn_cadastrar.addActionListener(this);

		// set bounds
		jl_nome.setBounds(30, 10, 200, 30);
		jtf_nome.setBounds(30, 35, 200, 30);
		
		jl_tipo_equipamento.setBounds(30, 70, 200, 30);
		jcb_tipo_equipamento.setBounds(30, 95, 200, 30);

		jl_potencia.setBounds(30, 130, 200, 30);
		jtf_potencia.setBounds(30, 155, 200, 30);

		JSeparator linha_separadora = new JSeparator(SwingConstants.HORIZONTAL);
		linha_separadora.setBounds(0, 200, 800, 1); // definir posicao da linha !!

		Jbtn_cadastrar.setBounds(30, 215, 200, 40);		
		
		jf_tela_cadastro_equipamento.add(jl_tipo_equipamento);
		jf_tela_cadastro_equipamento.add(jcb_tipo_equipamento);

		jf_tela_cadastro_equipamento.add(jtf_nome);
		jf_tela_cadastro_equipamento.add(jl_nome);
		jf_tela_cadastro_equipamento.add(jtf_potencia);
		jf_tela_cadastro_equipamento.add(jl_potencia);
		
		jf_tela_cadastro_equipamento.add(Jbtn_cadastrar);

		jf_tela_cadastro_equipamento.add(linha_separadora);

		jf_tela_cadastro_equipamento.setVisible(true);
	}
	
	public String getNome(){
		
		return jl_nome.getText();
	}
	
	public String getPotenia(){
		
		return jl_potencia.getText();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Equipamento ep = new Equipamento();
		Gui_Manter_Repositorio mr = new Gui_Manter_Repositorio();
		
		
		String combo = (String) jcb_tipo_equipamento.getSelectedItem(); 
		
		if (arg0.getSource() == Jbtn_cadastrar) {
	
			
			try {
				
				if(combo.equals("Aquecimento")){
					
					genericAquecimento ge = new genericAquecimento();
					ge.setNome(jtf_nome.getText());	
					ge.setPotencia(Float.parseFloat(jtf_potencia.getText()));
					mr.setEquipRepositorioEquip(ge);
					jf_tela_cadastro_equipamento.dispose();
				
								
				}
				
				
				if(combo.equals("Condicionadores de ar")){
					
					genericCondicionadorAr ge = new genericCondicionadorAr();
					ge.setNome(jtf_nome.getText());	
					ge.setPotencia(Float.parseFloat(jtf_potencia.getText()));
					mr.setEquipRepositorioEquip(ge);
					jf_tela_cadastro_equipamento.dispose();
				
								
				}
				
				
				if(combo.equals("Refrigeracao")){
					
					genericRefrigerador ge = new genericRefrigerador();
					ge.setNome(jtf_nome.getText());	
					ge.setPotencia(Float.parseFloat(jtf_potencia.getText()));
					mr.setEquipRepositorioEquip(ge);
					jf_tela_cadastro_equipamento.dispose();
				
								
				}
				
				
				if(combo.equals("Motores")){
					
					genericMotor ge = new genericMotor();
					ge.setNome(jtf_nome.getText());	
					ge.setPotencia(Float.parseFloat(jtf_potencia.getText()));
					mr.setEquipRepositorioEquip(ge);
					jf_tela_cadastro_equipamento.dispose();
				
								
				}
				
				
				if(combo.equals("Iluminação")){
					
					genericIluminacao ge = new genericIluminacao();
					ge.setNome(jtf_nome.getText());	
					ge.setPotencia(Float.parseFloat(jtf_potencia.getText()));
					mr.setEquipRepositorioEquip(ge);
					jf_tela_cadastro_equipamento.dispose();
				
								
				}
				
				if(combo.equals("Eletrônico")){
					
					genericEletronico ge = new genericEletronico();
					ge.setNome(jtf_nome.getText());	
					ge.setPotencia(Float.parseFloat(jtf_potencia.getText()));
					mr.setEquipRepositorioEquip(ge);
					jf_tela_cadastro_equipamento.dispose();
										
								
				}
								
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Parametro invalido");
				jtf_nome.setText("");
				jtf_potencia.setText("");
			}
			
			
			
			
		
		
		}
		
			
	}
}
