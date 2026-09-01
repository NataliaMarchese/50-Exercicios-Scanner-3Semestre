package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args) {

        double valorCompra;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        valorCompra = sc.nextDouble();

        if (valorCompra >= 150) {
            System.out.println("Frete grátis.");
        } else {
            System.out.println("Frete de R$ 20,00.");
        }

        sc.close();
    }
}
