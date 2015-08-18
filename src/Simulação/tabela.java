package Simulação;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.br.puccampinas.equipamentos.Equipamento;

public class tabela {

	Object colNames[] = { "Nome", "Tipo", "Potencia" };
	Object colNames2[] = { "Nome", "Potencia", "Tipo", "Quantidade",
			"Tempo De Uso", "Dias De Uso" };
	Object[][] data = {};
	DefaultTableModel dtm;
	public JTable table;

	public JTable criar(ArrayList<Equipamento> epArray) {

		dtm = new DefaultTableModel(data, colNames);
		table = new JTable(dtm);

		if (epArray.size() > 0) {
			for (int i = 0; i < epArray.size(); i++) {

				dtm.addRow(new Object[] {
						epArray.get(i).getNome(),
						epArray.get(i).getClass().getSuperclass().getName()
								.substring(32), epArray.get(i).getPotencia() });
			}
		}

		table.setModel(dtm);

		return table;
	}

	public JTable criar2(ArrayList<Equipamento> epArray) {

		dtm = new DefaultTableModel(data, colNames2);
		table = new JTable(dtm);

		if (epArray.size() > 0) {
			for (int i = 0; i < epArray.size(); i++) {

				dtm.addRow(new Object[] {
						epArray.get(i).getNome(),
						epArray.get(i).getPotencia(),
						epArray.get(i).getClass().getSuperclass().getName()
								.substring(32), epArray.get(i).getQtd(),
						epArray.get(i).getQtdHora(), epArray.get(i).getQtdDia() });

			}
		}

		table.setModel(dtm);

		return table;
	}

}
