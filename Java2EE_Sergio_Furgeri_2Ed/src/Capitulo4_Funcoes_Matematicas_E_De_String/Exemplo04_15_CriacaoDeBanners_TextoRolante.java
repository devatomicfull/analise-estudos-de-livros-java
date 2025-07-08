package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_15_CriacaoDeBanners_TextoRolante {

	public static void main(String[] args) {
		/* Criacao De Banners (TextoRolante) constituem-se um dos aspectos mais importantes para compor uma pagina
		 * da internet. Este item apresenta uma ilustracao de como construir um banner com a manipulacao de STRINGS.
		 * 
		 * Mostra uma palavra qualquer, digitada pelo usuario, sendo formatada letra a letra  na tela de modo
		 * temporizado.
		 * EVIDENTEMENTE, o exemplo é simples, servindo apenas de forma ilustrativa;
		 * */
		String palavra=""; // a variavel palavra sera usada no banner
		if(args.length==1) {// se o usuario digitou uma palavra
			System.out.println("Mostra a palavra letra  a letra");
			System.out.println("Para encerrar pressione CTRL+C");
			palavra = args[0]; // a variavel palavra recebe a palavra digitada
			while(true){//looping infinito
				for(int i=0; i<palavra.length(); i++) {//varre os caracteres da palavra
					System.out.print(palavra.charAt(i));
					for(int x=0; x<50000000; x++);//TEMPORIZADOR 1
				}
				System.out.println();
				for(int y =0; y<100000000; y++);//TEMPORIZADOR 2
			}
		}else {
			System.out.println("Entre com uma palavra qualquer. ");
		}

	}

}
