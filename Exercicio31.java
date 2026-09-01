package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args) {

        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa:");
        idade = sc.nextInt();

        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        sc.close();
    }
}
