package Exemplo07_08_Polimorfismo;

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

}
