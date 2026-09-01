package exercicioScanner;
import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // CORREÇÃO: Removida a barra invertida do R$ e organizada a quebra de linha
        System.out.print("Digite o valor da compra: R$ ");
        double valor = scanner.nextDouble();

        if (valor >= 100) {
            System.out.println("Cliente ganhou desconto.");
        }

        scanner.close();
    }
}
