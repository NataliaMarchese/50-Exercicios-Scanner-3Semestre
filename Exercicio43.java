package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio43 {
    public static void main(String[] args) {

        int numero;
        String mensagem;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        numero = sc.nextInt();

        mensagem = numero % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(mensagem);

        sc.close();
    }
}
