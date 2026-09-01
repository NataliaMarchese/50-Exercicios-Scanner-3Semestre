package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {

        double saldo;
        double valorProduto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo do cliente:");
        saldo = sc.nextDouble();

        System.out.println("Digite o valor do produto:");
        valorProduto = sc.nextDouble();

        if (saldo >= valorProduto) {
            System.out.println("Compra aprovada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        sc.close();
    }
}
