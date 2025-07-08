package Capitulo5_Criacao_De_Metodos;

public class Exemplo05_05_Sobrecarga {

	public static void main(String[] args) {
		/* Sobrecarga: Permite que varios metodos sejam definidos com o mesmo nome, desde que eles tenham um 
		 * conjunto de parametros diferentes, ou seja, essas diferencas  podem ser com base no numero, nos tipos
		 * ou na ordem dos parametros.
		 * Quando um metodo sobrecarregado é chamado, o compilador avalia e seleciona o metodo mais adequado a 
		 * situacao, examinando o numero, os tipos e a ordem dos argumetnos na chamada; portanto, os metodos
		 * sobrecarregados sao utilizados para realização de tarefas semelhantes sobre tipos de dados diferentes.
		 * 	usamos SOBRECARGA diversas vezes--> considere o System.out.println().
		 * println() pode receber diversos tipos de dados como argumento, isto é, pode-se enviar dado do tipo inteiro
		 * ser impresso, double , ou ainda string.*/
		
		/* Demonstra um metodo de mesmo nome sendo declarado 3 vezes, isto é, utilizando o recurso de sobrecarga
		 * metodo area declarado 3 vezes.*/
		
		
		//cada linha passsa uma quantidade diferente de argumentos
		/* Compreende que é este metodo area (x) pois apenas 1 valor esta sendo enviado */
		System.out.println("Area de um quadrado..."+area(3));
		/* Compreende que é este metodo area(x,y) pois apenas 2 valores estao sendo enviados */
		System.out.println("Area de um quadrado..."+area(3,2));
		/* Compreende que é este metodo area(x,y,z) pois apenas 3 valores estao sendo enviados */
		System.out.println("Area de um quadrado..."+area(3,2,5));

	}
	public static double  area (int x) {
		return x*x;
	}
	
	public static double  area (int x,int y) {
		return x*y;
	}
	
	public static double  area (int x,int y,int z) {
		return x*y*z;
	}

}
