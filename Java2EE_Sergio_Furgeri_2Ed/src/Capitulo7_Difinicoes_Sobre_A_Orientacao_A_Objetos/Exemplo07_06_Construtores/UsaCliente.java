package Exemplo07_06_Construtores;

public class UsaCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Izabela");//envia o nome do cliente
		Cliente c2 = new Cliente("Tatiana");//envia o nome do cliente
		
		System.out.println(c1.nome);
		System.out.println(c2.nome);
	}
}
