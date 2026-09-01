package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {

        double salario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário do usuário:");
        salario = sc.nextDouble();

        if (salario <= 1500) {
            System.out.println("Salário baixo");
        } else if (salario <= 3000) {
            System.out.println("Salário médio");
        } else if (salario <= 7000) {
            System.out.println("Salário bom");
        } else {
            System.out.println("Salário alto");
        }

        sc.close();
    }
}
