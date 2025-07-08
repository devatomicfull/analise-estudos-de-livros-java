package Capitulo8_Utilizacao_De_Arrays;

public class Array_Unidimensional {

	public static void main(String[] args) {
		/* Demonstra a utilização de um array para armazenar um conjunto de argumentos do tipo inteiro, passado
		 * pelo usuario na linha de execução
		 * */
		int i, total=0;
		//declara um array N de 10 elementos do tipo int
		int N[] = new int[10];
		
		if(args.length>0) {
			try {
				for(i=0; i<args.length; i++) {//armazena cada um dos argumentos no array
					N[i] = Integer.parseInt(args[i]);
					total += N[i];//acumula o somatorio dos elementos
				}
				System.out.println("Os numeros digitados na ordem inversa foram:");
				for(i=args.length-1; i>=0; i--) {
					System.out.print(N[i]+ " ");
					System.out.println("| "+i+" -> Indice responsavel que armazena o dado anterior");
				}
				
				System.out.println();
				System.out.println("O somatorio dos numeros, "+ total);
				System.out.println("A media entre eles , "+(total/args.length));
			}catch(NumberFormatException e) {
				System.out.println("Os argumentos devem ser numeros do tipo inteiro! ");
			}
		}else {
			System.out.println("Digite pelo menos um numero! ");
		}
	}
}
