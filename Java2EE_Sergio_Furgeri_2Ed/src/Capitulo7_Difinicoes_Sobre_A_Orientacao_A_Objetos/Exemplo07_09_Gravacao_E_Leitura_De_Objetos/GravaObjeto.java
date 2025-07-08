package Exemplo07_09_Gravacao_E_Leitura_De_Objetos;
import java.io.*;
public class GravaObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computador c1 = new Computador();
		c1.nome = "Pentium 4";
		c1.velocidade = "1,5 GigaHertz";
		c1.memoria = "256 MegaBytes";
		c1.revendedor = "Novo Pc";
		
		try {
			FileOutputStream f = new FileOutputStream("computador.arq");
			ObjectOutputStream s = new ObjectOutputStream(f);
			s.writeObject(c1);
			s.flush();
			System.out.println("Gravacao realizada com sucesso! ");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
