package Capitulo2_Aspectos_Fundamentais_Sobre_Java;
// import -> indica que determinado PACOTE de Classes deve ser carragado no momento da compilacao
//Usada durante o processo de compilacao
import java.io.DataInputStream; //Apontamento para Classe externa
import java.io.IOException; //Apontamento para Classe externa
//import java.io ->  Contem uma serie de classes especializadas em entrada e saida de dados. Classe usada = "DataInputStream"
//OBS: Caso fosse -> import java.io.* -> INDICA que devem ser carregadas todas as classes presentes no pacote java.io.

//SOLICITA 3 VALORES AO USUARIO E NO FINAL EXIBI A MEDIA DESSES VALORES

public class Exemplo02_06_Uso_Do_Teclado_Entrada_De_Dados {
    public static void main(String[] args) {
        String s ="";
        float nota1=0, nota2=0, trabalho=0, media=0;
        // Possibilita a entrada de dados via-teclado
        DataInputStream dado; //declarando um OBJETO chamado "dado" aparti da classe DataInputStream
        try{/*try --> "tente"   {...} --> bloco | try{...} --> bloco try
            * try{...} => sempre atua em conjunto com um ou varios blocos catch | try-catch
            * executa o bloco try e se algum erro ocorrer, a execucao do programa sera desviada para para um dos blocos
            catch, dependendo do erro gerado pela aplicacao.
            * EXEMPLO:
            *           erro de entrada de dados pelo teclado(IOException)
            *           erro na conversao de String em float(NumberFormatException)
            *
            * new DataInputStream(System.in); -> Pode gerar algum tipo de erro! ja que manipula troca de dados entre um periferico(teclado)
            * e a memoria. caso ocorra algum erro, a execucao do programa sera desviada para catch (IOException e){...} ("trata de erros  de entrada e saida de dados")
            *
            * Float.parseFloat(s); --> Nesse momento pode ocorrer erro de conversao, caso o usuario tenha digitado um conteudo diferente
            * de numero. caso ocorra, a execucao do programa sera desviada para catch(NumberFormatException e){...} ("trata de erros de conversao de tipos").
            */
            System.out.println("Entre com a nota 1");
            dado = new DataInputStream(System.in); //recebe o dado digitado pelo usuario por meio do NEW DataInputStream(System.in)
            s=dado.readLine(); //recebe o conteudo do OBJETO dado ("o que foi digitado pelo usuario")
            nota1 =Float.parseFloat(s); //variavel s é converido em uma varivel numerica do tipo float por meio de Float.parseFloat()

            System.out.println("Entre com a nota 2");
            dado = new DataInputStream(System.in); //recebe o dado digitado pelo usuario por meio do NEW DataInputStream(System.in)
            s = dado.readLine(); //recebe o conteudo do OBJETO dado ("o que foi digitado pelo usuario")
            nota2= Float.parseFloat(s); //variavel s é converido em uma varivel numerica do tipo float por meio de Float.parseFloat()

            System.out.println("Entre com a nota do Trabalho");
            dado = new DataInputStream(System.in); //recebe o dado digitado pelo usuario por meio do NEW DataInputStream(System.in)
            s = dado.readLine(); //recebe o conteudo do OBJETO dado ("o que foi digitado pelo usuario")
            trabalho= Float.parseFloat(s); //variavel s é converido em uma varivel numerica do tipo float por meio de Float.parseFloat()

            media=(nota1+nota2+trabalho)/3;
            System.out.println("Media : "+ media);
        } catch (IOException e) {
            System.out.println("Houve erro na entrada de dados");
        }catch(NumberFormatException e){
            System.out.println("Houve erro na conversao, digite apenas caracteres numericos");
        }

    }
}
