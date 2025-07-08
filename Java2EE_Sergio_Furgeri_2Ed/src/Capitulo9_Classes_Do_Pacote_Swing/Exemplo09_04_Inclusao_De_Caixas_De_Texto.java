package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo09_04_Inclusao_De_Caixas_De_Texto extends JFrame implements ActionListener {
	
	JLabel L1,L2,L3;
	JButton B1,B2,B3,B4,B5;
	JTextField T1,T2,T3;
	
	public static void main(String[] args) {
		JFrame Janela = new Exemplo09_04_Inclusao_De_Caixas_De_Texto();
		Janela.show();
		WindowListener x = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela.addWindowListener(x);
	}
	
	public Exemplo09_04_Inclusao_De_Caixas_De_Texto() {
		setTitle("Calculadora");
		setSize(350,90);
		setLocation(50,50);
		getContentPane().setBackground(new Color(150,150,150));
		getContentPane().setLayout(new GridLayout(3,4)); //3 linhas, 4 colunas
		
		L1 = new JLabel("Num.1");				L1.setForeground(Color.black);
		L1.setFont(new Font ("",Font.BOLD,14));	
		L2 = new JLabel("Num.2");				L2.setForeground(Color.black);
		L2.setFont(new Font ("",Font.BOLD,14));
		L3 = new JLabel ("Total");				L3.setFont(new Font("",Font.BOLD,14));
		
		B1 = new JButton("+");				B1.addActionListener(this);
		B2 = new JButton("-");				B2.addActionListener(this);
		B3 = new JButton("x");				B3.addActionListener(this);
		B4 = new JButton("/");				B4.addActionListener(this);
		B5 = new JButton("Limpar");			B5.addActionListener(this);
		B5.setBackground(Color.black);
		B5.setForeground(Color.white);
		
		T1 = new JTextField();	T2 = new JTextField();	T3 = new JTextField();
		
		T3.setEditable(false);//define que o textField como somente leitura
		
		getContentPane().add(L1);			getContentPane().add(T1); 
		getContentPane().add(B1);			getContentPane().add(B2);
		getContentPane().add(L2);			getContentPane().add(T2);
		getContentPane().add(B3);			getContentPane().add(B4);
		getContentPane().add(L3);			getContentPane().add(T3);
		getContentPane().add(B5);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B5) {
			T1.setText("");
			T2.setText("");
			T3.setText("");
			return;
		}
		float N1=0,N2=0,result=0;
		try {
			N1 = Float.parseFloat(T1.getText());
			N2 = Float.parseFloat(T2.getText());
		}catch(NumberFormatException erro) {
			T3.setText("Erro");
			return;
		}
		
		if(e.getSource()==B1) {//BOTAO SOMAR
			result = N1+N2;
		}
		
		if(e.getSource()==B2) {//BOTAO SUBTRAIR
			result = N1-N2;
		}
		if(e.getSource()==B3) {//BOTAO MULTIPLICAR
			result = N1*N2;
		}
		if(e.getSource()==B4) {//BOTAO DIVIDIR
			result = N1/N2;
		}
		T3.setText(""+result);
	}
}
