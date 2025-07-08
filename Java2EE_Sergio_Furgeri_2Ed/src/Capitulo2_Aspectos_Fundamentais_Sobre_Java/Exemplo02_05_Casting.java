package Capitulo2_Aspectos_Fundamentais_Sobre_Java;

public class Exemplo02_05_Casting {
    public static void main(String[] args) {
        /*CONVERSAO DE TIPOS:TODOS OS DADOS RECEBIDOS COMO ARGUMENTOS EM UMA APLICACAO REFEREM-SE A VALORES DO TIPO String
        * , entao necessita-se realizar a conversao em diversos tipos primitivos existentes.*/
        int inteirox = 10;
        float flutuantex = 10.5F, flutuantePonto = 10.35F;
        String stringx = "10", stringPonto = "20.54", stringLetras = "java";
        double flutuantePrecisaoDupla = 254.34;
        byte byte8Bites[] = {1,2,7};
        
        //CONVERSÃO DE VALORES
        float conversaoParaFloat = (float) inteirox; //converte em float
        double conversaoParaDouble = (double) inteirox; //converte em double
        int conversaoParaInt = (int) flutuantex; //converte em int
        int conversaoParaInt_ = Integer.parseInt(stringx); //converte em int
        float conversaoParaFloat_ = Float.parseFloat(stringPonto); //converte em float
        double conversaoParaDouble_ = Double.parseDouble(stringPonto); //converte em double
        byte conversaoVetorBytes [] = stringLetras.getBytes(); //converte em vetor de bytes
        String conversaoStringI = String.valueOf(inteirox); //converte em string
        String conversaoStringF = String.valueOf(flutuantePonto); //converte em string
        String conversaoStringD = String.valueOf(flutuantePrecisaoDupla); //converte em string
        String conversaoString = new String(byte8Bites); //converte em string
        
        //APRESNTANDO OS VALOR INICIAL E SUA CONVERSÃO PARA OUTRO TIPO
        System.out.println("(cast)");
        System.out.println(inteirox + " int convertido para float "+ conversaoParaFloat);
        System.out.println(inteirox + " int convertido para double "+ conversaoParaDouble);
        System.out.println(flutuantex + " float convertido para int "+ conversaoParaInt);
        System.out.println();
        System.out.println("Classe.metodo() - exemplo: Integer.parseInt()");
        System.out.println(stringx + " String convertido para int "+ conversaoParaInt_);
        System.out.println(stringPonto + " String convertido para float "+ conversaoParaFloat_);
        System.out.println(stringPonto + " String convertido para Double "+ conversaoParaDouble_);
        System.out.println();
        System.out.println(" variavel.getBytes() - converte em um vetor daquele tipo apos get");
        System.out.println(stringLetras + " String convertido para vetor de bytes "+ conversaoVetorBytes);
        System.out.println();
        System.out.println("Classe.metodo() - exemplo: String.valueOf() - converte em String");
        System.out.println(inteirox + " int convertido para String "+ conversaoStringI);
        System.out.println(flutuantePonto + " float convertido para String "+ conversaoStringF);
        System.out.println(flutuantePrecisaoDupla + " double convertido para String "+ conversaoStringD);
        System.out.println(byte8Bites + " vetor de bytes convertido para String "+ conversaoString);
    }
}
