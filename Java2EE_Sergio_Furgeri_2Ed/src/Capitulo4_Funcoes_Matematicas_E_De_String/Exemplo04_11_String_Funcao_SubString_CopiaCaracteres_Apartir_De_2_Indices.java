package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_11_String_Funcao_SubString_CopiaCaracteres_Apartir_De_2_Indices {

	public static void main(String[] args) {
		/* A Função substring() é utilizada para retornar uma copia de caracteres de uma String a partir de dois 
		 * indices inteiros especificos, funcioando basicamente da mesma forma que a  função charAt dentro de um
		 * looping
		 * 		SINTAXE:
		 * 				<string>.substring(<indice inicial>,[<indice final>])
		 * 
		 * <indice inicial> --> De onde inicia a copia
		 * [<indice final>] --> Onde termina a copia dos caracteres, (É OPCIONAL):  Entretanto o indice final deve
		 * especificar um indice alem do ultimo caractere "+1" pois o indice final sera subtraido por(-1) 
		 * veja no exemplo 1.0
		 * 
		 * [<indice final>] --> SE NÃO FOR INSERIDO SERA CONSIDERADO COMO O COMPRIMENTO MAXIMO DA STRING
		 * */
		
		//EXEMPLO 1.0
		//Quero copiar do 1 ao 6 -> "Lingua"
		String A = "Linguagem";
		/* 0 -> Primeiro caractere da String A
		 * 6 -> Um a mais do que se deseja copiar, uma vez que o caractere a possui o indice 5*/
		System.out.println("Indice 0 ao Indice 6: "+A.substring(0,6));// copiando 0 ao 5
		
		String B = "Aprendendo Java";
		System.out.println(B);
		System.out.println("do 3 caractere ate o fim: "+ B.substring(2));
		System.out.println("do 1 caractere ate o 10: "+ B.substring(0, 10));
		System.out.println("so 12 caractere ate o 15: "+ B.substring(11,15));
		
	}

}
