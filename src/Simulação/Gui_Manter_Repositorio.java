package Simulação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.br.puccampinas.equipamentos.*;

public class Gui_Manter_Repositorio extends JFrame implements ActionListener, Serializable{	
	//private ArrayList<Equipamento> repositorioEquip = new ArrayList<>();
	private ArrayList<Equipamento> equipamentoArrayResult = new ArrayList<Equipamento>();
	private  static ArrayList<Equipamento> repositorioEquipamento = new ArrayList<Equipamento>();
	
	JFrame jf_manterRepositorio = new JFrame("Repositório de equipamentos");
	JTable tabela;
	JScrollPane barraRolagem = new JScrollPane();
	JButton jbtn_buscar = new JButton("Buscar");
	JButton jbtn_inserir = new JButton("Inserir");
	JButton jbtn_editar = new JButton("Editar");
	JButton jbtn_remover = new JButton("Remover");
	JLabel jl_nome = new JLabel("Nome");
	JLabel jl_tipo = new JLabel("Tipo de equipamento");
	JTextField jtf_nome = new JTextField();
	static public String[] lista_tipo_equipamento = new String[]
			{"","Iluminação","Motores","Refrigeracao","Eletrônico","Condicionadores de ar","Aquecimento"};
	JComboBox<String> jcb_filtro_equipamento = new JComboBox<>(lista_tipo_equipamento);

	public ArrayList<Equipamento> getRepositorioEquip() {
		return repositorioEquipamento;
	}

	public void setEquipRepositorioEquip(Equipamento equipamento, int posicao) {
		Gui_Manter_Repositorio.repositorioEquipamento.get(posicao).setNome(equipamento.getNome());
		Gui_Manter_Repositorio.repositorioEquipamento.get(posicao).setPotencia(equipamento.getPotencia());
	}
	
	public void setEquipRepositorioEquip(Equipamento equipamento){
		
		Gui_Manter_Repositorio.repositorioEquipamento.add(equipamento);
		
	}
	
	
	
	public  ArrayList<Equipamento> populaRepositorioEquipamento() {
			
		AparelhoFax aparelhoFax = new AparelhoFax("Aparelho Fax",20,0,0,0);
		AparelhoSom aparelhoSom = new AparelhoSom("Aparelho SOm",20,0,0,0);
		Aquecimento Aquecedor = new Aquecimento("Aquecedor De Ambiente",1550,0,0,0);
		arCondicionado arcondicionado = new arCondicionado("AR-CONDICIONADO",1000,0,0,0);
		Batedeira batedeira = new Batedeira("Batedeira",120,0,0,0);
		Bebedouro bebedouro = new Bebedouro("bebedouro",20,0,0,0);
		Cafeteira cafe = new Cafeteira("Cafeteira",600,0,0,0);
		Chuveiro chuveiro = new Chuveiro("Chuveiro",3500,0,0,0);
		CirculadorAr circulador = new CirculadorAr("Circulador Grande",200,0,0,0);
		Computador computador = new Computador("Computador",180,0,0,0);
		Enceradeira enceradeira = new Enceradeira("Enceradeira",500,0,0,0);
		EspremedorLaranja espremedorlaranja= new EspremedorLaranja("Espremedor de Laranja",65,0,0,0);
		Exaustor exaustor = new Exaustor("Exaustor Parede",110,0,0,0);
		FerroPassarRoupa Ferrop = new FerroPassarRoupa("Ferro Passar Roupa",1000,0,0,0);
		Freezer freezer = new Freezer("Freezer",130,0,0,0);
		Frigobar fri = new Frigobar("Frigobar",70,0,0,0);
		Geladeira geladeira = new Geladeira("Geladeira 1 Porta",90,0,0,0);
		lampadaLed lampled = new lampadaLed("lampada Led",9,0,0,0,0);
		lavadoraRoupa lavadora= new lavadoraRoupa("Lavadora de Roupas",500,0,0,0);
		Liquidificador liq = new Liquidificador("Liquidificador",300,0,0,0);
		Microondas micro = new Microondas("Microondas",2000,0,0,0);
		Televisao tv = new Televisao("TV 29 LCD",90,0,0,0);
		
		repositorioEquipamento.add(tv);
		repositorioEquipamento.add(micro);
		repositorioEquipamento.add(liq);
		repositorioEquipamento.add(lavadora);
		repositorioEquipamento.add(lampled);
		repositorioEquipamento.add(geladeira);
		repositorioEquipamento.add(fri);
		repositorioEquipamento.add(freezer);
		repositorioEquipamento.add(Ferrop);
		repositorioEquipamento.add(exaustor);
		repositorioEquipamento.add(espremedorlaranja);
		repositorioEquipamento.add(enceradeira);
		repositorioEquipamento.add(computador);
		repositorioEquipamento.add(circulador);
		repositorioEquipamento.add(chuveiro);
		repositorioEquipamento.add(cafe);
		repositorioEquipamento.add(bebedouro);
		repositorioEquipamento.add(batedeira);
		repositorioEquipamento.add(arcondicionado);
		repositorioEquipamento.add(Aquecedor);
		repositorioEquipamento.add(aparelhoFax);
		repositorioEquipamento.add(aparelhoSom);
		
		
		return repositorioEquipamento;
	}
	
	

