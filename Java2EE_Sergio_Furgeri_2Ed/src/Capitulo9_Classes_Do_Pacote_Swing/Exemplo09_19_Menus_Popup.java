package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo09_19_Menus_Popup extends JFrame implements ActionListener{
    JPopupMenu mpopup;
    JMenuItem miCopiar, miColar, miSalvar;
    JMenuBar M1;
    JTextField T1;
    JButton B1, B2;

    public static void main(String[] args) {
        JFrame Janela = new Exemplo09_19_Menus_Popup();
        Janela.show();
        WindowListener x = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        Janela.addWindowListener(x);
    }

    Exemplo09_19_Menus_Popup(){
        setTitle("Uso de Menus Popup");
        setSize(220,120);
        setLocation(50,50);

        getContentPane().setBackground(new Color(0,128,128));
        getContentPane().setLayout(new GridLayout(3,1));

        M1 = new JMenuBar();
        T1 = new JTextField();
        B1 = new JButton("Botao 1");
        B2 = new JButton("Botao 2");

        mpopup = new JPopupMenu();
        MouseListener registra = new MostraPopup();
        B1.addMouseListener(registra);

        miCopiar = new JMenuItem("Copiar");
        miCopiar.addActionListener(this);
        miCopiar.setMnemonic(KeyEvent.VK_C);

        miColar = new JMenuItem("Colar");
        miColar.addActionListener(this);
        miColar.setMnemonic(KeyEvent.VK_O);

        miSalvar = new JMenuItem("Salvar", new ImageIcon("C:\\Users\\gon_rage\\eclipse-workspace\\Java2EE_Sergio_Furgeri_2Ed\\src\\Capitulo9_Classes_Do_Pacote_Swing\\MenuSalvar.png"));
        miSalvar.addActionListener(this);
        miSalvar.setMnemonic(KeyEvent.VK_S);

        mpopup.add(miCopiar);
        mpopup.add(miColar);
        mpopup.add(miSalvar);

        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(T1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==miCopiar)
            T1.setText("Copiar");
        if(e.getSource()==miColar)
            T1.setText("Colar");
        if(e.getSource()==miSalvar)
            T1.setText("Salvar");
    }

    class MostraPopup extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            mpopup.show(e.getComponent(),e.getX(),e.getY());
        }
    }
}
