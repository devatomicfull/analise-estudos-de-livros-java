package Exemplo07_08_Polimorfismo;

public class Generica {

	public static void main(String[] args) {
		//
		Veiculo2 a = new Veiculo2();//cria um objeto da classe Veiculo2		
		Veiculo3 b = new Veiculo3();//cria um objeto da classe Veiculo3
		
		a.velocidade = 10;
		b.velocidade = 20;
		
		mostraVelocidade(a);
		mostraVelocidade(b);
	}
	
	
	public static void mostraVelocidade(Veiculo veic) {
		System.out.println(veic.velocidade);
	}
}
