package Capitulo5_Criacao_De_Metodos;

public class Exemplo05_04_Recursividade {

	public static void main(String[] args) {
		/* A recursividade ocorre quando um metodo chama a si proprio, direta ou indiretamente por meio de outro
		 * metodo.
		 * 
		 * Recursividade gerada para imprimir o fatorial dos numeros inteiros de 0 a 10.
		 * */
		for(long i =0; i<=10; i++) 
			System.out.println(i+ "! = "+fatorial(i));
	}
	
	public static long fatorial(long num) {
		if(num<=1)
			return 1;
		else
			return num*fatorial(num-1);
	}
}
