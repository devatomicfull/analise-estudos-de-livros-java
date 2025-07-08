package Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle;

import java.util.Scanner;

public class Exercicio1_ProdutoCodigoDeAumento {

	public static void main(String[] args) {
		/* Crie um programa que receba pelo teclado o valor de um produto e um codigo de aumento, segundo 
		 * o exemplo abaixo:
		 * codigo | % aumento
		 * 	 1	  | 	15
		 *   3	  | 	20
		 *   4	  | 	35
		 *   8	  | 	40
		 *   
		 * Utilizando a estrutura switch-case, mostre na tela o novo valor do produto depois de acrescida a 
		 * porcentagem correspondente. Realize tambem o controle dos possiveis erros que podem ocorrer durante a
		 * execução do programa.  
		 * 
		 * java Exercico1_ProdutoCodigoDeAumento 30 2
		 * Valor com aumento: 36
		 * */ 
		Scanner input = new Scanner(System.in);
		
		double produto;
		int codigo;
		double aumento;
		
		   System.out.println("codigo | % aumento\r\n"+ "     1 | 15\r\n"+ "     3 | 20\r\n"+ "     4 | 35\r\n"+ "     8 | 40");
			System.out.println("Entre com o valor do produto: ");
			produto = input.nextDouble();
			System.out.println("Entre com o codigo de aumento: ");
			codigo = input.nextInt();
			
			switch(codigo) {
				case 1:
					aumento = 15;	
					System.out.println("Valor com aumento: "+(produto+(produto*(aumento/100))));
					break;
				case 2: 
					aumento = 20;	
					System.out.println("Valor com aumento: "+(produto+(produto*(aumento/100))));
					break;
				case 3:	
					aumento = 35;
					System.out.println("Valor com aumento: "+(produto+(produto*(aumento/100))));
					break;
				case 4:	
					aumento = 40;
					System.out.println("Valor com aumento: "+(produto+(produto*(aumento/100))));
					break;
				default: System.out.println("Invalido");
		}
	}

}
