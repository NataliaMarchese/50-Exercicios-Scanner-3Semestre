package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {

        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

        sc.close();
    }
}
