package flamingo.aprendendo.basico.Exercicios45;

public class Exercicio14 {
   public static void main(String[] args) {
        boolean emailCorreto = true;
        boolean senhaCorreta =true;

        if (emailCorreto && senhaCorreta){
            System.out.println("Login realizado com sucesso.");
        }
        else{
            System.out.println("Email ou senha inválidos.");
        }
    }
}
