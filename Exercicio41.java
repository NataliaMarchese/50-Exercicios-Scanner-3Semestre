package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio41 {
    public static void main(String[] args) {

        int idade;
        String mensagem;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        idade = sc.nextInt();

        mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";

        System.out.println(mensagem);

        sc.close();
    }
}
