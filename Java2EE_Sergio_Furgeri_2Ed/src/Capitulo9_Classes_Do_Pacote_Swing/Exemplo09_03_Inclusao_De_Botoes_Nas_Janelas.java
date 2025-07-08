package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo09_03_Inclusao_De_Botoes_Nas_Janelas extends JFrame implements ActionListener {
	JButton b1,b2;
	ImageIcon icone = new ImageIcon("C:/Livros/Java/Busca.gif");
	
	public Exemplo09_03_Inclusao_De_Botoes_Nas_Janelas() {
		setTitle("Inserindo botoes na Janela");
		setSize(350,100);
		setLocation(50,50);
		getContentPane().setBackground(new Color(180,180,180));
		
		b1 = new JButton("Busca",icone);
		b1.setHorizontalTextPosition(AbstractButton.LEFT);
		b1.setBackground(new Color(100,180,180));
		b1.setForeground(Color.black);
		b1.setFont(new Font("Scripts", Font.BOLD,20));
		b1.setEnabled(true);
		b1.addActionListener(this);
		b1.setToolTipText("Pressione aqui para realizar uma busca");
		b1.setMnemonic(KeyEvent.VK_B);
		b2 = new JButton("Cancelar");
		b2.addActionListener(this);
		b2.setMnemonic(KeyEvent.VK_C);
		b2.setToolTipText("Pressione aqui para cancelar");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(b1);
		getContentPane().add(b2);
	}
	
	public void actionPerformed(ActionEvent e) {//metodo implementado pelo actionListener
		if(e.getSource()==b1) {
			System.out.println("Botao 1 Pressionado");
		}
		if(e.getSource()==b2) {
			System.out.println("Botao2 Pressionado");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame Janela = new Exemplo09_03_Inclusao_De_Botoes_Nas_Janelas();
		Janela.show();
		WindowListener x = new WindowAdapter() { 
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela.addWindowListener(x);
	}

}
