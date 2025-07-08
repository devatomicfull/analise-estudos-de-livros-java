package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_05_Funcao_Sqrt_CalcularRaizQuadrada {

	public static void main(String[] args) {
		/* Resultado correto do exemplo, abaixo:
		 * 
		 * A Funcao sqrt() é utilizada para calcular a raiz quadrada de um determinado numero, sendo que o numero
		 * do qual deseja extrai a raiz quadrada deve ser do tipo double e o resultado obtido tambem será um numero
		 * do tipo double.
		 * SINTAXE:
		 * 			Math.sqrt(<valor do tipo double>)
		 * 
		 * Resultado correto do exemplo, abaixo:
		 * 
		 * A raiz quadrada de 900 e: 30.0
		 * A raiz quadrada de 30.25 e: 5.5
		 * 
		 * */
		double A=900,B=30.25;
		
		System.out.println("A raiz quadrada de 900 e: "+Math.sqrt(A));
		System.out.println("A raiz quadrada de 30.25 e: "+Math.sqrt(B));

	}

}
