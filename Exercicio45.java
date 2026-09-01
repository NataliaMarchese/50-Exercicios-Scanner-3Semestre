package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio45 {

    public static void main(String[] args) {

        double salario;
        double bonus;
        double valorTotal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário:");
        salario = sc.nextDouble();

        bonus = salario < 3000 ? 500 : 200;

        valorTotal = salario + bonus;

        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Bônus: R$ %.2f%n", bonus);
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
