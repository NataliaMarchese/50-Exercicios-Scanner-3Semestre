package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args) {

        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do atleta:");
        idade = sc.nextInt();

        if (idade <= 10) {
            System.out.println("Infantil");
        } else if (idade <= 15) {
            System.out.println("Juvenil");
        } else if (idade <= 20) {
            System.out.println("Júnior");
        } else if (idade <= 35) {
            System.out.println("Profissional");
        } else {
            System.out.println("Sênior");
        }

        sc.close();
    }
}
