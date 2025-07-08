package Exemplo07_03_Declaracao_De_Metodos_De_Uma_Classe;

public class Produto {
	int codigo;
	String nome;
	int quantidade;
	double preco;
	
	public void mostraPreco() {
		System.out.println(preco);
	}
	
	public void atualizaPreco(double porc) {
		preco = preco + preco * porc / 100;
	}
}
