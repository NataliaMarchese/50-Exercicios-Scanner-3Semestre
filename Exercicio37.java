package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio37 {
    public static void main(String[] args) {

        double valorCompra;
        double desconto;
        double valorFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        valorCompra = sc.nextDouble();

        if (valorCompra <= 100) {

            desconto = 0;

        } else if (valorCompra <= 300) {

            desconto = valorCompra * 0.05;

        } else if (valorCompra <= 500) {

            desconto = valorCompra * 0.10;

        } else {

            desconto = valorCompra * 0.15;
        }

        valorFinal = valorCompra - desconto;

        System.out.printf("Valor original: R$ %.2f%n", valorCompra);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        sc.close();
    }
}
