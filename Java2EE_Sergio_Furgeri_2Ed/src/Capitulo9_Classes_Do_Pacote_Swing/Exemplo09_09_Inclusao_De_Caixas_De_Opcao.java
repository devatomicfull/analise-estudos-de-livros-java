package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Exemplo09_09_Inclusao_De_Caixas_De_Opcao extends JFrame implements ItemListener{
	JLabel L1;
	JCheckBox C1,C2;
	static int negrito=0, italico=0;
	
	public static void main(String[] args) {
		JFrame Janela = new Exemplo09_09_Inclusao_De_Caixas_De_Opcao();
		Janela.show();
		WindowListener x = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela.addWindowListener(x);
	}
	
	public Exemplo09_09_Inclusao_De_Caixas_De_Opcao() {
		getContentPane().setBackground(new Color(180,180,180));
		setTitle("Uso do JCheckBox");
		setSize(300,70);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		L1 = new JLabel("Java");
		L1.setFont(new Font("Arial",Font.PLAIN,20));
		L1.setForeground(Color.black);
		
		C1 = new JCheckBox("Negrito");
		C1.setBackground(new Color(180,180,180));
		C1.addItemListener(this);
		
		C2 = new JCheckBox("Italico");
		C2.setBackground(new Color(180,180,180));
		C2.addItemListener(this);
		
		getContentPane().add(L1);
		getContentPane().add(C1);
		getContentPane().add(C2);
	}
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==C1) {
			if(e.getStateChange()==ItemEvent.SELECTED)
				negrito = Font.BOLD;
			else
				negrito = Font.PLAIN;
		}
		
		if(e.getSource() == C2) {
			if(e.getStateChange()==ItemEvent.SELECTED)
				italico = Font.ITALIC;
			else
				italico = Font.PLAIN;
		}
		L1.setFont(new Font("Arial", negrito+italico,20));
	}
}
