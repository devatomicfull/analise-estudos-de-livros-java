package Capitulo1_Linguagem_e_PlataformaSO;

public class Exemplo01_01 {
    public static void main(String[] args) {
       /**Neste Caso, quando a classe for executada, sera invocada o metodo main que possui duas instrucoes para
        *  envio de mensagens na tela (System.out.println).
        * nao é extamente uma instrucao e sim uma classe da linguagem  especializada em saida de dados.
        * 
        * public: É um qualificador do método (pode ser usado em qualquer método, não apenas no main) que indica
        * que ele é acessivel externamente a esta classe (outras classes podem eventualmente utilizar esse método).
        * 
        * static: É um outro qualificador que indica que o método deve ser compartilhado por todos os objetos que são
        * criados a partir desta classe.
        * 
        * void: É o valor de retorno do método "PROCEDIMENTO". Quando não retorna nenhum valor, ela retorna void, uma
        * espécie de valor vazio que tem que ser especificado. 
        * OBSERVAÇÃO: Métodos podem retornar valores, isto é, processar alguma informação e retorna um resultado, ele
        * não possui o qualificador void .
        * 
        * main: Este é o nome do método indica ao compilador o início do programa. Este é o método principal, em que
        * todas as variáveis, argumentos e instruções são interpretados e processados para a execução do programa.
        * 
        * (String args[ ]): É o argumento do método Principal(main) por consequência do programa todo; ele é um vetor
        * de Strings formado por todos os argumentos passados ao programa na linha de comando do sistema operacional
        * quando o programa é invocado.
        * 
        * {} --> Demilitam um bloco de código
        * 
        * executar este programa via terminal:
        * javac Exemplo01_01.java "COMPILA O PROGRAMA"
        * java Exemplo01_01 	  "INTERPRETA"
        * */
    	
        System.out.println("Inicio do aprendizado");
        System.out.println("Ensino Didatico da Linguagem Java");
    }
}
