package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args) {

        double nota;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota final do aluno:");
        nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}
