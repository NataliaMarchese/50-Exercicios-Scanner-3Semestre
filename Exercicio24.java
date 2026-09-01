package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        sc.close();
    }
}
