package Capitulo2_Aspectos_Fundamentais_Sobre_Java;
import java.io.DataInputStream;
import java.io.IOException;
public class Exercicio2 {

	public static void main(String[] args) throws IOException {
		/*
		 * Faça um programa que receba a quantidade e o valor de 3 produtos, no sequinte formato:
		 * Quantidade 1 Valor1 Quantidade 2 Valor2 Quantidade 3 Valor3.O programa deve calcular esses valores 
		 * seguindo a fórmula: total = Quantidade 1 x Valor1 x  Quantidade 2 x Valor2 x Quantidade 3 x Valor3.
		 * O valor total deve ser apresentado no final da execução do programa, conforme este exemplo abaixo:
		 * 
		 * java Exercicio2 10 1.99 2 5.00 6 3.00
		 * O valor total entre os produtos e: 47.9
		 */
		String texto = "";
		double Quantidade1, Valor1, Quantidade2, Valor2, Quantidade3, Valor3, total;
		DataInputStream informacao;
		
		try {
			System.out.println("Quantidade do Produto: ");
			informacao = new DataInputStream(System.in);
			texto = informacao.readLine();
			Quantidade1 = Double.parseDouble(texto);
			
			System.out.println("Valor do Produto: ");
			informacao = new DataInputStream(System.in);
			texto = informacao.readLine();
			Valor1 = Double.parseDouble(texto);
			
			System.out.println("Quantidade do Produto: ");
			informacao = new DataInputStream(System.in);
			texto = informacao.readLine();
			Quantidade2 = Double.parseDouble(texto);
			
			System.out.println("Valor do Produto: ");
			informacao = new DataInputStream(System.in);
			texto = informacao.readLine();
			Valor2 = Double.parseDouble(texto);
			
			System.out.println("Quantidade do Produto: ");
			informacao = new DataInputStream(System.in);
			texto = informacao.readLine();
			Quantidade3 = Double.parseDouble(texto);
			
			System.out.println("Valor do Produto: ");
			informacao = new DataInputStream(System.in);
			texto = informacao.readLine();
			Valor3 = Double.parseDouble(texto);
			
			total = (Quantidade1 * Valor1 + Quantidade2 * Valor2 + Quantidade3 * Valor3);
			System.out.println("O valor total entre os produtos e: " + total);
			
		}catch(NumberFormatException e){
            System.out.println("Houve erro na conversao, digite apenas caracteres numericos");
        }
		 
		 

	}

}
