package Exemplo07_01_partes_que_compoem_uma_classe__Instanciacao_de_uma_classe;

public class UsarProduto {

	public static void main(String[] args) {
		//
		Produto A,B,C;
		A = new Produto();
		B = new Produto();
		C = new Produto();
		
		System.out.println(A.codigo+" "+A.nome+" ");
		System.out.println(A.quantidade+" "+A.preco);
		A.codigo = 10;
		A.nome = "Sabonete";
		A.quantidade = 5;
		A.preco = 0.54;
		System.out.println(A.codigo+" "+A.nome+" ");
		System.out.println(A.quantidade+" "+A.preco);
		
		System.out.println(B.codigo+" "+B.nome+" ");
		System.out.println(B.quantidade+" "+B.preco);
		B.codigo = 11;
		B.nome = "Detergente";
		B.quantidade = 35;
		B.preco = 1.25;
		System.out.println(B.codigo+" "+B.nome+" ");
		System.out.println(B.quantidade+" "+B.preco);
		
		System.out.println(C.codigo+" "+C.nome+" ");
		System.out.println(C.quantidade+" "+C.preco);
		C.codigo = 11;
		C.nome = "Detergente";
		C.quantidade = 35;
		C.preco = 1.25;
		System.out.println(C.codigo+" "+C.nome+" ");
		System.out.println(C.quantidade+" "+C.preco);
	}

}
