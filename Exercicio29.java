package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args) {

        double valorCompra;
        double desconto;
        double valorFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        valorCompra = sc.nextDouble();

        if (valorCompra >= 200) {

            desconto = valorCompra * 0.10;
            valorFinal = valorCompra - desconto;

        } else {

            desconto = 0;
            valorFinal = valorCompra;
        }

        System.out.printf("Valor original: R$ %.2f%n", valorCompra);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        sc.close();
    }

}
