package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_03_Funcao_Max_MaiorValorEntre2Numeros {

	public static void main(String[] args) {
		/* A funcao max() é utilizada para verificar o maior valor entre dois numeros, que podem ser do tipo double,
		 * float, int ou long.
		 * SINTAXE:
		 * 			Math.max(<valor1>, <valor2>)
		 * 
		 * 
		 * OBSERVE que o calculo do maior numero pode ocorrer entre dois numeros do mesmo tipo de dados ou nao, ou seja,
		 * pode-se obter o maior entre dois numeros do tipo double, entre dois numeros do tipo int ou entre um tipo double
		 * e outro do tipo int.
		 * 
		 * Resultado correto do exemplo, abaixo:
		 * 
		 * O Maior entre 10 e 15 e: 15
		 * O Maior entre -5.9 e -4.5 e: -4.5
		 * O Maior entre 10 e -5.9 e: 10.0 
		 * */
		
		int A=10,B=15;
		double C=-5.9,D=-4.5;
		
		System.out.println("O Maior entre 10 e 15 e: "+ Math.max(A, B));
		System.out.println("O Maior entre -5.9 e -4.5 e: "+ Math.max(C, D));
		System.out.println("O Maior entre 10 e -5.9 e: "+ Math.max(A, C));

	}

}
