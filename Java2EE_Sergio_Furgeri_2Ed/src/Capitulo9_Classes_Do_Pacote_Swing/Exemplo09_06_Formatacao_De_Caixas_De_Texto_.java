package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;

public class Exemplo09_06_Formatacao_De_Caixas_De_Texto_ extends JFrame implements ActionListener{
	JTextField T1,T2;
	double valor1 = 1000.54;
	int valor2 = 100;
	NumberFormat df1,df2;
	

	public static void main(String[] args) {
		JFrame Janela = new Exemplo09_06_Formatacao_De_Caixas_De_Texto_();
		Janela.show();
		WindowListener x = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela. addWindowListener(x);
	}
	Exemplo09_06_Formatacao_De_Caixas_De_Texto_(){
		setTitle("Formatando numeros");
		setSize(350,65);
		getContentPane().setBackground(new Color(150,150,150));
		getContentPane().setLayout(new GridLayout(1,2));
		df1 = NumberFormat.getNumberInstance();
		df1.setMinimumFractionDigits(4);
		df2 = NumberFormat.getNumberInstance();
		df2.setMinimumFractionDigits(2);
		
		T1 = new JTextField();
		T2 = new JTextField();
		
		T1.setText(""+df1.format(valor1));
		T2.setText(""+df1.format(valor2));
		
		getContentPane().add(T1);
		getContentPane().add(T2);

	}
	
	public void actionPerformed(ActionEvent e) {
		
	}

}
