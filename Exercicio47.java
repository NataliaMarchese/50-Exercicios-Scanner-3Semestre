package flamingo.aprendendo.basico.ExercicioScanner50;
import java.util.Scanner;
public class Exercicio47 {
    public static void main(String[] args) {

        int opcao;
        int quantidade;
        double preco;
        double total;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                1) Hambúrguer - R$ 25,00
                2) Pizza - R$ 40,00
                3) Salada - R$ 18,00
                4) Refrigerante - R$ 8,00
                """);

        System.out.println("Escolha uma opção:");
        opcao = sc.nextInt();

        System.out.println("Digite a quantidade:");
        quantidade = sc.nextInt();

        switch (opcao) {

            case 1:
                preco = 25.00;
                total = preco * quantidade;

                System.out.println("Item escolhido: Hambúrguer");
                System.out.println("Quantidade: " + quantidade);
                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            case 2:
                preco = 40.00;
                total = preco * quantidade;

                System.out.println("Item escolhido: Pizza");
                System.out.println("Quantidade: " + quantidade);
                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            case 3:
                preco = 18.00;
                total = preco * quantidade;

                System.out.println("Item escolhido: Salada");
                System.out.println("Quantidade: " + quantidade);
                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            case 4:
                preco = 8.00;
                total = preco * quantidade;

                System.out.println("Item escolhido: Refrigerante");
                System.out.println("Quantidade: " + quantidade);
                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

        sc.close();
    }
}
