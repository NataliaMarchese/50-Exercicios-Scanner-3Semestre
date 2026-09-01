package exercicioScanner;

import java.util.Scanner;
public class exercicio06 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);System.out.print("Digite a medida em metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;

        System.out.println(metros + " metros equivalem a " + centimetros + " centímetros.");

        scanner.close();
    }
}
