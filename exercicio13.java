package exercicioScanner;
import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // CORREÇÃO: Removida a barra invertida do R$ e organizada a quebra de linha
        System.out.print("Digite o saldo da sua conta: R$ ");
        double saldo = scanner.nextDouble();

        if (saldo > 0) {
            System.out.println("Você possui saldo disponível.");
        }

        scanner.close();
    }

}
