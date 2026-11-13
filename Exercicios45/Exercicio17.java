package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio17 {
    public static void main(String[] args) {
        int idade = 20;
        boolean temCNH = true;
        String mensagem;

        if (idade >= 18 && temCNH) {
            mensagem = "Pode dirigir.";
        } else {
            mensagem = "Não pode dirigir.";
        }

        System.out.println(mensagem);
    }
}
