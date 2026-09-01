package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio34 {
    public static void main(String[] args) {

        double temperatura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura:");
        temperatura = sc.nextDouble();

        if (temperatura < 15) {
            System.out.println("Frio");
        } else if (temperatura <= 25) {
            System.out.println("Agradável");
        } else if (temperatura <= 35) {
            System.out.println("Quente");
        } else {
            System.out.println("Muito quente");
        }

        sc.close();
    }
}
