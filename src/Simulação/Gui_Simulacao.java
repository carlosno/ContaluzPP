package Simulação;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import com.br.puccampinas.equipamentos.*;
import com.br.puccampinas.parametrizacaoGeral.ParametrizacaoGeral;

public class Gui_Simulacao extends JFrame implements ActionListener {

	static ArrayList<Equipamento> lista_resultado_busca;
	private ArrayList<Equipamento> lista_equipamento = new ArrayList<Equipamento>();
	private ArrayList<Equipamento> lista_equipamento_selecionado = new ArrayList<Equipamento>();;
	
	JFrame jf_tela_simulacao = new JFrame("Simulação de consumo");
	JScrollPane barra_rolagem_selecao_equipamento = new JScrollPane();
	JScrollPane barra_rolagem_equipamento_selecionado = new JScrollPane();
	JTextField jtf_nome = new JTextField();
	JLabel jl_nome = new JLabel("Nome do equipamento");
	JLabel jl_tipo_equipamento = new JLabel("Tipo de equipamento");
	JButton jbtn_buscar = new JButton("Buscar");
	JButton jbtn_adicionar = new JButton("Inserir");
	JButton jbtn_remover = new JButton("Remover");
	JButton jbtn_salvar = new JButton("Salvar");
	
	JLabel jl_meu_consumo = new JLabel("Meu consumo mensal");
	JPanel jp_kwh = new JPanel();
	JPanel jp_bandeira = new JPanel();
	JLabel jl_resultado_consumo = new JLabel("0 Kw/H");
	JLabel jl_resultado_consumoConta = new JLabel("");
	JLabel jl_resultado_consumoParam = new JLabel("");
	JTable tabela_selecao_equipamento;
	JTable tabela_equipamento_selecionado;
	
	static public String[] lista_tipo_equipamento = new String[] { "", "Iluminação", "Motores",
			"Refrigeracao", "Eletrônico", "Condicionadores de ar",
			"Aquecimento" };
	JComboBox<String> jcb_tipo_equipamento = new JComboBox<>(lista_tipo_equipamento);

