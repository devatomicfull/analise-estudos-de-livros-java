package Capitulo2_Aspectos_Fundamentais_Sobre_Java;

public class Exemplo02_04_Passagem_De_Parametros {
    public static void main(String[] args) {
        /*Quando é recebido  por um programa, ele pode ser manipulado internamente e usado em um procedimeto
        * qualquer. "Palavras que o usuario digita no momento da execução do programa" por meio  da linha de comando
        * Deve executar o comando no seguinto formato no terminal DOS:
        *
        * java Exemplo02_04_Passagem_De_Parametros argumento1 argumento2  --> EXEMPLO SINTAXE
        * java Exemplo02_04_Passagem_De_Parametros aprendendo java
        *
        * O nome do programa e da Classe devem ser iguais, caso contrario irá resultar em erro
        * */
        System.out.println(args[0]);//imprime o 1° argumento na tela
        System.out.println(args[1]);//imprime o 2° argumento na tela

        /* java Exemplo02_04_Passagem_De_Parametros WELCOME HELLO
         * 
         * Ao digitar esta linha de comando, obviamente depois de o programa ter sido compilado, o programa irá
        imprimir na tela os dois argumentos inseridos pelo usuário. Essas palavras são passadas ao programa por
        meio do vetor args existente na linha do método main. A variável args é um vetor de String
        (na realidade String não é uma simples variável e sim um objeto que será estudado mais à frente) que possui
        o primeiro elemento do vetor com índice 0 (zero). Sendo assim, cada palavra digitada na linha de comando,
        separada por um espaço, será armazenada em um índice do vetor args (args [0] armazena o primeiro argumento,
        args[1] o segundo e assim sucessivamente).
        Para que este exemplo funcione corretamente, o usuário deve digitar pelo menos duas palavras na linha de comando;
        caso contrário, um erro será apre sentado no momento da execução, por meio da geração de uma exceção da linguagem
        (item tratado mais adiante).
        Esse fato ocorre porque o programa foi elaborado para imprimir na tela os dois primeiros argumentos passados (args[0] e args[1]).
        A figura 2.3. demonstra a tela de resultado da execução do exemplo 2.4. Observe que foram enviados dois números
        no momento da execução e eles foram impressos na tela.
        Os argumentos passados na linha de comando sempre se referem a "variáveis" do tipo String devido à sintaxe
        utilizada no método principal (main), ou seja, args é um vetor de tipos String. Por esse motivo, mesmo que sejam
        passados números como parâmetros, eles serão considerados como caracteres.*/

    }
}
