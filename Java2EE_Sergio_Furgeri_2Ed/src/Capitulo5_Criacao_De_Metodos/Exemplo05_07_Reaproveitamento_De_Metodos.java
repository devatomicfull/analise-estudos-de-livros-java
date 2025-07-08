package Capitulo5_Criacao_De_Metodos;

import Capitulo5_Criacao_De_Metodos.Exemplo05_07_Classe_Externa_Diversos.Diversos;

public class Exemplo05_07_Reaproveitamento_De_Metodos {

	public static void main(String[] args) {
		/* Neste ponto deve ter ficado claro ao leitor que é possivel criar um sistema a partir de pedaços menores,
		 * agrupando todos eles. Esses pedacos menores se referem aos metodos. 
		 * Essa metodologia de desenvolvimento é conhecida como MODULARIDADE, isto é, UM SISTEMA É CONSTRUÍDO A PARTIR
		 * DE PEQUENOS MODULOS: OS METODOS.
		 * 
		 * */
		System.out.println("Entre com uma nota de prova ");
		float n = -1;
		while (n == -1) {//le enquanto o usuario nao digitar um numero
			n = Diversos.leNumeroFloat(0, 10);
			
			System.out.println("Nota digitada = "+n);
			System.out.println("Entre com uma idade");
			
			int i = -1;
			while(i == -1) {//le enquanto o usuario nao digitar um numero
				i = Diversos.leNumeroInt(0, 150);
				System.out.println("Nota digitada = "+i);
				System.out.println("Entre com um nome");
				System.out.println(Diversos.leString());
				System.out.println("A media de 1,3,5 = "+Diversos.media(1, 3, 5));
			}
		}

	}

}
