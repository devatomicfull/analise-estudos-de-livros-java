package Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle;

public class Exemplo03_04_Utilizando_Throw {

	public static void main(String[] args) {
		/*
		 * Mostrando como é possivel utilizar a instrução throw para gerar uma exceção
		 * 	O programa segue sua execução normal até encontrar (throw new Exception("MinhaExcecao");) em que a 
		 * exceção é forçada, na qual está definida por meio do throw new Exception("nome da exceção").
		 * 		DESVIO PARA O CATCH 
		 * No (catch(Exception MinhaExcecao) {}) --> a exceção é tratada.
		 * EVIDENTEMENTE, este exemplo esta simples demais e bem longe de uma aplicação real; logo serve apenas
		 * para demonstrar a geração de uma exceção!
		 * 
		 * */ 
		try {
			System.out.print("Como aprender ");
			throw new Exception("MinhaExcecao");
		}catch(Exception MinhaExcecao) {
			System.out.println("a linguagem Java? ");
		}

	}

}
