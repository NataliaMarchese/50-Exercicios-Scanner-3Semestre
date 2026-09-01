package exercicioScanner;
import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aluno aprovado.");
        }

        scanner.close();
    }
}
