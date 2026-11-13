package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio45 {
    public static void main(String[] args) {
        double valorCompra45 = 400.0;
        int porcentagemDesconto = 0;

        if (valorCompra45 <= 100) {
            porcentagemDesconto = 0;
        } else if (valorCompra45 <= 300) {
            porcentagemDesconto = 5;
        } else if (valorCompra45 <= 500) {
            porcentagemDesconto = 10;
        } else {
            porcentagemDesconto = 15;
        }

        double valorDesconto = (valorCompra45 * porcentagemDesconto) / 100;
        double valorFinal = valorCompra45 - valorDesconto;

        System.out.printf("Valor original: R$ %.2f%n", valorCompra45);
        System.out.println("Porcentagem de desconto: " + porcentagemDesconto + "%");
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);
    }
}
