package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio36 {
    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso:");
        peso = sc.nextDouble();

        System.out.println("Digite a altura:");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

        sc.close();
    }
}
