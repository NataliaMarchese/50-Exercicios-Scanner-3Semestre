package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio44 {
    public static void main(String[] args) {
        String emailDigitado = "user@email.com";
        String senhaDigitada = "123456";

        String emailCorreto = "user@email.com";
        String senhaCorreta = "123456";
        boolean contaAtiva = true;

        if (!emailDigitado.equals(emailCorreto) || !senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Dados inválidos");
        } else if (!contaAtiva) {
            System.out.println("Conta bloqueada");
        } else {
            System.out.println("Login realizado");
        }
    }
}
