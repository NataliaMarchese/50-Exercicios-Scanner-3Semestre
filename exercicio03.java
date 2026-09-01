package exercicioScanner;
import java.util.Scanner;
import java.util.Calendar;
public class exercicio03 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idadeAproximada = anoAtual - anoNascimento;

        System.out.println("Sua idade aproximada é: " + idadeAproximada + " anos.");

        scanner.close();
    }

}
