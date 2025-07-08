package Capitulo2_Aspectos_Fundamentais_Sobre_Java;

public class Exemplo02_03_Operadores_Aritmeticos { //OPERADORES: ARITMETICOS, LOGICOS E RELACIONAIS
    public static void main(String[] args) {
        //DECLARACAO E INICIALIZACAO DE VARIAVEIS
        int x = 10; int y = 3;
        //VARIAS OPERACOES COM AS VARIAVEIS
        System.out.println("X = "+ x);
        System.out.println("Y = "+y);
        System.out.println("-X "+(-x));
        System.out.println("X/Y = "+(x/y));
        System.out.println("Resto de X por Y =  "+ (x%y));
        System.out.println("Inteiro de X por Y = "+(int) (x/y));
        System.out.println("X + 1 = "+ (++x));

        /*Operadores Relacionais possibilitam comparar valores ou expressoes, retornando um resultado logico verdadeiro
        * ou falso.
        * Operadores Logicos permite avaliar o resultado logico de diferentes operacoes aritmeticas em uma expressao.
        * */


    }
}
