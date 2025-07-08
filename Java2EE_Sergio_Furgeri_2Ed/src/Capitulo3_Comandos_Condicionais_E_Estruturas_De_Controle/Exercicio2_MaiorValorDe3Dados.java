package Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle;

import java.util.Scanner;

public class Exercicio2_MaiorValorDe3Dados {
	public static void main(String[] args) {
		/* 3 VALORES E MOSTRE O MAIOR ENTRE ELES*/
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Informe 3 valores: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		if((num1 > num2)&& (num2 > num3)) {
		System.out.println("Maior valor e O PRIMEIRO: "+ num1);
		}else if((num1 < num2)&& (num2 > num3)) {
		System.out.println("Maior valor e O SEGUNDO: "+ num2);
		}else if((num3 > num1)&& (num2 < num3)) {
			System.out.println("Maior valor e O TERCEIRO: "+ num3);
		}else {
			System.out.println("INVALIDO OS DADOS! ");
		}
	}
}
