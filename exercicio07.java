package exercicioScanner;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? R$ ");
        double valorHora = scanner.nextDouble();

        System.out.print("Quantas horas você trabalhou no mês? ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        System.out.printf("Seu salário bruto este mês é: R$ %.2f\n", salarioBruto);

        scanner.close();
    }

    }

