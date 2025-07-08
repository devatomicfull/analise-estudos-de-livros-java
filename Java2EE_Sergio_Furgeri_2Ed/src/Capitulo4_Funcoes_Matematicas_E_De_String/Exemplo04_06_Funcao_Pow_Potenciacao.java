package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_06_Funcao_Pow_Potenciacao {

	public static void main(String[] args) {
		/* Assim como é possivel extrai a raiz quadrada de um numero usando o metodo sqrt(), tambem é possivel
		 * fazer a operacao inversa, ou seja, elevar um determinado numero ao quadrado ou qualquer outro valor
		 * de potencia.
		 * A potenciação de um numero pode ser calculada pela funcao pow().
		 * SINTAXE:
		 * 			Math.pow(<valor da base>,<valor da potencia>)
		 * 
		 * Resultado correto do exemplo, abaixo:
		 * 
		 * 5.5 elevado a 2 e: 30.25
		 * 25 elevado a 0.5 e: 5.0
		 * 5678 elevado a 0 e: 1.0
		 * 
		 * */
		
		double base = 5.5, potencia = 2;
		
		System.out.println("5.5 elevado a 2 e: "+ Math.pow(base, potencia));
		System.out.println("25 elevado a 0.5 e: "+ Math.pow(25, 0.5));
		System.out.println("5678 elevado a 0 e: "+ Math.pow(5678, 0));
	}

}
