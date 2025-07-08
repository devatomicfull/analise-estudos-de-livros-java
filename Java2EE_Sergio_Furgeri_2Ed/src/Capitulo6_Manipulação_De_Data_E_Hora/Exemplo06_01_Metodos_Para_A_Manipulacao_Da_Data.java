package Capitulo6_Manipulação_De_Data_E_Hora;

import java.util.Date;

public class Exemplo06_01_Metodos_Para_A_Manipulacao_Da_Data {

	public static void main(String[] args) {
		/* Classe System, String, Float, são internas do java,logo nao necessitam ser importadas
		 * portanto para usar uma classe externa necessita da diretiva do import,isto é, quando o compilador for executado, a classe Date  sera compilada
		 * juntamente com a classe que a importou, caso essa diretiva nao seja inserida, o compilador nao encontrara a Classe Date, gerando erro de compilação!
		 * 
		 * Date data = new Date() -> data é um objeto da classe Date, inicializando com a data e hora atual do sistema.
		 * Inicializando com dados diferentes: Date data = new Date("12/09/2001")
		 * 
		 * Varios metodos: como ler(retornar) o conteudo dos dados armazenados no objeto
		 * 				   como gravar(armazenar) dados no objeto*/

		
		Date data = new Date();//Declara "cria", e inicializa o objeto data 
		System.out.println(data);//Todas as informações da data - 
		System.out.println("Mes: "+data.getMonth());//monstra o mes
		System.out.println("Dia da semana: "+data.getDay());//mostra dia da semana
		System.out.println("Dia: "+data.getDate());//mostra o dia do mes
		System.out.println("Ano: "+data.getYear());//mostra o ano
		
		data.setDate(15);//define o dia
		data.setMonth(11);//define o mes
		data.setYear(2000);//define o ano
		
		// Mostrando data modificada
		System.out.println(data+" ");
		System.out.println("Data como GMT: "+data.toGMTString());
	}
}


