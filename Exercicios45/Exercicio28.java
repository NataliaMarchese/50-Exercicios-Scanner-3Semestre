package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio28 {
    public static void main(String[] args) {
        int plano = 1;
        String mensagem;

        switch (plano) {
            case 1:
                mensagem = "Plano Básico - R$ 29,90";
                break;
            case 2:
                mensagem = "Plano Intermediário - R$ 59,90";
                break;
            case 3:
                mensagem = "Plano Premium - R$ 99,90";
                break;
            default:
                mensagem = "Plano inválido";
                break;
        }

        System.out.println(mensagem);
    }
}
