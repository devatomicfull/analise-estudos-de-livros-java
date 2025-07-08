package Capitulo5_Criacao_De_Metodos.Exemplo05_06_Classe_Externa_Auxiliar;

public class Tempo {
	public static void tempo(int S) {
		try {
			Thread t;
			t = new Thread();
			t.start();
			t.sleep(S*1000);
		}catch(InterruptedException e) {
			
		}
	}
}
