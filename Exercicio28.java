package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {

        double saldo;
        double saque;
        double saldoRestante;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo da conta:");
        saldo = sc.nextDouble();

        System.out.println("Digite o valor do saque:");
        saque = sc.nextDouble();

        if (saque <= saldo) {

            saldoRestante = saldo - saque;

            System.out.println("Saque realizado com sucesso.");
            System.out.printf("Saldo restante: R$ %.2f%n", saldoRestante);

        } else {

            System.out.println("Saldo insuficiente.");
        }

        sc.close();
    }
}
