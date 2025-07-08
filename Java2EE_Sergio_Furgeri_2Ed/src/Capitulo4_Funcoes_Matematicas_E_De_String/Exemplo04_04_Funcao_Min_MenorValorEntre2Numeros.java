package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_04_Funcao_Min_MenorValorEntre2Numeros {

	public static void main(String[] args) {
		/* A funcao min() Utilizada para obter o valor minimo entre dois numeros.
		 * Do mesmo modo da Funcao max(), esses numeros tambem podem ser do tipo double, float, int, ou long.
		 * SINTAXE:
		 * 			Math.min(<valor1>, <valor2>)
		 * 
		 * Resultado correto do exemplo, abaixo:
		 * 
		 * O Maior entre 10 e 15 e: 10
		 * O Maior entre -5.9 e -4.5 e: -5.9
		 * O Maior entre 10 e -5.9 e: -5.9
		 * */
		
		int A=10,B=15;
		double C=-5.9,D=-4.5;
		
		System.out.println("O Maior entre 10 e 15 e: "+ Math.min(A, B));
		System.out.println("O Maior entre -5.9 e -4.5 e: "+ Math.min(C, D));
		System.out.println("O Maior entre 10 e -5.9 e: "+ Math.min(A, C));
		

	}

}
