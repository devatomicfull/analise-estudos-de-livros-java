package Capitulo9_Classes_Do_Pacote_Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo09_20_Card_Layout extends JFrame implements ActionListener{
    JPanel painelBotoes, painelCard,P1,P2,P3;
    JButton B1,B2,B3,B4,B5,B6,btpainel1,btpainel2,btpainel3;
    JLabel L1,L2,L3;
    JTextField T1,T2;

    public static void main(String[] args) {
        JFrame Janela = new Exemplo09_20_Card_Layout();
        Janela.show();
        WindowListener x = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        Janela.addWindowListener(x);
    }

    Exemplo09_20_Card_Layout(){
        setTitle("Uso do gerenciador CardLayout");
        setSize(280,170);
        setLocation(50,50);

        getContentPane().setBackground(new Color(0,128,128));
        getContentPane().setLayout(new BorderLayout());

        B1 = new JButton("Botao 1");
        B2 = new JButton("Botao 2");
        B3 = new JButton("Botao 3");
        B4 = new JButton("Botao 4");
        B5 = new JButton("Botao 5");
        B6 = new JButton("Botao 6");

        L1 = new JLabel("Esse e o painel 1",JLabel.CENTER);
        L2 = new JLabel("Esse e o painel 2",JLabel.CENTER);
        L3 = new JLabel("Esse e o painel 3",JLabel.CENTER);

        T1 = new JTextField("Linguagem", 20);
        T2 = new JTextField("Java",10);

        btpainel1 = new JButton("Painel 1");
        btpainel1.addActionListener(this);

        btpainel2 = new JButton("Painel 2");
        btpainel2.addActionListener(this);

        btpainel3 = new JButton("Painel 3");
        btpainel3.addActionListener(this);

        painelCard = new JPanel();
        painelCard.setLayout(new CardLayout());

        painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(1,3));

        P1 = new JPanel();
        P1.setLayout(new FlowLayout());
        P1.add(L1);
        P1.add(T1);
        P1.add(T2);

        P2 = new JPanel();
        P2.setLayout(new GridLayout(4,1));
        P2.add(L2);
        P2.add(B1);
        P2.add(B2);
        P2.add(B3);

        P3 = new JPanel();
        P3.setLayout(new BorderLayout());
        P3.add("North",B4);
        P3.add("Center",L3);
        P3.add("East",B5);
        P3.add("South",B6);

        painelBotoes.add(btpainel1);
        painelBotoes.add(btpainel2);
        painelBotoes.add(btpainel3);

        painelCard.add(P1,"p1");
        painelCard.add(P2,"p2");
        painelCard.add(P3,"p3");

        getContentPane().add("North", painelBotoes);
        getContentPane().add("South",painelCard);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CardLayout cl = (CardLayout) painelCard.getLayout();

        if(e.getSource()==btpainel1)            //se pressionado o botao painel 1
            cl.show(painelCard,"p1");     //exiba o painel 1

        if(e.getSource()==btpainel2)            //se pressionado o botao painel 2
            cl.show(painelCard,"p2");     //exiba o painel 2

        if(e.getSource()==btpainel3)            //se pressionado o botao painel 3
            cl.show(painelCard,"p3");     //exiba o painel 3
    }
}
