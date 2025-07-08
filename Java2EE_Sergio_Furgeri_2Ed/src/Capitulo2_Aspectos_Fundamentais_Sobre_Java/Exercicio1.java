package Capitulo2_Aspectos_Fundamentais_Sobre_Java;

import java.io.DataInputStream;
import java.io.IOException;

public class Exercicio1 {
    public static void main(String[] args) {
        /*Crie um programa que receba 3 nomes quaisquer por meio de linha de execucao do programa, e os imprima na tela
        * da seguinte maneira: O primeiro e o ultimo nomes serao impressos na primeira linha um após o outro,o outro nome
        * ("o segundo") sera impressos na segunda linha!
        * exemplo:  java Exercicio1 Joao Ana Pedro
        *           Joao Pedro
        *           Ana
        * */
        //Declarando Objeto da Classe DataInputStream
        DataInputStream objeto;

        String nome1, nome2, nome3;


        try {
            System.out.print("Primeiro nome: ");
            objeto = new DataInputStream(System.in); //Instanciando e atribuindo o que é digitado
            nome1 = objeto.readLine();

            System.out.print("\nSegundo nome: ");
            objeto = new DataInputStream(System.in); //Instanciando e atribuindo o que é digitado
            nome2 = objeto.readLine();

            System.out.println("\nTerceiro nome: ");
            objeto = new DataInputStream(System.in); //Instanciando e atribuindo o que é digitado
            nome3 = objeto.readLine();

            System.out.print("\n"+nome1+" "+nome3+"\n "+nome2);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
