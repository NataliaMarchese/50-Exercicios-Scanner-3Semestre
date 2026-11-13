package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio42 {
    public static void main(String[] args) {
        double saldo42 = 50.0;
        double valorProduto42 = 100.0;
        boolean clienteVip = true;

        if (saldo42 >= valorProduto42) {
            System.out.println("Compra aprovada");
        } else if (clienteVip) {
            System.out.println("Compra aprovada pelo crédito VIP");
        } else {
            System.out.println("Compra recusada");
        }
    }
}
