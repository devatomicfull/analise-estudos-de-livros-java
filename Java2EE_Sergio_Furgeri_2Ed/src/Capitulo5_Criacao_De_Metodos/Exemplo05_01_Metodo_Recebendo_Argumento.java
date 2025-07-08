package Capitulo5_Criacao_De_Metodos;

public class Exemplo05_01_Metodo_Recebendo_Argumento {

	public static void main(String[] args) {
		/* Metodo com passagem de argumento. 
		 * Imprimi o conteudo de uma variavel qualquer, funcionando da mesma forma como System.out.println()
		 * 
		 * formato para invocar o metodo tela() que recebe um argumento é: tela(fraseN)
		 * tela-> metodo
		 * (fraseN)--> conteudo que sera enviado ao metodo, ou seja, o metodo é invocado e recebe uma variavel do tipo String
		 * e tambem pode receber uma cadeia de caracteres ou ate um espaco em branco
		 * */
		String frase1="Sou muito";
		String frase2="feliz por que sei";
		String frase3="que Deus me ama!";
		limpaTela();//invoca o metodo para limpar tela
		tela(frase1);//invoca o metodo para imprimir na tela
		tela(" ");
		tela(frase2);
		tela(" ");
		tela(frase3);
	}
	public static void tela(String s ) {//declaracao do metodo tela
		System.out.println(s);
	}
	public static void limpaTela(){//declaracao do metodo limpaTela
		for(int i=1;i<=25;i++)
			System.out.println();
	}

}
