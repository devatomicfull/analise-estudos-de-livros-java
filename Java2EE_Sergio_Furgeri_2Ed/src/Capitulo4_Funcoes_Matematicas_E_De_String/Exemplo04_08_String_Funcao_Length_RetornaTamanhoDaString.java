package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_08_String_Funcao_Length_RetornaTamanhoDaString {

	public static void main(String[] args) {
		/* A funcao length() é utilizada para retornar o tamanho de uma determinada string, incluindo tambem
		 * os espaços em branco presentes nela. Esta função retorna sempre um valor do tipo int.
		 * 	SINTAXE:
		 * 			<string>.length()
		 * 
		 * Na pratica a funcao length é muito usada quando é necessario ler uma variavel String do começo ate o
		 * final, tanto para a busca de caracteres quanto para a criação de banners, algo extremamente usado na Internet
		 * 
		 * Em vez de utilizar A.length() poderia ter sido utilizada a forma literal do seguinte modo:
		 * 		tamanho = "Aprendendo Java".length() 
		 * O RESULTADO seria o mesmo.
		 * 
		 * OBS: Cabe mencionar que na realidade A não é uma variavel e sim um Objeto, pois Uma variavel 
		 * não pode conter métodos atrelados a ela; Somente os objetos que possuem métodos para manipulação de suas
		 * informações.
		 * */
		
		//Declaração do Objeto A
		String A = "Aprendendo Java";
		//Utilização do length()
		int tamanho = A.length();//Retorna o numero de caracteres armazenado em A "15"
		
		System.out.println("String: "+ A);
		System.out.println("O tamanho da String e: "+ tamanho);

	}

}
