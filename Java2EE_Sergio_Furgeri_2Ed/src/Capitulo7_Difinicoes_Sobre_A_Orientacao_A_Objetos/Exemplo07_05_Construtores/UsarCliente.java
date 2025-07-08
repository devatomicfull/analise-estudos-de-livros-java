package Exemplo07_05_Construtores;

public class UsarCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();//invoca o metodo construtor
		System.out.println(c1.codigo);
		System.out.println(c1.nome);
		System.out.println(c1.cidade);
	}
}
