package Aula2;

public class Principal {
        public static void main(String[] args) {
            SimulandoEmprestimo emprestimo = new SimulandoEmprestimo();

            if (emprestimo.validarEmprestimo()) {
                System.out.println("Empréstimo aprovado!");
                System.out.println("Dados do empréstimo:");
                System.out.println(emprestimo.dados());
                System.out.println(emprestimo.imprimirParcelas());
            } else {
                System.out.println("Empréstimo não pode ser concedido devido ao valor da parcela ser superior a 30% do salário.");
            }
        }

}
