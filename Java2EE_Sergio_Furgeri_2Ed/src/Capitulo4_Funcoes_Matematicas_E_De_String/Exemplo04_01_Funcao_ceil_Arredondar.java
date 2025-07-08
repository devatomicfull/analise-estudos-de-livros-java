package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_01_Funcao_ceil_Arredondar {

	public static void main(String[] args) {
		/* A funcao ceil( ), ou método, como e chamada em java, e utilizada para arredondar um numero do tipo double
		 * para o seu proximo inteiro.
		 * SINTAXE:
		 * 			Math.ceil(<valor do tipo double>)
		 * Chamada para realizar  o arredondamento do numero tipo double contido entre parenteses, que neste exemplo
		 * está representado pela variavel.
		 * 	As variaveis entre parenteses compoem o argumento(do tipo double) do metodo Math.ceil.
		 * Retorna um resultado arredondado, mantendo o tipo do dado, isto é, a variavel retornada tambem sera do tipo
		 * double, porém mostrando apenas a parte inteira do numero verificado. 
		 * O tipo double é o unico que pode ser utilizado, uma vez que o método ceil() não aceita o tipo float.
		 * 
		 * Resultado correto do exemplo abaixo
		 * 
		 * Arredondando 5.2 = 6.0
		 * Arredondando 5.6 = 6.0
		 * Arredondando -5.8 = -5.0
		 * 
		 * 
		 * */
		double A=5.2, B=5.6, C=-5.8;
		System.out.println("Arredondando 5.2 = "+ Math.ceil(A));
		System.out.println("Arredondando 5.6 = "+ Math.ceil(B));
		System.out.println("Arredondando -5.8 = "+ Math.ceil(C));
	}

}
