package Capitulo8_Utilizacao_De_Arrays;

import Capitulo5_Criacao_De_Metodos.Exemplo05_07_Classe_Externa_Diversos.Diversos;

public class Exemplo08_03_Arrays_Bidimensionais {

	public static void main(String[] args) {
		float notas[][] = new float[3][2];//declaração do array bidimensional
		int aluno = 0, nota;
		while(aluno<3) {
			nota = 0;
			while(nota<2) {
				System.out.println("Aluno "+(aluno+1)+", digite a "+(nota+1)+" Nota:");
				notas[aluno][nota] = Diversos.leNumeroFloat(0,10); //le a nota
				nota++;
			}
		aluno++;
		}
	System.out.println();
	//consultando as notas de um determinado aluno
	System.out.println("---------Consultando  notas de um aluno---------");
	System.out.println("Digite o Nº do aluno (1-3): ");
	aluno = Diversos.leNumeroInt(1, 3);//le o numero do aluno
	System.out.println("Aluno: "+aluno);
	System.out.println("Nota1: "+notas[aluno-1][0]+" Nota2: "+notas[aluno-1][1]);
	System.out.println("Media: "+((notas[aluno-1][0]+notas[aluno-1][1])/2));
	
	/* RESULTADO:
	 * 
	 * 	Aluno 1, digite a 1 Nota:
		10.0
		Aluno 1, digite a 2 Nota:
		7.5
		Aluno 2, digite a 1 Nota:
		8.0
		Aluno 2, digite a 2 Nota:
		9.0
		Aluno 3, digite a 1 Nota:
		4.5
		Aluno 3, digite a 2 Nota:
		6.0
		
		---------Consultando  notas de um aluno---------
		Digite o N� do aluno (1-3): 
		2
		Aluno: 2
		Nota1: 8.0 Nota2: 9.0
		Media: 8.5
	 */
	}
}

