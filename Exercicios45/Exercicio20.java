package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio20 {
    public static void main(String[] args) {
        boolean temPermissao = true;
        String mensagem;

        if (temPermissao) {
            mensagem = "Acesso liberado.";
        } else {
            mensagem = "Acesso negado.";
        }

        System.out.println(mensagem);
    }
}
