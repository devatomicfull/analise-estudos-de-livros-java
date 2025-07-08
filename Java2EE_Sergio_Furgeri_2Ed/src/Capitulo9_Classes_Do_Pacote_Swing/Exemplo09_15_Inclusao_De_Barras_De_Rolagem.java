package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.NumberFormat;

import javax.swing.JScrollBar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class Exemplo09_15_Inclusao_De_Barras_De_Rolagem extends JFrame implements AdjustmentListener{
	JScrollBar SB1;
	JLabel L1,L2;

	public static void main(String[] args) {
		JFrame Janela = new Exemplo09_15_Inclusao_De_Barras_De_Rolagem();
		Janela.show();
		WindowListener x = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela.addWindowListener(x);

	}
		
	public Exemplo09_15_Inclusao_De_Barras_De_Rolagem() {
		setBackground(new Color(190,190,190));
		setSize(250,100);
		setTitle("Uso da barra de rolagem ");
		getContentPane().setLayout(new GridLayout(3,1));
		SB1 = new JScrollBar(JScrollBar.HORIZONTAL,0,5,0,105);
		
		SB1.addAdjustmentListener(this);
		
		L1 = new JLabel(""+SB1.getValue(),JLabel.CENTER);
		L1.setForeground(Color.black);
		L2 = new JLabel(""+JLabel.CENTER);
		L2.setForeground(Color.black);
		getContentPane().add(SB1);
		getContentPane().add(L1);
		getContentPane().add(L2);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		L1.setText(SB1.getValue()+"Centimetros");
		NumberFormat nf;
		nf = NumberFormat.getNumberInstance();
		nf.setMinimumFractionDigits(3);
		double pol = SB1.getValue()/2.54;
		L2.setText(nf.format(pol)+" Polegadas");
		
	}

}
