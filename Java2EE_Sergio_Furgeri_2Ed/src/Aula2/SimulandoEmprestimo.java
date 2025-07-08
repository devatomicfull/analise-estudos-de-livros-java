package Aula2;

public class SimulandoEmprestimo {
    public int salario = 2000;
    double emprestimo = 1000;
    double salarioCliente = 2000;
    double taxa = 0.1;
    int qtdDeParcela = 10;
    String cliente = "João";

    double total(){
        // M = C(1+i)t --> Calculo de Juros Compostos
        return emprestimo * Math.pow(1 + taxa, qtdDeParcela);
        // 10 é o tempo mensal
    }

    double valorDaParcela(){
        return total() / qtdDeParcela;
    }

    boolean validarEmprestimo(){
        return total() <= (salarioCliente * 0.3); //verificar se empréstimo pode ser concedido
    }

    String dados(){
        String dados = "Cliente: " + cliente + "\nSalário: R$" + salarioCliente + "\nValor do empréstimo: R$" + emprestimo
                + "\nQuantidade de parcelas: " + qtdDeParcela + "\nTaxa de juros: " + (taxa * 100) + "%";
        return dados; //apresentar dados do objeto
    }

    String imprimirParcelas(){
        String parcelas = "Parcelas:\n";
        double saldoDevedor = total();
        double valorParcela = saldoDevedor / qtdDeParcela;
        for (int i = 1; i <= qtdDeParcela; i++) {
            double juros = saldoDevedor * taxa;
            saldoDevedor += juros - valorParcela;
            parcelas += String.format("Parcela %d: R$%.2f\n", i, valorParcela);
        }
        return parcelas; //exibir todas as parcelas
    }

    double taxaEmCimaDoSalario(){
        return salarioCliente * 0.3;
    }
}

