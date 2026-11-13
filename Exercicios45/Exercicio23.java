package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio23 {
    public static void main(String[] args) {
        double salario = 2500.0;
        String mensagem;

        if (salario <= 1500) {
            mensagem = "Salário baixo";
        } else if (salario <= 3000) {
            mensagem = "Salário médio";
        } else if (salario <= 7000) {
            mensagem = "Salário bom";
        } else {
            mensagem = "Salário alto";
        }

        System.out.println(mensagem);
    }
}
