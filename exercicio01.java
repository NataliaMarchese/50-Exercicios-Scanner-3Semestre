package exercicioScanner;
import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Digite a sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("\nOlá! Esta pessoa se chama " + nome + ", tem " + idade + " anos e mora em " + cidade + ".");

        scanner.close();
    }
}

