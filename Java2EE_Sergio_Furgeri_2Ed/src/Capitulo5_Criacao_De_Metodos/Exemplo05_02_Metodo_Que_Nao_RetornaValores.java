package Capitulo5_Criacao_De_Metodos;

public class Exemplo05_02_Metodo_Que_Nao_RetornaValores {

	public static void main(String[] args) {
		/* Apresenta outra classe com dois metodos que não retornam valores(alem do main) em que os metodos 
		 * sao executados em cascata, uma vez que o metodo main chamara tela que, por sua vez, chamara tempo
		 * 
		 * tempo --> Funciona como temporizador durante a execução do programa -- mesma coisa que o delay de outras linguagens
		 * 
		 * Quanto maior o numero passado dentro dos parenteses (note que é um argumento inteiro) no momento de invocar
		 * esse metodo, maior sera a temporização controlada pela variavel Segundos*/
		
		String frase1="Sou muito";
		String frase2="feliz por que sei";
		String frase3="que Deus me ama!";
		tela(frase1);
		tela(frase2);
		tela(frase3);
	}
	public static void tela(String s ) {//declaracao do metodo tela
		System.out.println(s);
		tempo(1);
	}
	public static void tempo(int Segundos) {//segundos recebe 2
		try {
			Thread t;
			t = new Thread();
			t.sleep(Segundos*1000);
		}catch(InterruptedException e) {
			
		}
	}

}
