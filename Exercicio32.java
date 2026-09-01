package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio32 {
    public static void main(String[] args) {

        double nota;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno:");
        nota = sc.nextDouble();

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
