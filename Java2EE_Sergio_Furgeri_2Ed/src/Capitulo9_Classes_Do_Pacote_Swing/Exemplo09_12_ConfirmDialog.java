package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo09_12_ConfirmDialog extends JFrame implements ActionListener {
	JButton B1;
	JButton B2;
	JButton B3;
	JLabel L1;
	
	public static void main(String[] args) {
		JFrame Janela = new Exemplo09_12_ConfirmDialog();
		Janela.show();
		WindowListener x = new WindowAdapter(){
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela.addWindowListener(x);
	}
	
	Exemplo09_12_ConfirmDialog(){
		setBackground(new Color(190, 190, 190));
		setSize(400, 100);
		setTitle("Caixas de confirmacao");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		L1 = new JLabel("Resposta: ");
		B1 = new JButton("Sim e Nao");
		B2 = new JButton("Sim, Nao e Cancelar");
		B3 = new JButton("Ok e Cancelar");
		
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		
		getContentPane().add(B1);
		getContentPane().add(B2);
		getContentPane().add(B3);
		getContentPane().add(L1);
	}
	
	public void actionPerformed(ActionEvent e) {
		int resp = 0;
		if (e.getSource() == B1)
		 resp = JOptionPane.showConfirmDialog(null,"Erro ao acessar arquivo. Tentar novamente?", "Erro de arquivo", JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
		
		if (e.getSource() == B2)
		resp = JOptionPane.showConfirmDialog(null,"Desejar salvar as alteracoes?", " Salvar o arquivo", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
		
		if (e.getSource() == B3)
		resp = JOptionPane.showConfirmDialog(null,"Deseja abrir o arquivo?", " Abrir arquivo", JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
		
		switch (resp) {
			case 0: L1.setText("Pressionado o bot\u00e3o Yes / Ok");
			break;
			
			case 1:	L1.setText("Pressionado o bot\u00e3o No");
			break;
			
			case 2:	L1.setText("Pressionado o bot\u00e3o Cancel");
			break;
			
		}
	}

}