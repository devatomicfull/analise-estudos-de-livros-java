package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_14_String_Funcao_ValueOf_ConverteEmString {

	public static void main(String[] args) {
		/* A Funcao  string.valueOf() é usada para converter diversos tipos de dados em strings.
		 * Aceita varios tipos de argumento (numeros ou cadeia de caracteres) e transforma-os em strings.
		 *  Umas das possiveis SINTAXE:
		 *  							String.valueOf(<nome da variavel a ser convertida>)
		 * A baixo Demonstra a conversao de diversos tipos numericos.*/
		//Variaveis Numericas
		int a = 11;
		long b = 222;
		float c = 3333;
		double d = 4.444;
		//String
		String S = String.valueOf(a)+" "+ String.valueOf(b)+" "+String.valueOf(c)+" "+ String.valueOf(d);
		
		System.out.println("Conteudo de s: "+ S);

	}

}
