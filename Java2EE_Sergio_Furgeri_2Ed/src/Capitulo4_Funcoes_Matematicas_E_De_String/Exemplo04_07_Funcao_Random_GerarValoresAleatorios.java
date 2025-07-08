package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_07_Funcao_Random_GerarValoresAleatorios {

	public static void main(String[] args) {
		/* A Funcao random() é utilizada para gerar valores de forma aleatoria. Toda vez que a funcao random() é
		 * chamada, sera sorteado um valor do tipo double entre 0.0 e 1.0( o valor 1 nunca é sorteado).
		 * 	
		 * Nem sempre esta faixa de valores é suficiente numa aplicação real. Por exemplo, para simular o sorteio
		 * de numeros entre 0 e 99 para um jogo de loteria qualquer, torna - se necessario o sorteio de numeros
		 * inteiros aleatorios no intervalo de 0 a 99.
		 * Para que esses numeros possam ser sorteados, é necessaria a utilização do operador de multiplicação (*)
		 * em conjunto com a funcao random().
		 * Com isso torna-se possivel definir o intervalo em que o numero sera sorteado.
		 * O conversor int tambem pode ser usado para truncar a parte do ponto flutuante (a parte depois do ponto 
		 * decimal) para um numero inteiro seja gerado, da seguinte forma:
		 * 
		 * 	casting
		 * 	(int)	(Math.random() * 100)
		 * 
		 * Com isso seriam gerados numeros inteiros entre 0 e 99, atendendo plenamente a necessidade exposta.
		 * 
		 * O Exemplo abaixo, demonstra o uso da funcao random() para simular a geracao de cinco cartões de loteria
		 * contendo seis numeros cada.
		 * */
		
		//Os numeros sao mostrados um ao lado do outro e a cada cartao e pulada uma linha em branco.
		
		/* É o responsavel pela contagem de um a cinco (OS CINCO CARTÕES).*/
		for(int quantidade=1; quantidade<=5; quantidade++) {
			/* É responsavel  pela contagem de um seis (OS SEIS NUMEROS DE CADA CARTAO.)*/
			for(int x=1; x<=6; x++) {
				int num = (int) (Math.random()*99);
				System.out.print(num+" ");
			}
			System.out.println(" ");
		}

	}

}
