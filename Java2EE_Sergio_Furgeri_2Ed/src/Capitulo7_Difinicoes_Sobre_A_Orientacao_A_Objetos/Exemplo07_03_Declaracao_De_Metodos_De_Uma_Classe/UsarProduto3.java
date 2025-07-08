package Exemplo07_03_Declaracao_De_Metodos_De_Uma_Classe;



public class UsarProduto3 {

	public static void main(String[] args) {
		Produto A,B,C;
		A = new Produto();
		B = new Produto();
		
		A.codigo = 10;
		A.nome = "sabonete";
		A.quantidade = 5;
		A.preco = 0.54;
		System.out.print(A.codigo+" "+A.nome+" ");
		System.out.println(A.quantidade+" "+A.preco+" ");
		A.mostraPreco();
		A.atualizaPreco(12);
		A.mostraPreco();
		
		B.preco = 5.45;
		B.mostraPreco();
		B.atualizaPreco(25);
		B.mostraPreco();
	}

}
