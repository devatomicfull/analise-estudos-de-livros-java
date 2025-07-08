package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_09_String_Funcao_CharAt_Retorna_1_CaracterDaString {

	public static void main(String[] args) {
		/* A Funcao charAt() é utilizada para retornar um caractere de um determinada String de acordo com o indice
		 * especificado entre parênteses.
		 * Esse índice refere-se à posição do caractere na String, Sendo "0 -zero" o índice do primeiro caractere, 
		 * 1 do segundo caractere, assim por diante 
		 * 
		 * A funcao é util quando for necessario verificar a existencia de um caractere na String. 
		 * Por exemplo: 
		 * 				Suponha que uma determinada string só possa conter numeros - a função chartAt() pode ser 
		 * 				usada para verificar a existencia de digitos numericos nessa String.
		 * SINTAXE:
		 * 			<string>.chartAt(<indice>)
		 * 
		 * */
		
		String A = "Aprendendo Java";
		System.out.println("String = "+A);
		/* Repare que o 5 caractere apresentado é o "d" e não o "n", pois o indice comeca a partir do zero.*/
		System.out.println("Caracter 5 do indice dessa palavra e: "+A.charAt(5));
		
		System.out.println("\nExiba a palavra comencando do Indice 11 e terminando no Indice 14");
		for(int i=11; i<=14; i++) {
			System.out.print(A.charAt(i));
		}

	}

}
