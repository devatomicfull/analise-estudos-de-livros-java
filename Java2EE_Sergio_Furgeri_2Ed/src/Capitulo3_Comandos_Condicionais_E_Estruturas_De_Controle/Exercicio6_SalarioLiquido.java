package Capitulo3_Comandos_Condicionais_E_Estruturas_De_Controle;

import java.util.Scanner;

public class Exercicio6_SalarioLiquido {

	public static void main(String[] args) {
		/*Programa para calculo do salario liquido em que 3 valores devem ser informados
		 * pelo usuario: Quantidade de horas trabalhadas, o salario hora e o numero de dependentes
		 * --------------------------------------------------------------------------
		 * Salario Bruto: Horas trabalhadas*Salario Hora+(50*Numero de dependentes)
		 * --------------------------------------------------------------------------
		 * Desconto INSS: - Se salario Bruto <= 1000 INSS = Salario Bruto * 8.8/100
		 * 				  - Se salario Bruto  > 1000 INSS = Salario Bruto * 9/100 
		 * --------------------------------------------------------------------------
		 * Desconto IR: - Se Salario Bruto <= 500 IR=0
		 * 				- Se Salario Bruto > 500 e <= 1000 IR=Salario Bruto * 5/100
		 * 				- Se Salario Bruto > 1000 IR=Salario Bruto * 7/100
		 * --------------------------------------------------------------------------
		 * Salario Liquido: Salario Liquido - INSS - IR
		 * --------------------------------------------------------------------------
		 * Informe a quantidade de horas trabalhadas:
		 * 160
		 * Informe o Salario Hora: 
		 * 3,50
		 * Informe o Numero de dependentes:
		 * 1
		 * Salario   Bruto: 610.0
		 * Desconto   INSS: 51.85
		 * Desconto     IR: 30.5
		 * Salario Liquido: 527.65
		 * 
		 * CASO NAO SEJA IGUAL ESSE RESULTADOS, HÁ UM ERRO NO SEU CODIGO!*/
		
		Scanner input = new Scanner(System.in);
		double qtd_Horas_Trabalhadas, salario_Hora, numeroDeDependentes;
		double INSS = 0, IR = 0,salarioLiquido;
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		qtd_Horas_Trabalhadas = input.nextDouble();
		System.out.println("Informe o Salario Hora: ");
		salario_Hora = input.nextDouble();
		System.out.println("Informe o Numero de dependentes: ");
		numeroDeDependentes = input.nextDouble();
		
		//Calculo Salario Bruto
		double salarioBruto = qtd_Horas_Trabalhadas*salario_Hora+(50*numeroDeDependentes);
		
		//Desvio Desconto INSS
		if(salarioBruto <= 1000) {
			INSS = salarioBruto*8.5/100;
		}else if(salarioBruto > 1000){
			INSS = salarioBruto*9/100;
		}else
			System.out.println("Erro no calculo! ");
		//Desvio Desconto IR
		if(salarioBruto <= 500) {
			IR=0;
		}else if(salarioBruto > 500 && salarioBruto<= 1000) {
			IR = salarioBruto*5/100;
		}else if(salarioBruto > 1000) {
			IR = salarioBruto*7/100;
		}else
			System.out.println("Erro no calculo! ");
		
		//Calculo Salario Liquido
		salarioLiquido = salarioBruto - INSS - IR;
		
		System.out.println("Salario   Bruto: "+ salarioBruto);
		System.out.println("Desconto   INSS: "+ INSS);
		System.out.println("Desconto     IR: "+IR);
		System.out.println("Salario Liquido: "+salarioLiquido);
	}

}
