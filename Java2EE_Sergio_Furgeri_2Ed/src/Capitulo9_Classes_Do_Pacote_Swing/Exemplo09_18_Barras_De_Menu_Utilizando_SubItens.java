package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo09_18_Barras_De_Menu_Utilizando_SubItens extends JFrame implements ActionListener{
    JMenuBar M1;
    JMenu menuArquivo, menuSave;
    JMenuItem miNovo, miAbrir, miSair, miSalvar, miSalvarC, miSalvarT;

    public static void main(String[] args) {
        JFrame Janela = new Exemplo09_18_Barras_De_Menu_Utilizando_SubItens();
        Janela.show();
        WindowListener x = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        Janela.addWindowListener(x);
    }

    Exemplo09_18_Barras_De_Menu_Utilizando_SubItens(){
        setTitle("Uso de Menus");
        setSize(250,150);
        setLocation(50,50);
        getContentPane().setBackground(new Color(0,128,128));
        M1 = new JMenuBar();

        menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic(KeyEvent.VK_A);
        menuArquivo.addActionListener(this);

        menuSave = new JMenu("Save");
        miNovo = new JMenuItem("Novo", new ImageIcon("C:\\Users\\gon_rage\\eclipse-workspace\\Java2EE_Sergio_Furgeri_2Ed\\src\\Capitulo9_Classes_Do_Pacote_Swing\\MenuNovo.png"));
        miNovo.addActionListener(this);
        miNovo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.ALT_MASK));
        miNovo.setMnemonic(KeyEvent.VK_N);

        miAbrir = new JMenuItem("Abrir", new ImageIcon("C:\\Users\\gon_rage\\eclipse-workspace\\Java2EE_Sergio_Furgeri_2Ed\\src\\Capitulo9_Classes_Do_Pacote_Swing\\MenuAbrir.png"));
        miAbrir.addActionListener(this);
        miAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK));
        miAbrir.setMnemonic(KeyEvent.VK_B);

        miSalvar = new JMenuItem("Salvar", new ImageIcon("C:\\Users\\gon_rage\\eclipse-workspace\\Java2EE_Sergio_Furgeri_2Ed\\src\\Capitulo9_Classes_Do_Pacote_Swing\\MenuSalvar.png"));
        miSalvar.addActionListener(this);
        miSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
        miSalvar.setMnemonic(KeyEvent.VK_S);

        miSalvarC = new JMenuItem("Salvar Como");
        miSalvarC.addActionListener(this);
        miSalvarC.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        miSalvarC.setMnemonic(KeyEvent.VK_C);

        miSalvarT = new JMenuItem("Salvar Tudo");
        miSalvarT.addActionListener(this);
        miSalvarT.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
        miSalvarT.setMnemonic(KeyEvent.VK_T);

        miSair = new JMenuItem("Sair", new ImageIcon("C:\\Users\\gon_rage\\eclipse-workspace\\Java2EE_Sergio_Furgeri_2Ed\\src\\Capitulo9_Classes_Do_Pacote_Swing\\MenuSair.png"));
        miSair.addActionListener(this);
        miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.ALT_MASK));
        miSair.setMnemonic(KeyEvent.VK_A);

        menuSave.add(miSalvar);                        menuSave.add(miSalvarC);
        menuSave.add(miSalvarT);                       menuArquivo.add(miNovo);
        menuArquivo.add(miAbrir);                      menuArquivo.add(menuSave);
        menuArquivo.addSeparator();                    menuArquivo.add(miSair);

        M1.add(menuArquivo);
        setJMenuBar(M1);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==miNovo){
            JOptionPane.showMessageDialog(null,"menu Novo.","Usando menus",JOptionPane.INFORMATION_MESSAGE);
        }

        if(e.getSource()==miAbrir){
            JOptionPane.showMessageDialog(null,"menu Abrir.","Usando menus",JOptionPane.INFORMATION_MESSAGE);
        }

        if(e.getSource()==miSalvar){
            JOptionPane.showMessageDialog(null,"Sub-menu Salvar","Usando menus",JOptionPane.INFORMATION_MESSAGE);
        }

        if(e.getSource()==miSalvarC){
            JOptionPane.showMessageDialog(null,"Sub-menu Salvar Como.","Usando menus",JOptionPane.INFORMATION_MESSAGE);
        }

        if(e.getSource()==miSalvarT){
            JOptionPane.showMessageDialog(null,"Sub-menu Salvar Tudo.","Usando menus",JOptionPane.INFORMATION_MESSAGE);
        }

        if(e.getSource()==miSair) {
            System.exit(0);
        }
    }
}

