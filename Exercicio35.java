package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio35 {
    public static void main(String[] args) {

        int xp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de XP do jogador:");
        xp = sc.nextInt();

        if (xp < 1000) {
            System.out.println("Iniciante");
        } else if (xp <= 4999) {
            System.out.println("Intermediário");
        } else if (xp <= 9999) {
            System.out.println("Avançado");
        } else {
            System.out.println("Lendário");
        }

        sc.close();
    }
}
