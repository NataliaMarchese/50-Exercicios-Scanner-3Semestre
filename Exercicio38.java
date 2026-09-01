package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio38 {
    public static void main(String[] args) {

        double nota;
        double presenca;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno:");
        nota = sc.nextDouble();

        System.out.println("Digite a presença do aluno:");
        presenca = sc.nextDouble();

        if (nota >= 7 && presenca >= 75) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
