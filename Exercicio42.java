package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio42 {
    public static void main(String[] args) {

        double nota;
        String mensagem;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno:");
        nota = sc.nextDouble();

        mensagem = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(mensagem);

        sc.close();
    }
}
