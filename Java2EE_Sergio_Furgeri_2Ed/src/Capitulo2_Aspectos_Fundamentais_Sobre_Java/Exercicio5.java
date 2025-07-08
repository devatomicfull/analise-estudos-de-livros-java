package Capitulo2_Aspectos_Fundamentais_Sobre_Java;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Uma determinada pessoa que trabalha com a construção de piscinas  precisa de um programa que calcule o valor
		 * das construções solicitadas pelos clientes, sabendo-se que os clientes sempre fornecem o comprimento, largura
		 * e a profundidade da piscina a ser construida. Leve em consideração que o valor da construção é cobrado por m3 
		 * de água que a piscina conterá e o preço é de 45,00 por m3"cubico", veja o exemplo abaixo:
		 * 
		 * java Exercicio5 12 4 2
		 * A piscina solicitada tera: 96.0 Metros cubicos.
		 * O valor da construção sera de: R$4320.0*/
		
		// ATRIBUTOS
		double largura, comprimento, altura, metroCubico, precoFinal =0 ;
		double precoServico = 45.00;
		
		// DECLARANDO E INSTACIANDO O INPUT DA CLASSE SCANNER
		Scanner input = new Scanner(System.in);
		
		// DecimalFormat format = new DecimalFormat("0.##");
		// format.format(precoFinal)
		
		System.out.println("Informe a largura: ");
		largura = input.nextDouble();
		System.out.println("Informe o comprimento: ");
		comprimento = input.nextDouble();
		System.out.println("Informe a altura: ");
		altura = input.nextDouble();
		
		metroCubico = (altura*comprimento*largura); //Calculo de metros cubicos
		// o primeiro 1000 é unidade de medida -> 1cm3 = 1000Liros
		// o segundo 1000 é para ficar igual o exemplo da questão
		precoFinal = ((metroCubico*1000)*45)/1000; // preco em cima do metro cubico

		System.out.println("O preco cobrado por Metro cubico e: R$"+ precoServico);
		System.out.println("A piscina solicitada tera: "+ metroCubico +" Metros cubicos.");
		System.out.println("O valor da construcao sera de: R$"+precoFinal);

	}

}
