package exercicioScanner;
import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        // CORREÇÃO: Removida a barra invertida do R$
        System.out.print("Digite o salário: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("O funcionário está ativo? (true/false): ");
        boolean ativo = scanner.nextBoolean();

        System.out.println("\n--- Ficha do Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        // CORREÇÃO: Removida a barra invertida do R$
        System.out.println("Salário: R$ " + salario);
        System.out.println("Status Ativo: " + (ativo ? "Sim" : "Não"));

        scanner.close();
    }
}
