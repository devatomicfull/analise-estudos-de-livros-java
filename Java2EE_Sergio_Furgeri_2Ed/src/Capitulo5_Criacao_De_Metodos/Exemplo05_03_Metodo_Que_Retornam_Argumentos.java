package Capitulo5_Criacao_De_Metodos;

public class Exemplo05_03_Metodo_Que_Retornam_Argumentos {

	public static void main(String[] args) {
		/* A sintaxe para a declaração de metodos que retornam valores é a mesma apresentada anteriormente:
		 * 	
		 * 	public static int soma(int x, int y)
		 * 
		 * Este metodo acima recebera 2 argumentos inteiros(x,Y) e retornara um numero do tipo inteiro (int)
		 * OBSERVACAO: TODO METODO QUE RETORNA ALGUM VALOR, NECESSITA, OBRIGATORIAMENTE, UTILIZAR O 
		 * METODO RETURN() PARA RETORNAR UM VALOR, O VALOR RETORNADO DEVE SER SEMPRE DO MESMO TIPO DECLARADO
		 * PELO METODO.*/
		
		if(args.length==2) {
			//invocando o metodo soma() e apresentando na tela 
			System.out.println("Resultado = "+soma(args[0],args[1]));
		}else {
			System.out.println("Entre com dois valores inteiros!");
		}
	}
	public static int soma(String num1, String num2) {
		int x=0, y=0;
		try {
			x = Integer.parseInt(num1);
			y = Integer.parseInt(num2);
		}catch(NumberFormatException e) {
			System.out.println("Digite  apenas caracteres numericos!");
			System.exit(0); // caso houve erro encerra o programa
		}
		return(x+y);//retorna a soma dos argumentos passados
	}

}
