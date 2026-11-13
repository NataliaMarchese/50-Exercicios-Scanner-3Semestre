package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio24 {
    public static void main(String[] args) {
    int temperatura = 22;
    String mensagem;

    if (temperatura < 15) {
        mensagem = "Frio";
    } else if (temperatura <= 25) {
        mensagem = "Agradável";
    } else if (temperatura <= 35) {
        mensagem = "Quente";
    } else {
        mensagem = "Muito quente";
    }

    System.out.println(mensagem);
}
}
