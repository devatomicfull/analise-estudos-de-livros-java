package Capitulo9_Classes_Do_Pacote_Swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exemplo09_11_Inclusao_De_Caixas_De_Mensagem extends JFrame implements ActionListener{
	ImageIcon icone = new ImageIcon("C:/Livros/Java/estrela.gif");//o gif nao ira aparecer pois este diretorio nao existe, caso queira coloque um diretorio real e mude o nome do gif
	JButton B1,B2,B3,B4,B5,B6;
	
	public Exemplo09_11_Inclusao_De_Caixas_De_Mensagem() {
		setBackground(new Color(190,190,190));
		setSize(350,100);
		setTitle("Caixas de mensagem");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		
		B1 = new JButton("Pergunta");					B1.addActionListener(this);
		B2 = new JButton("Informacao");					B2.addActionListener(this);
		B3 = new JButton("Alerta");						B3.addActionListener(this);
		B4 = new JButton("Erro");						B4.addActionListener(this);
		B5 = new JButton("Definida pelo Usuario");		B5.addActionListener(this);
		B6 = new JButton("Somente mensagem");			B6.addActionListener(this);
		
		getContentPane().add(B1);
		getContentPane().add(B2);
		getContentPane().add(B3);
		getContentPane().add(B4);
		getContentPane().add(B5);
		getContentPane().add(B6);
		
	}

	public static void main(String[] args) {
		JFrame Janela = new Exemplo09_11_Inclusao_De_Caixas_De_Mensagem();
		Janela.show();
		WindowListener x = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela.addWindowListener(x);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B1)
			JOptionPane.showMessageDialog(null,"Sera que estou aprendendo Java?","Pergunta",JOptionPane.QUESTION_MESSAGE);
		if(e.getSource()==B2)
			JOptionPane.showMessageDialog(null,"Esta e uma mensagem de informacao.","Mensagem de Informacao",JOptionPane.INFORMATION_MESSAGE);
		if(e.getSource()==B3)
			JOptionPane.showMessageDialog(null,"Cuidado!","Mensagem Alerta",JOptionPane.WARNING_MESSAGE);
		if(e.getSource()==B4)
			JOptionPane.showMessageDialog(null,"Ocorreu algum erro!","Mensagem de Erro!",JOptionPane.ERROR_MESSAGE);
		if(e.getSource()==B5)
			JOptionPane.showMessageDialog(null,"Utilizando um gif animado.","Mensagem pelo Usuario.",JOptionPane.INFORMATION_MESSAGE,icone);
		if(e.getSource()==B6)
			JOptionPane.showMessageDialog(null,"Aprendendo como usar caixas de mensagem.","Somente mensagem",JOptionPane.PLAIN_MESSAGE);		
	}

}
