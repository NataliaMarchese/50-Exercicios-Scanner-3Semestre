package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {

        String email;
        String senha;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu email:");
        email = sc.nextLine();

        System.out.println("Digite sua senha:");
        senha = sc.nextLine();

        if (email.equals("admin@email.com") && senha.equals("123456")) {
            System.out.println("Login realizado com sucesso.");
        } else {
            System.out.println("Email ou senha inválidos.");
        }

        sc.close();
    }
}