	public void montaTela() {
		jf_tela_simulacao.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		jf_tela_simulacao.setLayout(null);
		jf_tela_simulacao.setSize(1130, 520);
		jf_tela_simulacao.setLocationRelativeTo(null);
		jp_kwh.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		jp_kwh.setLayout(null);
		jp_bandeira.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		jp_bandeira.setLayout(null);
		
		jbtn_buscar.addActionListener(this);
		jbtn_adicionar.addActionListener(this);
		jbtn_remover.addActionListener(this);
		jbtn_salvar.addActionListener(this);

		tabela_selecao_equipamento = new tabela().criar(lista_equipamento);
		tabela_selecao_equipamento.setSize(400, 300);

		tabela_equipamento_selecionado = new tabela().criar2(lista_equipamento);
		tabela_equipamento_selecionado.setSize(500, 400);

		barra_rolagem_selecao_equipamento = new JScrollPane(tabela_selecao_equipamento);
		barra_rolagem_equipamento_selecionado = new JScrollPane(tabela_equipamento_selecionado);

		JSeparator linha_separadora = new JSeparator(SwingConstants.HORIZONTAL);
		
		jl_meu_consumo.setAlignmentY(CENTER_ALIGNMENT);
		jl_resultado_consumo.setAlignmentX(RIGHT_ALIGNMENT);
		jl_resultado_consumoConta.setAlignmentX(RIGHT_ALIGNMENT);
		jl_resultado_consumoParam.setAlignmentX(RIGHT_ALIGNMENT);
		jl_meu_consumo.setFont(new Font("Arial", Font.BOLD, 20));
		
		//Definir tamanho e localização do componente na tela (x, y, width e height)
		jl_nome.setBounds(30, 10, 150, 30);
		jtf_nome.setBounds(30, 35, 150, 30);
		jl_tipo_equipamento.setBounds(190, 10, 190, 30);
		jcb_tipo_equipamento.setBounds(190, 35, 190, 30);
		jbtn_buscar.setBounds(395, 35, 115, 30);
		linha_separadora.setBounds(0, 80, 540, 1);
		jbtn_adicionar.setBounds(30, 95, 90, 30);
		jbtn_remover.setBounds(1000, 430, 90, 30);
		
		jbtn_salvar.setBounds(800, 430, 190, 30);
		
		barra_rolagem_selecao_equipamento.setBounds(30, 140, 480, 250);
		jl_meu_consumo.setBounds(570, 30, 400, 50);
		jl_resultado_consumo.setBounds(930, 40, 195, 30);
		jl_resultado_consumoConta.setBounds(580, 60, 2000, 130);
		jl_resultado_consumoParam.setBounds(900, 60, 2000, 130);
		jp_kwh.setBounds(890, 30, 200, 50);
		jp_bandeira.setBounds(570, 90, 520, 70);
		barra_rolagem_equipamento_selecionado.setBounds(570, 170, 520, 250);
		
		//Adicionar componentes na tela
		jp_kwh.add(jl_resultado_consumo);
		jf_tela_simulacao.add(jl_resultado_consumo);
		jf_tela_simulacao.add(jl_resultado_consumoConta);
		jf_tela_simulacao.add(jl_resultado_consumoParam);
		jf_tela_simulacao.add(jl_meu_consumo);
		jf_tela_simulacao.add(jp_bandeira);
		jf_tela_simulacao.add(jp_kwh);
		jf_tela_simulacao.add(jl_nome);
		jf_tela_simulacao.add(jl_tipo_equipamento);
		jf_tela_simulacao.add(jcb_tipo_equipamento);
		jf_tela_simulacao.add(jtf_nome);
		jf_tela_simulacao.add(jbtn_buscar);
		jf_tela_simulacao.add(linha_separadora);
		jf_tela_simulacao.add(jbtn_adicionar);
		jf_tela_simulacao.add(barra_rolagem_selecao_equipamento);
		jf_tela_simulacao.add(barra_rolagem_equipamento_selecionado);
		jf_tela_simulacao.add(jbtn_remover);
		jf_tela_simulacao.add(jbtn_salvar);
		jtf_nome.setColumns(40);
		jf_tela_simulacao.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == jbtn_buscar) {
			Gui_Manter_Repositorio rp = new Gui_Manter_Repositorio();
			ArrayList<Equipamento> ep = rp.getRepositorioEquip();
			String combo = (String) jcb_tipo_equipamento.getSelectedItem();
			lista_resultado_busca = new ArrayList<Equipamento>();
			if (combo.length() > 0) {
				for (int i = 0; i < ep.size(); i++) {
					if (combo.equals("Iluminação")) {
						if (ep.get(i) instanceof Iluminacao) {
							lista_resultado_busca.add(ep.get(i));
						}
					}
					if (combo.equals("Motores")) {
						if (ep.get(i) instanceof Motor) {
							lista_resultado_busca.add(ep.get(i));
						}
					}
					if (combo.equals("Refrigeracao")) {
						if (ep.get(i) instanceof Refrigerador) {
							lista_resultado_busca.add(ep.get(i));
						}
					}
					if (combo.equals("Eletrônico")) {
						if (ep.get(i) instanceof Eletronico) {
							lista_resultado_busca.add(ep.get(i));
						}
					}
					if (combo.equals("Condicionadores de ar")) {
						if (ep.get(i) instanceof CondicionadorAr) {
							lista_resultado_busca.add(ep.get(i));
						}
					}
					if (combo.equals("Aquecimento")) {
						if (ep.get(i) instanceof Aquecimento) {
							lista_resultado_busca.add(ep.get(i));
						}
					}
				}// fim for
			} else {
				lista_resultado_busca.addAll(ep);
			}
			if (jtf_nome.getText().length() > 0) {
				ArrayList<Equipamento> epArrayAux = new ArrayList<Equipamento>();
				for (int i = 0; i < lista_resultado_busca.size(); i++) {
					if (lista_resultado_busca.get(i).getNome()
							.equalsIgnoreCase(jtf_nome.getText())) {
						epArrayAux.add(lista_resultado_busca.get(i));
					}
				}
				lista_resultado_busca.removeAll(lista_resultado_busca);
				lista_resultado_busca.addAll(epArrayAux);
			}
		}
		Simulacao SI = new Simulacao();
		ParametrizacaoGeral pg = new ParametrizacaoGeral();
		DecimalFormat df = new DecimalFormat("0.00"); 
		if (arg0.getSource() == jbtn_adicionar) {
			
			
			// inserir e preencher hr de dias uso
			int qtd = 0, qtdHora = 0, qtdDia = 0;
			int n = tabela_selecao_equipamento.getSelectedRow();
		
			if (n >= 0) {
				try {
					qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade Equipamento"));
					qtdHora = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade Horas de Uso"));
					qtdDia = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade dias de Uso"));
										
					if (qtdHora < 1 || qtdHora > 24 || qtdDia < 1
							|| qtdDia > 31 || qtd<1) {
						throw new Exception();
					}
					Equipamento ep = lista_resultado_busca.get(n);
					ep.setQtd(qtd);
					ep.setQtdDia(qtdDia);
					ep.setQtdHora(qtdHora);
					lista_equipamento_selecionado.add(ep);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Parametro invalido");
				}
			}
			jf_tela_simulacao.remove(barra_rolagem_equipamento_selecionado);
			tabela_equipamento_selecionado = new tabela().criar2(lista_equipamento_selecionado);
			tabela_equipamento_selecionado.setSize(400, 300);
			barra_rolagem_equipamento_selecionado = new JScrollPane(tabela_equipamento_selecionado);
			barra_rolagem_equipamento_selecionado.setBounds(570, 170, 520, 250);
			jf_tela_simulacao.add(barra_rolagem_equipamento_selecionado);
			jtf_nome.setText("");
			jf_tela_simulacao.setVisible(true);
			
					
		}
		if (arg0.getSource() == jbtn_remover) {
			int n = tabela_equipamento_selecionado.getSelectedRow();
			lista_equipamento_selecionado.remove(n);
			jf_tela_simulacao.remove(barra_rolagem_equipamento_selecionado);
			tabela_equipamento_selecionado = new tabela().criar2(lista_equipamento_selecionado);
			tabela_equipamento_selecionado.setSize(400, 300);
			barra_rolagem_equipamento_selecionado = new JScrollPane(tabela_equipamento_selecionado);
			barra_rolagem_equipamento_selecionado.setBounds(570, 170, 520, 250);
			jf_tela_simulacao.add(barra_rolagem_equipamento_selecionado);
			jtf_nome.setText("");
			jf_tela_simulacao.setVisible(true);
		}
		
