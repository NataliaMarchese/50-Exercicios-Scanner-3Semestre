package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio30 {
    public static void main(String[] args) {

        String senha;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha:");
        senha = sc.nextLine();

        if (senha.equals("java123")) {
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Senha incorreta.");
        }

        sc.close();
    }
}
