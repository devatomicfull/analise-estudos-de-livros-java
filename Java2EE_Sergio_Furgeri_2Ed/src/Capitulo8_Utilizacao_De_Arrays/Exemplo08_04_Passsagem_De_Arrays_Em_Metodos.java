package Capitulo8_Utilizacao_De_Arrays;

import Capitulo5_Criacao_De_Metodos.Exemplo05_07_Classe_Externa_Diversos.Diversos;

public class Exemplo08_04_Passsagem_De_Arrays_Em_Metodos {

	public static void main(String[] args) {		
		
		int N[] = new int[10];//cria um array de 10 elementos
		for(int i=0; i<10;i++) {//armazena os argumentos no array
			System.out.println("Digite o numero "+ (i+1));
			N[i] = Diversos.leNumeroInt(0,1000); // le um numero entre 0 e 1000
			if(N[i] == -1)//foi digitado um numero invalido
				i--;//retorna o indice;
		}
		
		for(int i=0; i<10;i++) {//ordem original do array
			System.out.println(N[i]);
		}
		
		System.out.println();
		
		N = ordenaArrayInt(N);//oderna o array
		System.out.println("Em ordem crescente: ");
		mostraArray(N);	
		
	}
	
	public static int[] ordenaArrayInt(int arr[]) {
		int x,y,aux;
		for(x=0; x < arr.length;x++) {
			for(y=0; y < arr.length; y++) {
				if(arr[x]<arr[y]) {
					aux = arr[y];
					arr[y] = arr[x];
					arr[x] = aux;
				}
			}
		}
		return arr;
	}
		
	public static void mostraArray(int arr[]) {
		for(int i=0; i < arr.length; i++) {//mostra o array ordenado
			System.out.println(arr[i]+ " ");
		}
	}
}
