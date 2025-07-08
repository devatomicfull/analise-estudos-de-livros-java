package Exemplo07_06_Construtores;

public class Cliente {
	int codigo;
	String nome;
	String cidade;
	Cliente(String n){// o metodo construtor recebe o nome do cliente
		nome = n;
		cidade = "Indaiatuba";		
	}
}
