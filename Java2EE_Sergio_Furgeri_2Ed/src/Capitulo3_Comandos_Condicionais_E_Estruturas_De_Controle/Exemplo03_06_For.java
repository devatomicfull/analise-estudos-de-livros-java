package Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle;

public class Exemplo03_06_For {

	public static void main(String[] args) {
		//EXEMPLO BASICO DE DEMONSTRAÇÃO
		for(int i=10; i>0; i--) {
			System.out.print(i + " ");
		}
		System.out.println("Acabou! \n");
		
		//OUTRO EXEMPLO
	    /* Thread t;
		 * t = new Thread();
		 * t.start();
		 * declaram e inicializam um objeto(t) para controle de temporização por meio da Classe Thread. 
		 * A temporização possui um ligação direta com o laço for, uma vez que sua ação em conjunto pode ser usada
		 * para a criação de programas de contagem de tempo.
		 * (Neste exemplo, a classe Thread é usada para criar um objeto que realizara uma temporização segundo a segundo.)
		 */
		Thread t; //cria um objeto (t) para controle do tempo
		t = new Thread();
		t.start();
		int A,B;
		
		//for(A=0; A<=10; A++){ }--> Realiza a contagem de 0 ate 10 com passo 1
		for(A=0; A<=10; A++){
			System.out.print(A + " ");
		}
		System.out.println();
		
		//for(A=50;A>=0; A=A-5) { } --> Realiza a contagem de 50 ate 0 com passo -5
		for(A=50;A>=0; A=A-5) {
			System.out.print(A +  " ");
		}
		System.out.println();
		
		//for(A=10;A>=-10;A=A-2) { } --> Realiza a contagem de 10 ate -10 com passo -2
		for(A=10;A>=-10;A=A-2) {
			System.out.print(A + " ");
			/*Contem um laço que aparentemente não realiza nada.
			 * OBS: O ponto-e-virgula no FINAL da LINHA. Isso quer dizer que o laço não executará nenhuma instrução,
			 * isto é, ele realizará a contagem conforme definido pela variavel b (de 0 a 50000000), entretanto nenhuma
			 * instrução sera executada. O motivo para sua utilização "dar um tempo" até a execução da proxima linha do programa.
			 * Ele FUNCIONA COMO UM TEMPORIZADOR CASEIRO.*/
			for(B=0; B<50000000;B++);
		}
		System.out.println();
		
		int H,M,S;//SIMULA UM RELOGIO DIGITAL
		System.out.println("Para encerrar pressione CTRL+C");
		
		/* Um ponto a ser observado é a possibilidade de criação de um laço de repetição dentro de outro. 
		 * Quando isso ocorre, o laço interno é realizado n vezes, de acordo com o número de vezes definido pelo
		 * laço de nível superior.
		 * Como exemplo, o laço mais interno(S) controla os segundos e será executado 60 vezes a cada minuto
		 * (o laço superior). Da mesma forma, o laço dos minutos (M) será executado 60 vezes a cada hora(o laço superior).
		 * */
		
		for(H=0;H<24;H++) { //CONTROLA HORAS
			for(M=0;M<60;M++) { //CONTROLA MINUTOS
				for(S=0;S<60;S++){ //CONTROLA SEGUNDOS
					System.out.println(H+"h:"+M+"m:"+S+"s:");//EXIBE AS HORAS NA TELA
					try {
						/* Invoca o temporizador que espera 1000 milisegundos(1 Segundo) ate a execução da proxima
						 * instrução.
						 * Esse procedimento pode gerar uma exceção e por isso deve ser usado dentro de um bloco try
						 * */
						t.sleep(1000);
						/*Controla a linha final da execução do relógio.  Quando o relógio contar 5 segundos, o programa será 
						 * encerrado por meio de System.exit(0).
						 * Sempre que for necessario forçar o encerramento de um programa, o método exit pode ser usado. Uma outra
						 * forma de encerrar uma aplicação em java é pressionado CTRL+C no prompt do DOS*/
						if(S==5) System.exit(0);
					}catch(InterruptedException e) {}
				}
			}
		}
	}

}
