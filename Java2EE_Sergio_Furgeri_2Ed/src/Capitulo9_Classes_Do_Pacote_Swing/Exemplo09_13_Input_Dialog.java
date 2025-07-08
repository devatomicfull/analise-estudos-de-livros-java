package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exemplo09_13_Input_Dialog extends JFrame implements ActionListener{
	JButton B1;
	JLabel L1;

	public Exemplo09_13_Input_Dialog() {
		setBackground(new Color(190,190,190));
		setSize(230,100);
		setTitle("Uso da caixa de entrada");
		getContentPane().setLayout(new GridLayout(2,1));
		L1 = new JLabel("",JLabel.CENTER);				L1.setForeground(Color.blue);
		B1 = new JButton("Login");						B1.addActionListener(this);
		
		B1.setToolTipText("Clique aqui para entrar no Sistema");
		B1.setMnemonic(KeyEvent.VK_L);
		getContentPane().add(B1);						getContentPane().add(L1);		
	}

	public static void main(String[] args) {
		JFrame Janela = new Exemplo09_13_Input_Dialog();
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
		String resp = JOptionPane.showInputDialog(null,"Qual o seu nome?","Login no Sistema", JOptionPane.QUESTION_MESSAGE);
		if(!(resp==null || resp.equals("")))
			L1.setText("Seja Bem-Vindo "+resp+" !!");
		else
			L1.setText("");
	}
}