		if (arg0.getSource() == jbtn_salvar) {
			
			
			SI.calculaConta(lista_equipamento_selecionado,pg);
			SI.calculaBandeira(pg);
			
			String End ="";
			
			JFileChooser file = new JFileChooser(); 
			file.setFileSelectionMode(JFileChooser.FILES_ONLY); 
			int i= file.showSaveDialog(null); 
			if (i==1){ 
				System.out.println("Teste1");
			} else 
			{ File arquivo = file.getSelectedFile(); 
			
			End=arquivo.getPath()+".txt";
			}

			
			try {
				FileWriter arq;
				arq = new FileWriter(End);
				PrintWriter gravarArq = new PrintWriter(arq);
				
				gravarArq.printf("%n--------------Consumo------------------------------------------");
				gravarArq.printf("%nConsumo Kw/H : "+String.valueOf(df.format(SI.calculaKhw(lista_equipamento_selecionado))));
				gravarArq.printf("%nConsumo Kw/H Tarifado R$ : "+df.format(SI.getKhwTarifado()));
								
				gravarArq.printf("%nValor Conta R$ : "+df.format(SI.getValorConta()));
				gravarArq.printf("%nValor Conta R$ : "+df.format(SI.getValorConta()));
				
				gravarArq.printf("%nValor Bandeira Verde R$ :"+df.format(SI.getValorContaBandeiraVerde()));
				gravarArq.printf("%nValor Bandeira Amarela R$ :"+df.format(SI.getValorContaBandeiraAmarela()));
				gravarArq.printf("%nValor Bandeira Vermelha R$ :"+df.format(+SI.getValorContaBandeiraVermelha()));
				gravarArq.printf("%nICMS Pago R$ :"+SI.getValorICMS());
				gravarArq.printf("%nPIS/COFINS Pago R$ :"+SI.getValorPIS());
				
				
				
				gravarArq.printf("%n--------------TARIFAS-------------------------------------------");
				gravarArq.printf("%nValor da Tarifa :"+df.format(pg.getTarifa()));
				gravarArq.printf("%nICMS :"+df.format(pg.getPercentual_icms()));
				gravarArq.printf("%nPIS/COFINS :"+df.format(pg.getPercentual_pis_cofins()));
				gravarArq.printf("%n--------------ITENS---------------------------------------------");
				
				for(int j=0 ;j<lista_equipamento_selecionado.size();j++){
					
					
					gravarArq.printf("%n Item: "+j+
							"-| Nome :"+lista_equipamento_selecionado.get(j).getNome()+
							"| Potencia :"+lista_equipamento_selecionado.get(j).getPotencia()+
							"| Quantidade :"+lista_equipamento_selecionado.get(j).getQtd());
				}
								
				
				JOptionPane.showMessageDialog(null, "Arquivo Salvo em :"+End);
				
				arq.close();
				
			} catch (Exception e) {
				
				JOptionPane.showMessageDialog(null, "Parametro invalido");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		SI.calculaConta(lista_equipamento_selecionado,pg);
		SI.calculaBandeira(pg);
		jl_resultado_consumoParam.setText(
				"<html> ICMS R$ : "+df.format(SI.getValorICMS())+
				"<br> PIS/COFINS R$ :"+df.format(SI.getValorPIS())+
				"<br> TARIFA R$ :"+df.format(pg.getTarifa())+
				"</html>");
		
		jl_resultado_consumoConta.setText(
				"<html> Valor Conta R$ : "+df.format(SI.getValorConta())+
				"<br> Valor Bandeira Verde R$ :"+df.format(SI.getValorContaBandeiraVerde())+
				"<br> Valor Bandeira Amarela R$ :"+df.format(SI.getValorContaBandeiraAmarela())+
				"<br> Valor Bandeira Vermelha R$ :"+df.format(+SI.getValorContaBandeiraVermelha())+
				"</html>");
		
		jl_resultado_consumo.setText(String.valueOf(df.format(SI.calculaKhw(lista_equipamento_selecionado))+" Kw/H "));
					
		jf_tela_simulacao.remove(barra_rolagem_selecao_equipamento);
		tabela_selecao_equipamento = new tabela().criar(lista_resultado_busca);
		tabela_selecao_equipamento.setSize(400, 300);
		barra_rolagem_selecao_equipamento = new JScrollPane(tabela_selecao_equipamento);
		barra_rolagem_selecao_equipamento.setBounds(30, 140, 480, 250);
		jf_tela_simulacao.add(barra_rolagem_selecao_equipamento);
		jtf_nome.setText("");
		jf_tela_simulacao.setVisible(true);
	}
	
	
	
}
