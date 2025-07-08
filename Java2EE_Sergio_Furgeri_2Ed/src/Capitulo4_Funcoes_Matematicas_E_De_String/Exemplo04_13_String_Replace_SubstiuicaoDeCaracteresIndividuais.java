package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_13_String_Replace_SubstiuicaoDeCaracteresIndividuais {

	public static void main(String[] args) {
		/* A funcao replace() é utilizada para substituicao de caracteres individuais em uma determinada string.
		 * Para seu funcionamento é necessario informar o caractere que deseja substituir e por qual caractere ele
		 * sera substituido.
		 * Caso nao haja na string nenhuma ocorrencia do caractere a ser substituido, a string original é retornada.
		 * 		SINTAXE:
		 * 				<string>.replace(<caracter a ser substituido>,<subtituição>)*/
		String A="banana nanica";
		System.out.println("String: "+A);
		System.out.println();
		System.out.println("Troca caracter 'a' por 'u': "+A.replace('a', 'u'));
		System.out.println("Troca caracter 'n' por 'N': "+A.replace('n', 'N'));
		System.out.println("Troca caracter espaco por '_': "+A.replace(' ', '_'));
	}

}
