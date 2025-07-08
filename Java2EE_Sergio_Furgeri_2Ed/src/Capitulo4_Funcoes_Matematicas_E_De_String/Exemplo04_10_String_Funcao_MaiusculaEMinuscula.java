package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_10_String_Funcao_MaiusculaEMinuscula {

	public static void main(String[] args) {
		/* A Funcao toUpperCase(): Transforma todas letras da String em MAIUSCULAS
		 * A Funcao toLowerCase(): Transforma todas letras da String em MINUSCULAS
		 * 
		 * SINTAXE:
		 * 			<string>.toUpperCase() ou <string>.toLowerCase()
		 * */
		String A= "ARROZ", B="batata";
		
		System.out.println("ARROZ em minuscula = "+A.toLowerCase());
		System.out.println("batata em maiusculo = "+B.toUpperCase());
		System.out.println("SaLaDa em minusculo = "+"SaLaDa".toLowerCase());

	}

}
