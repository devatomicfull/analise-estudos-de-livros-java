package Capitulo7_Difinicoes_Sobre_A_Orientacao_A_Objetos;

public class Exemplo07_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo v1;
		v1 = new Veiculo();
		v1.nome = "Gol";
		System.out.println(v1.nome);
		v1.mostraVelocidade();
		for(int i=1; i<=5;i++)
			v1.acelera();
			v1.mostraVelocidade();
		//System.out.println(v1.valocidade);
	}
}

class Veiculo{
	String nome;
	private float velocidade;
	
	public void acelera() {
		if(velocidade<=10)
			velocidade++;
	}
	
	void frea() {
		if(velocidade>0) {
			velocidade--;
		}
	}
	
	void mostraVelocidade(){
		System.out.println(velocidade);
	}
}
