package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio19 {
    public static void main(String[] args) {
        double valorCompra = 160.0;
        String mensagem;

        if (valorCompra >= 150) {
            mensagem = "Frete grátis.";
        } else {
            mensagem = "Frete de R$ 20,00.";
        }

        System.out.println(mensagem);
    }
}
