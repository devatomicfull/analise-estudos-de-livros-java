package Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle;

public class Exemplo03_05_ReconhecerErros_Com_DoisMetodos {

	public static void main(String[] args) {
		/*Demonstração, com fins didaticos, para que o leitor compreenda mais claramente a utilização dos métodos
		 * getMessage()
		 * printStackTrace()
		 * 
		 * z = x / y; //gera uma exceção aritmetica de divisão por zero --> PRODUZIRA uma exceção de divisão por
		 * 				zero, uma vez que a variavel y possui conteúdo zero.
		 * Esssa exceção sera tratada na linha catch(Exception e) {} -->.Note que não foi definida a execção 
		 * aritmetica (ArithmeticException) como em exemplos anteriores. Quando usado (Exception) em um bloco catch,
		 * ,qualquer exceção gerada, isto é, qualquer tipo de exceção sera tratado nesse bloco.
		 * 		ISSO EQUIVALE a dizer que Exception pode ser considerado uma exceção DEFAULT, caso o desenvolvedor
		 * 		não saiba quais os tipos de erro que poderão ser gerados durante a execução de um programa.
		 * O método getMessage se encarrega de retornar o erro ocorrido(no caso:/by zero - divisao por zero).
		 * O método printStackTrace retorna diversas informações: O tipo de exceção, a mensagem de erro, o nome da classe
		 * que gerou o erro, o nome do método em que o erro ocorreu e o numero da linha do programa.
		 * 
		 * java.lang.ArithmeticException(TIPO DA EXCEÇÃO),/ by zero (MENSAGEM DE ERRO),
	     * at Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle(NOME DO PACOTE)
	     * .Exemplo03_05_ReconhecerErros_Com_DoisMetodos(NOME DA CLASSE)
	     * .main(O NOME DO METODO)(Exemplo03_05_ReconhecerErros_Com_DoisMetodos.java:22)(A LINHA EM QUE OCORREU O ERRO).
*/
		int x=10, y=0,z=0;
		try { 
			z = x / y; //gera uma exceção aritmetica de divisão por zero
		}catch(Exception e) {
			System.out.println(e.getMessage());// Mostra a mensagem de erro
			e.printStackTrace(); //Mostra a exceção e a linha onde ocorreu o erro
		}

	}

}
