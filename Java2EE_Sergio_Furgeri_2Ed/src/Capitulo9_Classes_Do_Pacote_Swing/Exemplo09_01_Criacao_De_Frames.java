package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exemplo09_01_Criacao_De_Frames extends JFrame {
	
	Exemplo09_01_Criacao_De_Frames(){//Construtor - mesmo nome da classe
		setTitle("Minha Primeira Janela em java");// Titulo da Janela
		setSize(400,50);//dimensões da janela(Largura e Comprimento
		setLocation(150,150);//Canto esquerdo e topo da tela
		setResizable(false);// a janela nao pode ser rendimensionada
		getContentPane().setBackground(Color.gray);//cor de fundo da janela
	}
	
	public static void main(String[] args) {
		//Declaração e inicialização do objeto Janela
		JFrame Janela = new Exemplo09_01_Criacao_De_Frames();
		
		Janela.show();//Mostra a Janela na tela
		//rotina para fechar a janela:
		WindowListener x = new WindowAdapter() {
			private WindowEvent e;

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela.addWindowListener(x);
	}

}
