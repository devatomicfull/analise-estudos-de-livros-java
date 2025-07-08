package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo09_10_Inclusao_De_Paineis_E_Botoes_De_Radio extends JFrame implements ItemListener{
	JLabel L1,L2;
	float N1=0,result=0;
	JTextField T1,T2;
	
	JPanel P1,P2;
	JRadioButton radio1,radio2,radio3;
	ButtonGroup radiogroup;

	public Exemplo09_10_Inclusao_De_Paineis_E_Botoes_De_Radio() {
		setTitle("Uso de botoes de Radio");
		setSize(340,120);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		L1 = new JLabel("Digite um valor");					L1.setForeground(Color.blue);		
		L2 = new JLabel("% do valor:");						L2.setForeground(Color.blue);
		T1 = new JTextField(5);								T2 = new JTextField(5);
		P1 = new JPanel();									P2 = new JPanel();
		T2.setEditable(false);
		radio1 = new JRadioButton("10% do valor");			radio1.addItemListener(this);
		radio2 = new JRadioButton("20% do valor");			radio2.addItemListener(this);
		radio3 = new JRadioButton("30% do valor");			radio3.addItemListener(this);
		
		radio1.setMnemonic(KeyEvent.VK_1);
		radio2.setMnemonic(KeyEvent.VK_2);
		radio3.setMnemonic(KeyEvent.VK_3);
		
		radiogroup = new ButtonGroup();
		radiogroup.add(radio1);		radiogroup.add(radio2);		radiogroup.add(radio3);
		P1.setLayout(new FlowLayout(FlowLayout.CENTER));
		P1.setBackground(new Color(200,200,200));
		P2.setLayout(new GridLayout(2,3));
		P2.setBackground(new Color(200,200,200));
		
		P1.add(L1);							P1.add(T1);
		P2.add(radio1);						P2.add(radio2);							P2.add(radio3);
		P2.add(L2);							P2.add(T2);
		getContentPane().add(P1);			getContentPane().add(P2);		
	}

	public static void main(String[] args) {
		JFrame Janela = new Exemplo09_10_Inclusao_De_Paineis_E_Botoes_De_Radio();
		Janela.show();
		WindowListener x = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela.addWindowListener(x);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(T1.getText().length()==0) return;
		try {
			N1 = Float.parseFloat(T1.getText());
		if(e.getSource()==radio1)
			result = (N1 * 10)/100;
		if(e.getSource()==radio2)
			result = (N1 * 20)/100;
		if(e.getSource()==radio3)
			result = (N1 * 30)/100;
		}catch(NumberFormatException erro) {
			T2.setText("Erro"); return;
		}
		T2.setText(""+result);
	}

}
