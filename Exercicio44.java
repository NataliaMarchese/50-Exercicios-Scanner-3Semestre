package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio44 {
    public static void main(String[] args) {

        double valorCompra;
        double frete;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        valorCompra = sc.nextDouble();

        frete = valorCompra >= 150 ? 0 : 20;

        System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
        System.out.printf("Valor do frete: R$ %.2f%n", frete);

        sc.close();
    }
}
