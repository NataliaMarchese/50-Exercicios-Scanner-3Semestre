package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio29 {
    public static void main(String[] args) {
        double imc = 24.5;
        String mensagem;

        if (imc < 18.5) {
            mensagem = "Abaixo do peso";
        } else if (imc <= 24.9) {
            mensagem = "Peso normal";
        } else if (imc <= 29.9) {
            mensagem = "Sobrepeso";
        } else {
            mensagem = "Obesidade";
        }

        System.out.println(mensagem);
    }
}
