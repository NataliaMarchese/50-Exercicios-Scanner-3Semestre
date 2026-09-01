package exercicioScanner;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double valorTotal = valorUnitario * quantidade;

        // CORREÇÃO AQUI: Mudado de R\$ para R$
        System.out.println("\nProduto: " + nomeProduto + " | Valor Total de Compra: R$ " + valorTotal);

        scanner.close();
    }
}
