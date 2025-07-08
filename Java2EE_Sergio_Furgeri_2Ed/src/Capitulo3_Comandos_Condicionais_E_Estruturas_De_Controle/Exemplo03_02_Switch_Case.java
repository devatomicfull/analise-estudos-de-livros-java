package Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle;

public class Exemplo03_02_Switch_Case{
	public static void main(String[] args) {
		/*java Exemplo03_02_Switch_Case 3
		 * 
		 *  if(args.length == 1 ) { --> verifica-se se o usuario entrou com um argumento no momento da execução
		 *  do programa
		 *  
		 *  switch(x) { --> significa: Procure nas instruções case envolvidas pelas chaves se existe a ocorrência
		 *  do conteudo armazenado na variavel x.
		 *  
		 *  OBS: que toda linha do case necessita da instrução break em seu final. Só será executada a linha do case
		 *  que satisfazer a condição estabelecida pelo SWITCH.
		 *  
		 *  Caso nenhuma condição satisfeita, isto é, se o usuario entrou com um numero diferente de 0 a 9, então a
		 *  instrução default sera executada.
		 *  
		 *  
		 *  
		 * */
      if(args.length == 1 ) {
			int x;
			x = Integer.parseInt(args[0]);
			switch(x) {
			case 0: System.out.println(" Zero"); break;
			case 1: System.out.println(" um"); break;
			case 2: System.out.println(" dois"); break;
			case 3: System.out.println(" tres"); break;
			case 4: System.out.println(" quatro"); break;
			case 5: System.out.println(" cinco"); break;
			case 6: System.out.println(" seis"); break;
			case 7: System.out.println(" sete"); break;
			case 8: System.out.println(" oito"); break;
			case 9: System.out.println(" nove"); break;
			default: System.out.println(" Numero Desconhecido");
			}
		}else {
			System.out.println("Numeros de argumentos invalidos");
		}
	}
}
