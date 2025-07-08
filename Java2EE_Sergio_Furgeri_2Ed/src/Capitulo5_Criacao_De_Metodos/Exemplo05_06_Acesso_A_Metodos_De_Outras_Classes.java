package Capitulo5_Criacao_De_Metodos;

import Capitulo5_Criacao_De_Metodos.Exemplo05_06_Classe_Externa_Auxiliar.LimpaTela;
import Capitulo5_Criacao_De_Metodos.Exemplo05_06_Classe_Externa_Auxiliar.Tempo;

public class Exemplo05_06_Acesso_A_Metodos_De_Outras_Classes {

	public static void main(String[] args) {
		/* Em exemplos anteriores  foi demonstrado o acesso a metodos da propria classe, com execeção dos metodos
		 * internos da propria linguagem java.
		 * 
		 * OBS: O mais comum é que um metodo seja acessado externamente, isto é, o metodo é declarado em uma classe
		 * externa e sua funcionalidade é reaproveitada por qualquer outra classe.
		 * 
		 * Qualquer metodo criado em uma classe pode ser utilizado em outra classes pelo formato: 
		 * 		<nome da classe>.<nome do metodo>. Com isso, um metodo necessita ser criado apenas uma vez em uma 
		 * 		unica classe, IMAGINE SE CADA CLASSE, em que é necessaria a entrada de dados via teclado, fosse 
		 * 		necessario declarar um metodo para a leitura  de um numero. 
		 * 	Esse recurso é muito importante, pois uma vez que o metodo foi criado, ele pode ser reutilizado em outra
		 *  aplicação; basta chamar a classe em que ele se encontra.
		 *  
		 * NOTE: tempo(),limpaTela(): Cada metodo e chamado propriamente pelo nome da classe em que situam e em 
		 * seguida pelo nome do metodo.
		 * 
		 * A cada segundo, a tela é limpa e o novo horario aparece.
		 * 
		 * Mostrando o uso de metodos de outras classes:
		 * */
		
		int H,M,S;
		
		LimpaTela.limpaTela();//Chamando metodo de uma classe externa
		for(H=0;H<24;H++) { //CONTROLA HORAS
			for(M=0;M<60;M++) { //CONTROLA MINUTOS
				for(S=0;S<60;S++){ //CONTROLA SEGUNDOS
				System.out.println("CTRL+C - ENCERRAR "+H+"H:"+M+"m:"+S+"s");
				Tempo.tempo(1);//Chamando metodo de uma classe externa
				LimpaTela.limpaTela();
				}
			}
		}
	}

}
