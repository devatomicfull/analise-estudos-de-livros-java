package livro.produtos;


import livro.livraria.*;

public class LivroFisico extends Livro implements Promocional {
    private final double taxa = 0.05;

    public LivroFisico(Autor autor) {
        super(autor);
    }

    

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        //Livro fisico permite ate 30% de desconto
        if (porcentagem > 0.3) {
            return false;
        }
        double desconto = getPreco() * porcentagem;
        setPreco(getPreco() - desconto);
        System.out.println("Aplicado desconto ao Livro Fisico");
        return true;
    }


    public double getTaxa() {
        return taxa * this.getPreco();
    }
}
