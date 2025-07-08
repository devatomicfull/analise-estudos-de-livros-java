package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo09_02_Inclusao_De_Textos_E_Imagens_Na_Janela  extends JFrame{
	
	//CONSTRUTOR
	public Exemplo09_02_Inclusao_De_Textos_E_Imagens_Na_Janela() {
		// 
		JLabel L1,L2,L3,L4;
		ImageIcon icone = new ImageIcon("c:/Livros/Java/busca.gif");
		setTitle("Inserindo Labels e Imagens na Janela ");
		setSize(350,120);
		setLocation(50,50);
		getContentPane().setBackground(new Color(220,220,220));
		L1 = new JLabel("  Aprendendo",JLabel.LEFT);
		L1.setForeground(Color.red);
		L2 = new JLabel(icone);
		L3 = new JLabel ("Inserir  ",JLabel.RIGHT);
		L3.setForeground(Color.blue);
		L4 = new JLabel("Labels e Imagens",icone,JLabel.CENTER);
		L4.setFont(new Font("Serif",Font.BOLD,20));
		L4.setForeground(Color.black);
		
		getContentPane().setLayout(new GridLayout(4,1));
		getContentPane().add(L1);
		getContentPane().add(L2);
		getContentPane().add(L3);
		getContentPane().add(L4);
	}

	public static void main(String[] args) {
		/* */
		JFrame Janela = new Exemplo09_02_Inclusao_De_Textos_E_Imagens_Na_Janela();
		Janela.show();
		WindowListener x = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela.addWindowListener(x);
	}

}
