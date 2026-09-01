package exercicioScanner;

import java.util.Scanner;
public class exercicio08 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double dobro = numero * 2;
        double metade = numero / 2;

        System.out.println("O dobro de " + numero + " é: " + dobro);
        System.out.println("A metade de " + numero + " é: " + metade);

        scanner.close();
    }
}
