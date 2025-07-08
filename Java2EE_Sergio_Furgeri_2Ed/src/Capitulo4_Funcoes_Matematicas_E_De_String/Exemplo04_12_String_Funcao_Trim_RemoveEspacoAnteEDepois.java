package Capitulo4_Funcoes_Matematicas_E_De_String;

public class Exemplo04_12_String_Funcao_Trim_RemoveEspacoAnteEDepois {

	public static void main(String[] args) {
		/* A funcao trim() tem por objetivo remover todos os espacos em branco que apararecem no inicio e final de 
		 * uma determinada String.
		 * OBS: Não serao removidos os espacos entre as palavras.
		 * 		SINTAXE:
		 * 				<string>.trim()
		 * */
		
		String frase = "   Cristo: o rei dos reis   ";
		System.out.println("Com espacos: "+"*"+frase+"*");
		//caso queira de fato tira o espaco, tera que atribuir desta forma: frase = frase.trim(); --> mero exemplo
		System.out.println("Sem espacos: "+"*"+frase.trim()+"*");
	}

}
