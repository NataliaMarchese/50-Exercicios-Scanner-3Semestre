package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio16 {
    public static void main(String[] args) {

        double valorCompra = 250.0;

        double valorFinal;

        if (valorCompra >= 200) {

            valorFinal = valorCompra - (valorCompra * 0.10);
            System.out.println("Desconto aplicado! Valor final: R$ " + valorFinal);
        } else {

            valorFinal = valorCompra;
            System.out.println("Valor original da compra: R$ " + valorFinal);
        }
    }
}
