package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio43 {
    public static void main(String[] args) {
        int idade = 25;
        boolean temCarteirinhaEstudante = true;

        if (idade < 12 || temCarteirinhaEstudante) {
            System.out.println("Paga meia-entrada");
        } else {
            System.out.println("Paga inteira");
        }
    }
}
