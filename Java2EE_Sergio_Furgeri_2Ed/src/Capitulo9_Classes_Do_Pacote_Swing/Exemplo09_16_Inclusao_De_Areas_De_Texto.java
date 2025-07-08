package Capitulo9_Classes_Do_Pacote_Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exemplo09_16_Inclusao_De_Areas_De_Texto extends JFrame implements ActionListener{
	JTextArea TA1,TA2;
	JTextField T1;
	JButton B1,B2;
	
	public static void main(String[] args) {
		JFrame Janela = new Exemplo09_16_Inclusao_De_Areas_De_Texto();
		Janela.show();
		WindowListener x = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela.addWindowListener(x);
	}
	
	public Exemplo09_16_Inclusao_De_Areas_De_Texto() {
		setSize(480,280);
		setTitle("Uso do JTextArea");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		T1 = new JTextField(40);
		T1.addActionListener(this);
		
		B1 = new JButton("Copia Tudo");
		B1.addActionListener(this);
		
		B2 = new JButton("Copia Selecao");
		B2.addActionListener(this);
		
		TA1 = new JTextArea("Editor de texto:\n,5,40");
		TA2 = new JTextArea(5,40);
		
		JScrollPane painel11 = new JScrollPane(TA1);
		JScrollPane painel12 = new JScrollPane(TA2);
		
		getContentPane().add(painel11);				getContentPane().add(T1);
		getContentPane().add(B1);					getContentPane().add(B2);
		getContentPane().add(painel12);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==T1) {//ao pressionar ENTER no JTextField
			TA1.append(T1.getText());
			T1.setText("");
		}
		
		if(e.getSource()==B1) //copia conteudo de TA1 em TA2
			TA2.setText(TA1.getText());
		if(e.getSource()==B2)//copia selecao
			TA2.setText(TA1.getSelectedText());
	}

}
