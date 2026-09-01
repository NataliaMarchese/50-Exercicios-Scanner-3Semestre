package exercicioScanner;
import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);System.out.print("Digite a velocidade do veículo (km/h): ");
        double velocidade = scanner.nextDouble();

        if (velocidade > 80) {
            System.out.println("Você foi multado.");
        }

        scanner.close();
    }
}
