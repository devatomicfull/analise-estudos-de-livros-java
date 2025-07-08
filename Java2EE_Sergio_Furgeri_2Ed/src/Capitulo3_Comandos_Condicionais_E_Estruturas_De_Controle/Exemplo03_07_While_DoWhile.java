package Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle;

public class Exemplo03_07_While_DoWhile {

	public static void main(String[] args) {
		/* Este exemplo recebe um numero na linha de comando e inicia sua contagem regressiva até zero, pausadamente,
		 * descrevendo de um em um.
		 * 
		 * java Exemplo03_07_While_DoWhile 5
		 * 
		 *  5
		 *  4
		 *  3
		 *  2
		 *  1
		 *  0
		 *  Fim da 1 Contagem
		 *  -1
		 *  Fim da 2 Contagem 
		 *  
		 *  Quando digita um argumento na linha de comando, ele é armazenado na variavel A.
		 *  Caso ocorra algum erro de conversão, o direcionamento do programa é alterado para NumberFormatException,
		 *  conforme ja abordamos anteriormente. Uma vez  que A recebe um numero inteiro, é realizada sua contagem 
		 *  descrente na tela por meio do while. Caso o usuario não forneça nenhum argumento na linha de comando, o
		 *  conteudo de args[0] sera nullo e quando utilizado no programa (linha- A = Integer.parseInt(args[0]);),
		 *  gera um erro de execução, apontando que o indice do vetor não existe, gerando a exceção (ArrayIndexOutOfBoundsException)
		 *  Esse erro poderia ser tratado de outra forma, como já descrito anteriomente, verificando no inicio
		 *  do programa se o usuario entrou com um argumento por meio de if(args.length==1).
		 *    
		 *  */
		Thread tempo; tempo = new Thread(); tempo.start();
		int A;
		try {
			A = Integer.parseInt(args[0]);
			//INICIO DA ESTRUTURA WHILE
			/* No ultimo ciclo da estrutura while, observe que é impresso na tela o valor 0(zero), sendo ultimo
			 * valor assumido pela variavel A de acordo com a condição da expressão. Depois disso a variavel A 
			 * passa ser igual a -1 e o laço termina, pois -1 não é maior ou igual a zero*/
			while(A>=0) {
				System.out.println(" "+A);
				tempo.sleep(1000);//pausa de 1 segundo
				A--;
			}//FIM DA ESTRUTURA WHILE
			
			System.out.println("Fim da 1 Contagem ");
			System.out.println(); //PULA LINHA
			
			tempo.sleep(1000);
			
			/* Observe que a variavel A não poderia ser mostrada, de acordo com a condição determinada na 
			 * (linha- while(A>0);), pois ela esta valendo -1. Entretanto, mesmo assim é mostrada na tela, pois
			 * como já dito, o do-while executa seus comandos pelo menos um vez e depois verifica a condição de 
			 * sua expressão.
			 * */
			do {//inicio da estrutura do-while
				System.out.println(" "+A);
				tempo.sleep(1000);
				A++;
			}while(A>0); // fim da estrutura do-while
			System.out.println("Fim da 2 Contagem ");
		}catch(ArrayIndexOutOfBoundsException E) {//nao foi digitado argumento
			System.out.println("Digite um argumento!");
			
		}catch(InterruptedException E) {//interrupção do timer
			System.out.println("Algo interrompeu a contagem");
			
		}catch(NumberFormatException E) {//se o argumento for invalido
			System.out.println("Não foi fornecido um numero inteiro valido! ");
		}
	}

}
