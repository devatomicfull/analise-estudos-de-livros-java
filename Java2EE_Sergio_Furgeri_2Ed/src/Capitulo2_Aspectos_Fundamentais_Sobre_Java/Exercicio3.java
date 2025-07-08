package Capitulo2_Aspectos_Fundamentais_Sobre_Java;

import java.io.DataInputStream;
import java.io.IOException;

public class Exercicio3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		String texto = "";
		DataInputStream informacao;
		double largura, comprimento, areaTotal;
		
		try {
			System.out.println("Largura do lote: ");
			informacao = new DataInputStream(System.in);
			texto = informacao.readLine();
			largura = Double.parseDouble(texto);
			
			System.out.println("Comprimento do lote: ");
			informacao = new DataInputStream(System.in);
			texto = informacao.readLine();
			comprimento = Double.parseDouble(texto);
			
			areaTotal = (largura*2)+(comprimento*2);
			
			System.out.println("Area total do lote: "+ areaTotal+" M2");
		}catch(NumberFormatException e){
            System.out.println("Houve erro na conversao, digite apenas caracteres numericos");
        }

	}

}
