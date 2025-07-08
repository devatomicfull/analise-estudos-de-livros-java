package Exemplo07_02_Compartilhamento_De_Variaveis_Entre_Os_Objetos;

public class UsarProduto2 {

	public static void main(String[] args) {
		// 
		Produto A,B,C;
		A = new Produto();
		B = new Produto();
		C = new Produto();
		
		A.codigo = 1;
		System.out.println("Valor de codigo em A: "+A.codigo);
		System.out.println("Valor de codigo em B: "+B.codigo);
		B.codigo = 2;
		System.out.println("Valor de codigo em A: "+A.codigo);
		System.out.println("Valor de codigo em B: "+B.codigo);
		System.out.println("Valor de codigo em C: "+C.codigo);		

	}

}
