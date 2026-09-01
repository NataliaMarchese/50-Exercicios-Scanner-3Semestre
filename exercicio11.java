package exercicioScanner;
import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Entrada permitida.");
        }

        scanner.close();
    }
}
