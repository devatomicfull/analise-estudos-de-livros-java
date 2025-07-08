package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Exemplo09_07_Inclusao_De_Listas_De_Selecao extends JFrame implements ListSelectionListener, ActionListener{
	JLabel L1;
	JTextField T1;
	JList lista;
	JButton bquant, bindice, bclear;
	DefaultListModel listModel;
	
	public Exemplo09_07_Inclusao_De_Listas_De_Selecao() {
		setLocation(300,100);
		setTitle("Uso do JListbox");
		setSize(200,250);
		T1 = new JTextField();
		T1.addActionListener(this);
		L1 = new JLabel("Sem selecao");
		L1.setForeground(Color.black);
		bquant = new JButton("Quantidade de intens");
		bquant.addActionListener(this);
		bindice = new JButton("Indice selecionado");
		bindice.addActionListener(this);
		bclear = new JButton("Remove item");
		bclear.addActionListener(this);
		
		listModel = new DefaultListModel();
		listModel.addElement("Banana");
		listModel.addElement("Pera");
		listModel.addElement("Maca");
		listModel.addElement("Uva");
		
		lista = new JList(listModel);
		lista.addListSelectionListener(this);//registra a lista
		JScrollPane Painel = new JScrollPane(lista);
		
		getContentPane().setLayout(new GridLayout(6,1));
		
		getContentPane().add(L1);
		getContentPane().add(T1);
		getContentPane().add(Painel);
		getContentPane().add(bquant);
		getContentPane().add(bindice);
		getContentPane().add(bclear);		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==T1) {
			listModel.addElement(T1.getText()); //adiciona intens a lista
			T1.setText("");
		}
		if(e.getSource()==bquant) {
			T1.setText("Quantidade: "+ listModel.getSize());
		}
		if(e.getSource()==bindice) {
			T1.setText("Indice selecionado: "+lista.getSelectedIndex());
		}
		if(e.getSource()==bclear) {
			int index = lista.getSelectedIndex();
			L1.setText("Removido: "+lista.getSelectedValue());
			listModel.remove(index);
		}
	}
	
	public void valueChanged(ListSelectionEvent e) {
		L1.setText("Selecionado: "+lista.getSelectedValue());
	}
	
		
	public static void main(String[] args) {
		/* DECLARAR UM OBJETO PARA INSTANCIAR A CLASSE JList.
		 * DECLARAR UM OBJETO QUE CONTERA A LISTA DAS OPÇÕES E ADICIONAR A ELE TODAS AS OPÇÕES.
		 * INICIALIZAR O OBJETO DO ITEM 1 COM O OBJETO DO ITEM 2.
		 * CRIAR UM PAINEL DE ROLAGEM.
		 * ADICIONAR O OBJETO DO ITEM 1 AO PAINEL DE ROLAGEM.*/ 
		
		JFrame Janela = new Exemplo09_07_Inclusao_De_Listas_De_Selecao();
		Janela.show();
		WindowListener x = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela.addWindowListener(x);

	}

}
