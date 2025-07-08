package Capitulo2_Aspectos_Fundamentais_Sobre_Java;

public class Exemplo02_05_Conversao_De_Tipos {
    public static void main(String[] args) {
        double nota1, nota2, trabalho, media;
        nota1 = Double.parseDouble(args[0]);
        nota2 = Double.parseDouble(args[1]);
        trabalho = Double.parseDouble(args[2]);
        media = (nota1+nota2+trabalho)/3;
        System.out.println("Media = "+ media);

        // COMO EXECUTAR NO TERMINAL
        // java Exemplo02_05_Conversao_De_Tipos 9.5 10.0 7.5

    }
}