	public void montaTela(){
		
		//populaRepositorioEquipamento();
		equipamentoArrayResult.addAll(repositorioEquipamento);
		
		jf_manterRepositorio.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		jf_manterRepositorio.setLayout(null);
		jf_manterRepositorio.setSize(550, 450);
		jf_manterRepositorio.setLocationRelativeTo(null);  
		jf_manterRepositorio.setAlwaysOnTop(false); 
		
		jbtn_buscar.addActionListener(this);
		jbtn_inserir.addActionListener(this);
		jbtn_editar.addActionListener(this);
		jbtn_remover.addActionListener(this);

		tabela = new tabela().criar(equipamentoArrayResult);
		tabela.setSize(400, 380);
		barraRolagem = new JScrollPane(tabela);
		JSeparator linha_separadora = new JSeparator(SwingConstants.HORIZONTAL);
		
		jl_nome.setBounds(30, 10, 150, 30);
		jtf_nome.setBounds(30, 35, 150, 30);
		jl_tipo.setBounds(190, 10, 190, 30);
		jcb_filtro_equipamento.setBounds(190, 35, 190, 30);
		jbtn_buscar.setBounds(395, 35, 115, 30);
		
		linha_separadora.setBounds(0, 80, 2000, 1); // definir posicao da linha !!
				
		jbtn_inserir.setBounds(30, 95, 90, 30);
		jbtn_editar.setBounds(130, 95, 90, 30);
		jbtn_remover.setBounds(230, 95, 90, 30);		
		barraRolagem.setBounds(30, 140, 480, 250);
		
		jf_manterRepositorio.add(jl_nome);
		jf_manterRepositorio.add(jl_tipo);
		jf_manterRepositorio.add(jtf_nome);
		jf_manterRepositorio.add(jcb_filtro_equipamento);
		jf_manterRepositorio.add(barraRolagem);
		jf_manterRepositorio.add(linha_separadora);
		jf_manterRepositorio.add(jbtn_buscar);
		jf_manterRepositorio.add(jbtn_inserir);
		jf_manterRepositorio.add(jbtn_editar);
		jf_manterRepositorio.add(jbtn_remover);
		jf_manterRepositorio.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==jbtn_buscar){
			ArrayList<Equipamento> arrayEquipamento = repositorioEquipamento;
			String combo = (String) jcb_filtro_equipamento.getSelectedItem();
		
			equipamentoArrayResult = new ArrayList<Equipamento>();
			
			if(combo.length()>0){
			
				for(int i=0;i<arrayEquipamento.size();i++){
					if(combo.equals("Iluminação")){
						if(arrayEquipamento.get(i) instanceof Iluminacao){
							equipamentoArrayResult.add(arrayEquipamento.get(i));
						}
					}
					if(combo.equals("Motores")){
						if(arrayEquipamento.get(i) instanceof Motor){
							equipamentoArrayResult.add(arrayEquipamento.get(i));
						}
					}
					if(combo.equals("Refrigeracao")){
						if(arrayEquipamento.get(i) instanceof Refrigerador){
							equipamentoArrayResult.add(arrayEquipamento.get(i));
						}
					}
					if(combo.equals("Eletrônico")){
						if(arrayEquipamento.get(i) instanceof Eletronico){
							equipamentoArrayResult.add(arrayEquipamento.get(i));
						}
					}
					if(combo.equals("Condicionadores de ar")){
						if(arrayEquipamento.get(i) instanceof CondicionadorAr){
							equipamentoArrayResult.add(arrayEquipamento.get(i));
						}
					}
					if(combo.equals("Aquecimento")){
						if(arrayEquipamento.get(i) instanceof Aquecimento){
							equipamentoArrayResult.add(arrayEquipamento.get(i));
						}
					}
				}
			}else{
				equipamentoArrayResult.addAll(arrayEquipamento);
			}
		}
	
		if(jtf_nome.getText().length()>0){
			ArrayList<Equipamento> epArrayAux = new ArrayList<Equipamento>();
				for(int i=0;i<equipamentoArrayResult.size();i++){
					if(equipamentoArrayResult.get(i).getNome().equalsIgnoreCase(jtf_nome.getText())){
						epArrayAux.add(equipamentoArrayResult.get(i));
					}
				}
			equipamentoArrayResult.removeAll(equipamentoArrayResult);
			equipamentoArrayResult.addAll(epArrayAux);	
		}
		if(arg0.getSource()==jbtn_inserir){
			Gui_Cadastro cad = new Gui_Cadastro();
			cad.inicializar();
		}
		if(arg0.getSource()==jbtn_editar){
			
			Gui_Editar edit = new Gui_Editar();
			
			edit.setEp(equipamentoArrayResult.get(tabela.getSelectedRow()));
			edit.setPosicaoObj(tabela.getSelectedRow());
			edit.inicializar();
				
		}
		if(arg0.getSource()==jbtn_remover){
			int n=tabela.getSelectedRow();
			System.out.println(tabela.getSelectedRow());
			repositorioEquipamento.remove(n);
			equipamentoArrayResult=repositorioEquipamento;
		}
		
		jf_manterRepositorio.remove(barraRolagem);
		tabela = new tabela().criar(equipamentoArrayResult);
		tabela.setSize(400, 300);
		barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(30, 140, 480, 250);
		jf_manterRepositorio.add(barraRolagem);
		jtf_nome.setText("");
		jf_manterRepositorio.setVisible(true);
	}
	
	public void setArrayresult(Equipamento equipamento){
		repositorioEquipamento.add(equipamento);
	}
	

}