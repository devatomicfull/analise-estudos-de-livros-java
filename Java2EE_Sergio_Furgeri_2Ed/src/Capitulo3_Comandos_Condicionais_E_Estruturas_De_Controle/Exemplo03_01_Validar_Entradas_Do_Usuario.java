package Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle;

public class Exemplo03_01_Validar_Entradas_Do_Usuario {

	public static void main(String[] args) {
		/*
		 * Verifica se o usuario realmente entrou com um argumento na linha de comando,
		 * depois verifica se o argumento digitado e um valor numerico, logo a seguir
		 * verifica se esse valor está compreendido entre 0 e 10(a faixa de valores
		 * possíveis, uma vez que uma nota deve assumir apenas valores entre 0 e 10)
		 * 
		 * Para execucao deste programa Digite no terminal: 
		 * java Exemplo03_01_ValidarEntradasDoUsuario 5
		 * 
		 * Ao executar o programa, o vetor args recebera um elemento(args[0]="5")
		 * 
		 * if(args.length==1) --> verifica se o numero de argumentos digitados é igual a
		 * 1, isto é, verifica se o usuario entrou com um, e apenas um, argumento na
		 * linha de comando. Isto é verificado com o uso do length, ou seja, ele retorna
		 * a quantidade de elementos que args contém. Se o numero de argumentos passados
		 * for igual a 1, executao o trecho entre chaves.
		 * 
		 * else do final sera executado caso o usuario entre com o numero de argumentos deferente de um.
		 * 
		 * O bloco try catch é o responsavel por verificar se o usuario digitou o valor numerico como argumento,
		 * uma vez que valores indevidos provocarão erros de conversao.
		 * 
		 * if (x <= 10 && x > 0) --> Contém a instrução if responsavel por verificar se o valor da nota, digitado
		 * pelo usuario, esta compreendido entre os valores 0 e 10.
		 *  
		 */

		if (args.length == 1) {
			try {
				float x = Float.parseFloat(args[0]);
				if (x <= 10 && x > 0)
					System.out.println("Nota = " + x + " - valor valido");
				else
					System.out.println("Nota = " + x + " - valor invalido");
			} catch (NumberFormatException e) {
				System.out.println("Digite apenas valores numericos");
			}
		} else {
			System.out.println("Numero de argumentos invalidos");
		}
	}

}
