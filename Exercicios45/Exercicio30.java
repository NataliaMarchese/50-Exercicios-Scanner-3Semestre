package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio30 {
    public static void main(String[] args) {
        int tipoCliente = 3;
        double valorCompra = 200.0;
        double valorFinal;

        switch (tipoCliente) {
            case 1:
                valorFinal = valorCompra;
                break;
            case 2:
                valorFinal = valorCompra - (valorCompra * 0.05);
                break;
            case 3:
                valorFinal = valorCompra - (valorCompra * 0.10);
                break;
            case 4:
                valorFinal = valorCompra - (valorCompra * 0.15);
                break;
            default:
                valorFinal = valorCompra;
                break;
        }

        System.out.println(valorFinal);
    }
}
