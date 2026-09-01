package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio48 {
    public static void main(String[] args) {

        int operacao;
        double numero01;
        double numero02;
        double resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        numero01 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        numero02 = sc.nextDouble();

        System.out.printf("""
                
                1) Soma
                2) Subtração
                3) Multiplicação
                4) Divisão
                """);

        System.out.println("Escolha a operação:");
        operacao = sc.nextInt();

        switch (operacao) {

            case 1:
                resultado = numero01 + numero02;

                System.out.println("Operação escolhida: Soma");
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = numero01 - numero02;

                System.out.println("Operação escolhida: Subtração");
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = numero01 * numero02;

                System.out.println("Operação escolhida: Multiplicação");
                System.out.println("Resultado: " + resultado);
                break;

            case 4:

                if (numero02 == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    resultado = numero01 / numero02;

                    System.out.println("Operação escolhida: Divisão");
                    System.out.println("Resultado: " + resultado);
                }

                break;

            default:
                System.out.println("Operação inválida");
                break;
        }

        sc.close();
    }
}
