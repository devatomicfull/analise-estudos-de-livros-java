package Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle;

public class Exercicio3_Somatorio1A100 {

	public static void main(String[] args) {
		/* Programa que apresente o total da soma dos cem primeiros numeros inteiros
		 * (1+2+3+4+5+6+.....99+100 = 5050
		 * */
		int soma = 0;
		for(int i=1;i<101;i++) {
			soma += i;
		}
		System.out.println("A somatoria e: "+ soma);

	}

}
