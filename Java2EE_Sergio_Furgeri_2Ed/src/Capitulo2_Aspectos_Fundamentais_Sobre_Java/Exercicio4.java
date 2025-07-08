package Capitulo2_Aspectos_Fundamentais_Sobre_Java;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Crie um programa que receba 4 valores quaisquer e mostre a média entre eles, o somatório entre eles e 
		 * o resto da divisão do somatório por cada um dos valores!
		 * veja o exemplo abaixo:
		 * 
		 * java Exercicio4 5 7 12 21 - Caso o codigo seja escrito usando o args
		 * 
		 * A media entre os valores é: 11.25
		 * A somatória dos valores é: 45.0 
		 * O resto da divisão entre a somatoria pelo 1 numero: 0.0
		 * O resto da divisão entre a somatoria pelo 2 numero: 3.0
		 * O resto da divisão entre a somatoria pelo 3 numero: 9.0
		 * O resto da divisão entre a somatoria pelo 4 numero: 3.0
		 * */
		// ATRIBUTOS
		double valor1, valor2, valor3, valor4, mediaValores, somatorio;
		
		// DECLARANDO E INSTACIANDO O INPUT DA CLASSE SCANNER
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o 1 valor: ");
		valor1 = input.nextDouble();
		System.out.println("Digite o 2 valor: ");
		valor2 = input.nextDouble();
		System.out.println("Digite o 3 valor: ");
		valor3 = input.nextDouble();
		System.out.println("Digite o 4 valor: ");
		valor4 = input.nextDouble();
		
		mediaValores = (valor1+valor2+valor3+valor4)/4;
		somatorio = (valor1+valor2+valor3+valor4);
		
		System.out.println("A media entre os valores e: "+ mediaValores);
		System.out.println("A somatoria dos valores e: "+ somatorio);
		System.out.println("O resto da divisao entre a somatoria pelo 1 numero: "+ (somatorio%valor1));
		System.out.println("O resto da divisao entre a somatoria pelo 2 numero: "+ (somatorio%valor2));
		System.out.println("O resto da divisao entre a somatoria pelo 3 numero: "+ (somatorio%valor3));
		System.out.println("O resto da divisao entre a somatoria pelo 4 numero: "+ (somatorio%valor4));
		
		
		

	}

}
