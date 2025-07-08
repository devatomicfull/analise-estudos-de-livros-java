package Capitulo6_Manipulação_De_Data_E_Hora;

import java.util.Date;

public class Exemplo06_02_Metodos_Para_A_Manipulacao_Da_Hora {

	public static void main(String[] args) {
		/* 
		 * apresenta o uso dos principais métodos relacionados à hora.*/ 
		
		Date data = new Date();//Cria e inicializa um objeto data
		System.out.println(data);//todas as informações da data e hora
		System.out.println("Horas: "+ data.getHours());//horas
		System.out.println("Minutos: "+ data.getMinutes());//minutos
		System.out.println("Segudos: "+ data.getSeconds() );//segundos
		System.out.println("Milisegundos desde 1970: "+ data.getTime());
		System.out.println("Diferenca de GMT: "+ data.getTimezoneOffset());//diferenca em minutos
		data.setHours(15);// altera as horas
		data.setMinutes(25);// altera os minutos
		data.setSeconds(12);// altera os segundos
		System.out.println(data); // mostrando a hora modificada
		System.out.println("Data e hora no fuso horario corrente: "+ data.toLocaleString());
	}

}
