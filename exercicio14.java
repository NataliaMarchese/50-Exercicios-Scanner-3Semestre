package exercicioScanner;
import java.util.Scanner;
public class exercicio14 {

    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);System.out.print("Digite a quantidade de produtos no estoque: ");
        int quantidade = scanner.nextInt();

        if (quantidade > 0) {
            System.out.println("Produto disponível para venda.");
        }

        scanner.close();
    }
}
