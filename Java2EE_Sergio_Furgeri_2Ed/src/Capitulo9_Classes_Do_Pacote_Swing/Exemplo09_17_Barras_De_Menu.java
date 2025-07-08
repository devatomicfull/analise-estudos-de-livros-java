package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo09_17_Barras_De_Menu extends JFrame implements ActionListener{
	JMenuBar M1;
	JTextField T1;
	JMenu menuCadastro, menuRelatorio;
	JMenuItem micliente, mifornecedor, misair, mirlcliente, mirlfornecedor;
	
	public Exemplo09_17_Barras_De_Menu() {
		setTitle("Uso de Menus");
		setSize(270,130);
		setLocation(50,50);
		getContentPane().setBackground(new Color(0,128,128));
		T1 = new JTextField();
		M1 = new JMenuBar();//cria a barra de menus
		
		menuCadastro = new JMenu("Cadastro");//cria um menu
		menuRelatorio = new JMenu("Relatorios");
		micliente = new JMenuItem("Cliente");//cria um intem

		micliente.addActionListener(this);
		mifornecedor = new JMenuItem("Fornecedor");

		mifornecedor.addActionListener(this);

		misair = new JMenuItem("Sair do sistema");
		misair.addActionListener(this);

		menuCadastro.add(micliente); //adiciona o item ao menu
        menuCadastro.add(mifornecedor);
        menuCadastro.add(misair);

        mirlcliente = new JMenuItem("Relacao de Clientes");
        mirlcliente.addActionListener(this);

        mirlfornecedor = new JMenuItem("Relacao de Fornecedores");
        mirlfornecedor.addActionListener(this);

        menuRelatorio.add(mirlcliente);
        menuRelatorio.add(mirlfornecedor);

        M1.add(menuCadastro); //adiciona o menu na barra de menus
        M1.add(menuRelatorio);
        setJMenuBar(M1); //define a barra de menus como padrao
        getContentPane().add(T1);
	}

	public static void main(String[] args) {
		JFrame Janela = new Exemplo09_17_Barras_De_Menu();
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
        if(e.getSource() == micliente){
            T1.setText("Escolhido o item Cliente");
        }
        if(e.getSource() == mifornecedor){
            T1.setText("Escolhido o item Fornecedor");
        }
        if(e.getSource() == mirlcliente){
            T1.setText("Escolhido o item Relacao de Clientes");
        }
        if(e.getSource() == mirlfornecedor){
            T1.setText("Escolhido o item Relacao de Fornecedores");
        }
        if(e.getSource() == misair){
            System.exit(0);
        }
	}
}
