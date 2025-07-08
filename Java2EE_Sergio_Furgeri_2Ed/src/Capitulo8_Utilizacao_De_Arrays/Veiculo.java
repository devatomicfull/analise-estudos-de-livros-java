package Capitulo8_Utilizacao_De_Arrays;

public class Veiculo {
		String nome;
		float velocidade;
		
		public void acelera() {
			if(velocidade<=10) {
				velocidade++;
			}
		}
		
		public void frea() {
			if(velocidade>0)
				velocidade--;
		}
		
		void mostraVelocidade() {
			System.out.println(velocidade);
		}
}
