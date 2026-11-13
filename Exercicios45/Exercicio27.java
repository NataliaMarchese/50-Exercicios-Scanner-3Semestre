package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio27 {
    public static void main(String[] args) {
        int codigoProduto = 2;
        String mensagem;

        switch (codigoProduto) {
            case 1:
                mensagem = "Eletrônico";
                break;
            case 2:
                mensagem = "Alimento";
                break;
            case 3:
                mensagem = "Roupa";
                break;
            case 4:
                mensagem = "Livro";
                break;
            default:
                mensagem = "Categoria inválida";
                break;
        }

        System.out.println(mensagem);
    }
}
