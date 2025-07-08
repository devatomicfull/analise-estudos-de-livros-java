package Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle;

public class Exercio5_ContagemInicialFinal {

	public static void main(String[] args) {
		//
		if(args.length==2) {
			try {
				for(int i = Integer.parseInt(args[0]); i<Integer.parseInt(args[1]);i++  ) {
					System.out.println(i);
				}System.out.println(args[1]);
			}catch(NumberFormatException e) {
				System.out.println("Numero de argumentos invalido! ");
			}
		}
		
	}

}
