package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio22 {
    public static void main(String[] args) {
        double nota = 8.5;
        String mensagem;

        if (nota >= 9) {
            mensagem = "Excelente";
        } else if (nota >= 7) {
            mensagem = "Bom";
        } else if (nota >= 5) {
            mensagem = "Recuperação";
        } else {
            mensagem = "Reprovado";
        }

        System.out.println(mensagem);
    }
}
