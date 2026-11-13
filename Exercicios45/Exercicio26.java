package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio26 {
    public static void main(String[] args) {
        int statusPedido = 3;
        String mensagem;

        switch (statusPedido) {
            case 1:
                mensagem = "Pedido recebido";
                break;
            case 2:
                mensagem = "Pedido em preparação";
                break;
            case 3:
                mensagem = "Pedido enviado";
                break;
            case 4:
                mensagem = "Pedido entregue";
                break;
            default:
                mensagem = "Status inválido";
                break;
        }

        System.out.println(mensagem);
    }
}
