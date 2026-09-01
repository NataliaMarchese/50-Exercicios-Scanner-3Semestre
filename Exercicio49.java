package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio49 {
    public static void main(String[] args) {

        int tipoCombustivel;
        double litros;
        double preco;
        double total;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                1) Gasolina - R$ 5,80
                2) Etanol - R$ 4,20
                3) Diesel - R$ 6,00
                """);

        System.out.println("Escolha o tipo de combustível:");
        tipoCombustivel = sc.nextInt();

        switch (tipoCombustivel) {

            case 1:
                System.out.println("Quantos litros de gasolina você deseja?");
                litros = sc.nextDouble();

                preco = 5.80;
                total = preco * litros;

                System.out.println("Combustível escolhido: Gasolina");
                System.out.printf("Quantidade de litros: %.2f%n", litros);
                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            case 2:
                System.out.println("Quantos litros de etanol você deseja?");
                litros = sc.nextDouble();

                preco = 4.20;
                total = preco * litros;

                System.out.println("Combustível escolhido: Etanol");
                System.out.printf("Quantidade de litros: %.2f%n", litros);
                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            case 3:
                System.out.println("Quantos litros de diesel você deseja?");
                litros = sc.nextDouble();

                preco = 6.00;
                total = preco * litros;

                System.out.println("Combustível escolhido: Diesel");
                System.out.printf("Quantidade de litros: %.2f%n", litros);
                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            default:
                System.out.println("Tipo de combustível inválido");
                break;
        }

        sc.close();
    }
}
