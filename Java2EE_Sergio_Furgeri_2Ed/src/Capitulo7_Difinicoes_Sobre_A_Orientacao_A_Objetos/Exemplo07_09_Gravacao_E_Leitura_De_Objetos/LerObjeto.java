package Exemplo07_09_Gravacao_E_Leitura_De_Objetos;
import java.io.*;
public class LerObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream f = new FileInputStream("computador.arq");
			ObjectInputStream s = new ObjectInputStream(f); 
			Computador x = (Computador)s.readObject();
			System.out.println(x.nome);
			System.out.println(x.velocidade);
			System.out.println(x.memoria);
			System.out.println(x.revendedor);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
