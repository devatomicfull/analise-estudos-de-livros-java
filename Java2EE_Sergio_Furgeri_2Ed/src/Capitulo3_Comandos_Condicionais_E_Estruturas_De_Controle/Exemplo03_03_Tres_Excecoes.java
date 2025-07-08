package Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle;

public class Exemplo03_03_Tres_Excecoes {

	public static void main(String[] args) {
		/* Demonstra a utilização de tres exceções em java.
		 * Ele recebe dois numeros inteiros na linha de comando e realiza as quatro operações basicas.
		 * 
		 * ArithmeticException (Que ocorre quando um erro matematico (aritmetico) acontece, Neste exemplo o erro
		 * matematico pode ocorrer na divisão de um numero por zero.
		 * 
		 * Caso o usuario não forneca pelo menos dois argumentos na linha de comando, ocorre o erro 
		 * ArrayIndexOutOfBoundsException considere que aqui (int num2 = Integer.parseInt(args[1]);) na qual o java
		 * tenta atribuir o valor args[1] à variavel num2, entretanto pode ocorrer de o argumento args[1] estar nulo,
		 * caso o usuario não forneça o segundo numero na linha de comando. Quando o indice não possuir um valor, a linguagem
		 * java considera que ele não existe e, portanto, não pode ser usado, gerando um erro.
		 * 
		 * RESUMO: esse erro ocorre sempre que um indice inexistente for utilizado no programa. Esse erro pode ser 
		 * evitado tambem de outra forma, como já é de conhecimento do leito, verificando a quantidade de argumentos
		 * fornecidas pelo usuario if(args.length==2).
		 * 
		 * NumberFormatException ocorre na conversão de formatos numéricos, erro já conhecido pelo leitor. nesse
		 * caso o erro ocorrera caso o usuario nao forneca um numero inteiro valido.
		 * 
		 * OBSERVAÇÃO: Se houver um dos 3 erros apontados durante o processamento das instruções presentes no try,
		 * automaticamente a execução do programa sera direcionada para o catch com o tratamento da devida exceção.
		 *  
		 * java Exemplo03_03_Tres_Excecoes 10
		 * 
		 * 		Numero de argumentos invalidos!
		 *
		 * java Exemplo03_03_Tres_Excecoes 10 2
		 * 
		 * 		Soma = 12
		 *	    Subtracao = 8
		 *		Multiplicacao = 20
		 *		Divisao = 5
		 *
		 * java Exemplo03_03_Tres_Excecoes 10 0 
		 * 		
		 * 		Soma = 10
		 * 		Subtracao = 10
		 * 		Multiplicacao = 0
		 * 		Erro de divisao por zero! 
		 * */
		
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println("Soma = "+ (num1+num2) );
			System.out.println("Subtracao = "+ (num1-num2) );
			System.out.println("Multiplicacao = "+ (num1*num2) );
			System.out.println("Divisao = "+ (num1/num2) );
			}catch(ArithmeticException e){
				System.out.println("Erro de divisão por zero! ");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Numero de argumentos invalidos!");
			}catch(NumberFormatException e) {
				System.out.println("Digite apenas numeros inteiros");
			}
	}
}
