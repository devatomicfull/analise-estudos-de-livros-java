package Capitulo8_Utilizacao_De_Arrays;
public class Exemplo08_05_Arrays_De_Objetos {

	public static void main(String[] args) {
		Veiculo veic [] = new Veiculo[10];//cria um array com 100 objetos veiculos
		for(int i=0;i <10;i++) {
			veic[i] = new Veiculo();//inicializa todos os objetos
		}
		
		//Colocando 10 no atributo velocidade para todos
		for(int i=0;i <10;i++) {
			veic[i].velocidade = 10;
			System.out.println(veic[i].velocidade);
		} System.out.println();
		
		//Mudando os valores
		veic[1].velocidade = 80;
		veic[9].velocidade = 100;
		veic[0].velocidade = 22;
		
		//Exibindo as alterações
		for(int i=0;i <10;i++) {
			System.out.println(veic[i].velocidade);
		}System.out.println();
		
		//Zerando todos os objetos
		for(int i =0 ; i<10; i++) {//zera a velocidade de todos os objetos
			System.out.println(veic[i].velocidade=0);
		}
	}
}
