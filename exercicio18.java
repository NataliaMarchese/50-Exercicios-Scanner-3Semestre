package exercicioScanner;
import java.util.Scanner;
public class exercicio18 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);System.out.print("Digite a porcentagem de presença do aluno (0 a 100): ");
        double presenca = scanner.nextDouble();

        if (presenca >= 75) {
            System.out.println("Presença suficiente.");
        }

        scanner.close();
    }
}
