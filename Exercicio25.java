package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {

        int idade;
        boolean temCnh;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        idade = sc.nextInt();

        System.out.println("Você possui CNH? Digite true para sim ou false para não:");
        temCnh = sc.nextBoolean();

        if (idade >= 18 && temCnh == true) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }

        sc.close();
    }
}
