package Capitulo8_Utilizacao_De_Arrays;

public class Exemplo08_02_Array_Unidimensional_Inicialização_Direta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomes="";
		char caracterArray[] = {'a','b','c','d','e','f','g'};//array de caracteres
		System.out.println("Mostrando o array: "+String.valueOf(caracterArray));
		System.out.println("Quantidade de elementos: "+caracterArray.length);
		System.out.println("Do 1 ao 3 caracter "+String.valueOf(caracterArray,0,3));
		System.out.println();
		
		//CRIANDO UM ARRAY DE STRINGS
		String StringArray[] = {"Aprendendo","a","linguagem","Java"};
		for(int i=0; i < StringArray.length; i++) {//armazena os nomes no array
			nomes = nomes + StringArray[i]+" ";
		}
		System.out.println("Mostrando o array: "+ nomes);
		System.out.println("Quantidade de elementos do array: "+StringArray.length);
		System.out.println("Mostrando o 1 elemento do array: "+ StringArray[0]);
		System.out.println("Mostrando o ultimo elemento do array: "+StringArray[StringArray.length-1]);
	}
}
