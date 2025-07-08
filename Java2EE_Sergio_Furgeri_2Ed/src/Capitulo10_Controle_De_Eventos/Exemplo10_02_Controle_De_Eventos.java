package Capitulo10_Controle_De_Eventos;
import Capitulo9_Classes_Do_Pacote_Swing.Exemplo09_20_Card_Layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo10_02_Controle_De_Eventos extends JFrame implements KeyListener{
    /*A
    * 65 */
    JTextField T1,T2;

    public static void main(String[] args) {
        JFrame Janela = new Exemplo10_02_Controle_De_Eventos();
        Janela.show();
        WindowListener x = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        Janela.addWindowListener(x);
    }

    Exemplo10_02_Controle_De_Eventos(){
        setTitle("Codigo das teclas");
        setSize(220,90);
        setResizable(false);
        setLocation(100,100);

        getContentPane().setLayout(new GridLayout(2,1));

        T1 = new JTextField();
        T2 = new JTextField();

        T1.addKeyListener(this);

        getContentPane().add(T1);
        getContentPane().add(T2);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        T2.setText(""+e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
