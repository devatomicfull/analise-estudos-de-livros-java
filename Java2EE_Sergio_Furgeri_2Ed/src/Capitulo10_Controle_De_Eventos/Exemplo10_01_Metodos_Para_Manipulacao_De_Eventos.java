package Capitulo10_Controle_De_Eventos;

import Capitulo9_Classes_Do_Pacote_Swing.Exemplo09_20_Card_Layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo10_01_Metodos_Para_Manipulacao_De_Eventos extends JFrame implements MouseListener, KeyListener,TextListener,FocusListener, MouseMotionListener {
    JButton B1;
    JLabel L1, L2;
    JTextField T1, T2;
    TextField T3;

    static int E = 100, T = 100;

    public static void main(String[] args) {
        JFrame Janela = new Exemplo10_01_Metodos_Para_Manipulacao_De_Eventos();
        Janela.show();
        WindowListener x = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            public void windowActivated(WindowEvent e) {
                //A Janela foi ativada
            }

            public void windowDeactivated(WindowEvent e) {
                //A Janela foi desativada
            }

            public void windowIconified(WindowEvent e) {
                //A Janela foi minimizada
            }

            public void windowDeiconified(WindowEvent e) {
                //A Janela foi restaurada
            }

            public void windowOpened(WindowEvent e) {
                mostraMensagem("A Janela foi Aberta");
            }

            public void windowClosed(WindowEvent e) {
                //A Janela foi fechada
            }
        };
        Janela.addWindowListener(x);

        ComponentListener y = new ComponentAdapter() {
            @Override

                public void componentHidden (ComponentEvent e){
                    mostraMensagem("A Janela tornou-se oculta");
                }

                public void componentMoved (ComponentEvent e){
                    mostraMensagem("A Janela foi movida");
                }

                public void componentResized (ComponentEvent e){
                    mostraMensagem("A Janela foi redimensionada");
                }

                public void componentShown (ComponentEvent e){
                    mostraMensagem("A Janela tornou-se Visivel");
                }
            };
            Janela.addComponentListener(y);
    }

        Exemplo10_01_Metodos_Para_Manipulacao_De_Eventos() {
            setTitle("Manipulacao de Eventos");
            setSize(280, 200);
            setLocation(E, T);

            getContentPane().setLayout(new GridLayout(6, 1));

            L1 = new JLabel("");
            L2 = new JLabel("");
            B1 = new JButton("Eventos do Botao");
            T1 = new JTextField();
            T2 = new JTextField();
            T3 = new TextField();

            B1.addMouseListener(this);
            B1.addMouseMotionListener(this);
            B1.setBackground(Color.gray);

            T1.addKeyListener(this);
            T3.addTextListener(this);
            T3.addKeyListener(this);
            T3.addFocusListener(this);

            getContentPane().add(B1);
            getContentPane().add(L1);
            getContentPane().add(L2);
            getContentPane().add(T1);
            getContentPane().add(T3);
            getContentPane().add(T2);
        }

    //METODOS RELATIVOS A MouseListener
    public void mousePressed(MouseEvent e) {
        L1.setText("O botao do Mouse foi pressionado");
    }

    public void mouseClicked(MouseEvent e) {
        L1.setText("O botao do Mouse foi solto");
    }

    public void mouseEntered(MouseEvent e) {
        //O ponteiro do Mouse Entrou na Area
        B1.setBackground(Color.yellow);
    }

    public void mouseExited(MouseEvent e) {
        //O ponteiro do Mouse Saiu da Area
        B1.setBackground(Color.gray);
    }

    public void mouseReleased(MouseEvent e) {
        L1.setText("O ponteiro do Mouse foi Arrastado");
    }

    //METODOS RELATIVOS A MouseMotionListener
    public void mouseMoved(MouseEvent e) {
        L2.setText("Mouse se moveu em" + e.getX() + " , " + e.getY());
    }

    public void mouseDragged(MouseEvent e) {
        L2.setText("Mouse foi arrastado em " + e.getX() + " , " + e.getY());
    }

    //METODOS RELATIVOS A KeyListener
    public void keyPressed(KeyEvent e) { //Uma tecla foi pressionada
        if (e.getSource() == T1) {
            if (e.getKeyCode() == 10 || e.getKeyCode() == 9) {//Enter ou TAB
                e.setKeyCode(9);//gera TAB
                return;
            }

            if (e.getKeyCode() == 38) { //Seta direcional para cima
                T = T - 5;
                setLocation(E, T); //Movimenta tela para Cima
            }

            if (e.getKeyCode() == 40) { //Seta direcional para baixo
                T = T + 5;
                setLocation(E, T); //Movimenta tela para baixo
            }

            if (e.getKeyCode() == 37) { //Seta direcional para esquerda
                E = E - 5;
                setLocation(E, T); //Movimenta tela para esquerda
            }

            if (e.getKeyCode() == 39) { //Seta direcional para direita
                E = E + 5;
                setLocation(E, T); //Movimenta tela para direita
            }
        }

        if (e.getSource() == T3) {
            if (e.getKeyCode() == 10 || e.getKeyCode() == 9) { //Enter oo TAB
                e.setKeyCode(9); //Gera TAB
                return;
            }

            if (e.getKeyCode() == 8) { //Verificar se a tecla pressionada é BackSpace
                return; // Se for BackSpace cai fora
            }

            if (e.getKeyCode() < 96 || e.getKeyCode() > 105) { // Não é Teclado Numerico
                e.setKeyCode(e.VK_ESCAPE); // Cancela a tecla pressionada
                return;
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        //Uma tecla foi solta
    }

    public void keyTyped(KeyEvent e) {
        //Uma tecla Unicode foi pressionada
    }

    //METODO RELATIVO A TextListener
    public void textValueChanged(TextEvent e) { // O Conteudo do campo texto foi alterado
        int n1, n2;
        try {
            n1 = Integer.parseInt(T1.getText());
            n2 = Integer.parseInt(T3.getText());
            T2.setText("" + n1 * n2);
        } catch (NumberFormatException erro) {
            T2.setText("0");
            return;
        }
    }

    public void focusGained(FocusEvent e) { // O Objeto Recebeu o foco
        L1.setText("O objeto T3 Recebeu o foco");
    }

    public void focusLost(FocusEvent e) { // O Objeto perdeu o foco
        L1.setText("O objeto T3 Perdeu o foco");
    }

    public static void mostraMensagem(String men) {
        JOptionPane.showMessageDialog(null, men, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }
}
