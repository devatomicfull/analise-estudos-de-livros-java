package Capitulo5_Criacao_De_Metodos.Exemplo05_07_Classe_Externa_Diversos;

import java.io.IOException;
import java.lang.Math;
import java.io.DataInputStream;

public class Diversos {
	/* Existem varios metodos especificos à entrada de dados via teclado e calculos numericos.
	 * Esses metodos podem ser chamados podem ser  chamados por outras classes  quantas vezes for necessario.
	 * Com o recurso de reaproveitamento de codigo sao criados os PACKAGES (pacotes) em java que agrupam classes
	 * de mesma natureza. 
	 * OS metodos sao os seguintes:
	 * 		leNumeroFloat--> Possibilita a leitura pelo teclado de um numero tipo float dentro de um valor 
	 * 		minimo e um maximo, definidos no momento que o metodo é chamado;
	 * 	
	 * 		leNumeroInt--> Possibilita a leitura pelo teclado de um numero tipo inteiro dentro de um valor 
	 * 		minimo e um maximo, definidos no momento que o metodo é chamado;
	 * 
	 * 		leString --> Possibilita a leitura pelo teclado de qualquer ; soma,subtração, multiplicação, divisão
	 * 		media,quadrado("POTENCIA")-> Metodos que realizam operações matematicas entre os numeros recebidos.
	 * 
	 * 	OBS: a classe Diversos possui varios metodos, porem  nao é uma classe EXECUTAVEL, pois não possui o metodo
	 * 	main.
	 * 
	 *  LEMBRETE: Dessa forma, ela só é executada a partir de outras classes.
	 * 		*/
	
	static DataInputStream dado;
	static String s="";
	
	@SuppressWarnings("deprecation")
	public static float leNumeroFloat(float minimo, float maximo) {
		float n=0;
		try {
			while(true) {
				dado = new DataInputStream(System.in);
				s = dado.readLine();
				n = Float.parseFloat(s);
				if((n < minimo) || (n > maximo))
					System.out.println("Entrada fora da faixa permitida !!");
				else
					break;//encerra loop infinito
			}
		}catch(IOException e) {
			System.out.println("Erro na leitura do teclado ");
		}catch(NumberFormatException e) {
			System.out.println("Digite apenas numeros");
			n = -1; //erro de tipo
		}
		return(n);
	}
	
	public static int leNumeroInt(int minimo, int maximo) {
		int n = 0;
		try {
			while(true) {
				dado = new DataInputStream(System.in);
				s = dado.readLine();
				n = Integer.parseInt(s);
				if((n < minimo) || (n > maximo))
					System.out.println("Entrada fora da faixa permitida !!");
				else
					break; //encerra o loop infinito
			}
		}catch(IOException e) {
			System.out.println("Erro na leitura do teclado !! ");
		}catch(NumberFormatException e) {
			System.out.println(" Digite  apenas numeros !! ");
			n = -1; //erro do tipo
		}
		return(n);
	}
	
	public static String leString() {
		String nome = "";
		try {
			dado = new DataInputStream(System.in);
			nome = dado.readLine();
		}catch(IOException e) {
			System.out.println("Erro  nos dados !! ");
		}
		return(nome);
	}
	
	public static float soma(float num1, float num2) {
		return (num1+num2);
	}
	
	public static float subtracao(float num1, float num2) {
		return (num1-num2);
	}
	
	public static float multiplicacaosub(float num1, float num2) {
		return (num1*num2);
	}
	
	public static float divisao(float num1, float num2) {
		return (num1/num2);
	}
	
	public static float media(float num1, float num2, int num3) {
		return (float)(num1+num2+num3)/3;
	}
	
	public static int quadrado(int num1) {
		return (int) (Math.pow(num1,num1));
	}
}
