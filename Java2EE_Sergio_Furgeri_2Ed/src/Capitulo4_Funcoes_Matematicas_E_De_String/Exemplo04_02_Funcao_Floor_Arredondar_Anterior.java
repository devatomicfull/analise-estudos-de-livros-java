package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_02_Funcao_Floor_Arredondar_Anterior {

	public static void main(String[] args) {
		/*
		 * A funcao floor( ), e tambem utilizada para arredondar um determinado numero, porém esse numero é arredondado
		 * para o seu inteiro anterior.
		 * SINTAXE:
		 * 			Math.floor(<valor do tipo double>).
		 * 
		 * Resultado correto do exemplo abaixo
		 * 
		 * Arredondando 5.2 = 5.0
		 * Arredondando 5.6 = 5.0
		 * Arredondando -5.8 = -6.0*/
		
		double A=5.2, B=5.6, C=-5.8;
		System.out.println("Arredondando 5.2 = "+ Math.floor(A));
		System.out.println("Arredondando 5.6 = "+ Math.floor(B));
		System.out.println("Arredondando -5.8 = "+ Math.floor(C));

	}

}
