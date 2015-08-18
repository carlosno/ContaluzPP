package Simulação;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import com.br.puccampinas.parametrizacaoGeral.Cadastro_parametrizacaoGeral;
import com.br.puccampinas.parametrizacaoGeral.ParametrizacaoGeral;

public class Gui_Menu_Principal extends JFrame implements ActionListener {
//Componentes
	JFrame jf_tela_principal = new JFrame("Conta Facil");
	JMenuBar barraMenu = new JMenuBar();
	JMenuItem menu_repositorio = new JMenuItem("Repositorio");
	JMenuItem menu_parametrizacao = new JMenuItem("Parametrização");
	JMenuItem menu_sair = new JMenuItem("Sair");
	JButton botao1 = new JButton("SIMULAÇÃO");

//Montagem e configura��o da tela
	public void montaTela(){
		jf_tela_principal.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		jf_tela_principal.setLayout(null);
		jf_tela_principal. setExtendedState(Frame.MAXIMIZED_BOTH);
		botao1.addActionListener(this);
		//margemX, margemY, largura, altura 
		barraMenu.setBounds(0, 0, 400, 30);
		JSeparator linha_separadora = new JSeparator(SwingConstants.HORIZONTAL);
		linha_separadora.setBounds(0, 30, 2000, 1);
		botao1.setBounds(800, 300, 200, 100);
		//botão
		jf_tela_principal.add(botao1);
		//Configurar os itens do menu para disparar eventos
		menu_repositorio.addActionListener(this);
		menu_parametrizacao.addActionListener(this);
		menu_sair.addActionListener(this);
		//Adicionar os menus na barra de menu
		barraMenu.add(menu_repositorio);
		barraMenu.add(menu_parametrizacao);
		barraMenu.add(menu_sair);
		//Adicionar a barra na tela
		jf_tela_principal.add(barraMenu);
		jf_tela_principal.add(linha_separadora);
		jf_tela_principal.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == menu_repositorio){
			Gui_Manter_Repositorio rm = new Gui_Manter_Repositorio();
			rm.montaTela();
		}
		if(arg0.getSource() == botao1){
			Gui_Simulacao b = new Gui_Simulacao();
			b.montaTela();
		}
		if(arg0.getSource() == menu_parametrizacao){
			Cadastro_parametrizacaoGeral cadP = new Cadastro_parametrizacaoGeral();
			cadP.inicializar();
		}
		if(arg0.getSource() == menu_sair){
			System.exit(0);
		}
	}
			
	public static void main(String[] args) {
		// iniciando repositorio
		Gui_Manter_Repositorio mr = new Gui_Manter_Repositorio();
		mr.populaRepositorioEquipamento();
		ParametrizacaoGeral PG = new ParametrizacaoGeral();
		
		
		new Gui_Menu_Principal().montaTela();
		
		
		
		
		
	}
}