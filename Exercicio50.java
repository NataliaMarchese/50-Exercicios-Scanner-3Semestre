package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio50 {
    public static void main(String[] args) {

        int plano;
        int meses;
        double valorMensal;
        double valorSemDesconto;
        double desconto;
        double valorFinal;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                1) Básico - R$ 29,90 por mês
                2) Intermediário - R$ 59,90 por mês
                3) Premium - R$ 99,90 por mês
                """);

        System.out.println("Escolha o plano:");
        plano = sc.nextInt();

        System.out.println("Digite a quantidade de meses:");
        meses = sc.nextInt();

        switch (plano) {

            case 1:
                valorMensal = 29.90;

                valorSemDesconto = valorMensal * meses;

                if (meses >= 12) {
                    desconto = valorSemDesconto * 0.10;
                } else {
                    desconto = 0;
                }

                valorFinal = valorSemDesconto - desconto;

                System.out.println("Nome do plano: Básico");
                System.out.printf("Valor mensal: R$ %.2f%n", valorMensal);
                System.out.println("Quantidade de meses: " + meses);
                System.out.printf("Valor sem desconto: R$ %.2f%n", valorSemDesconto);
                System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
                System.out.printf("Valor final do contrato: R$ %.2f%n", valorFinal);
                break;

            case 2:
                valorMensal = 59.90;

                valorSemDesconto = valorMensal * meses;

                if (meses >= 12) {
                    desconto = valorSemDesconto * 0.10;
                } else {
                    desconto = 0;
                }

                valorFinal = valorSemDesconto - desconto;

                System.out.println("Nome do plano: Intermediário");
                System.out.printf("Valor mensal: R$ %.2f%n", valorMensal);
                System.out.println("Quantidade de meses: " + meses);
                System.out.printf("Valor sem desconto: R$ %.2f%n", valorSemDesconto);
                System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
                System.out.printf("Valor final do contrato: R$ %.2f%n", valorFinal);
                break;

            case 3:
                valorMensal = 99.90;

                valorSemDesconto = valorMensal * meses;

                if (meses >= 12) {
                    desconto = valorSemDesconto * 0.10;
                } else {
                    desconto = 0;
                }

                valorFinal = valorSemDesconto - desconto;

                System.out.println("Nome do plano: Premium");
                System.out.printf("Valor mensal: R$ %.2f%n", valorMensal);
                System.out.println("Quantidade de meses: " + meses);
                System.out.printf("Valor sem desconto: R$ %.2f%n", valorSemDesconto);
                System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
                System.out.printf("Valor final do contrato: R$ %.2f%n", valorFinal);
                break;

            default:
                System.out.println("Plano inválido");
                break;
        }

        sc.close();
    }
}
