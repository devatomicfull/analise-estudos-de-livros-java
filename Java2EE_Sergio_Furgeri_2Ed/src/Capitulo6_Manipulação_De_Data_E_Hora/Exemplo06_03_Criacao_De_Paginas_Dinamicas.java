package Capitulo6_Manipulação_De_Data_E_Hora;

import java.util.Date;

public class Exemplo06_03_Criacao_De_Paginas_Dinamicas {

	public static void main(String[] args) {
		/* Variavel hora, usada para controlar a hora que o usuario esta acessando o aplicativo. Dependendo do horario de acesso, verificando com a estrutura
		 * if, é mostrada a mensagem na tela.*/
		Date data = new Date();
		int hora=0,min=0,sec=0;
		hora = data.getHours();
		min = data.getHours();
		sec = data.getSeconds();
		System.out.println("Agora sao "+ hora+ "h:"+min+"m:"+sec+"s");
		if((hora>=0)&&(hora<6)) {
			System.out.println("Boa madrugada");
		}else if((hora>=6)&&(hora<12)) {
			System.out.println("Bom dia!");
		}else if((hora>=12)&&(hora<18)) {
			System.out.println("Boa tarde");
		}else if(hora>=18) {
			System.out.println("boa noite");
		}
	}

}
