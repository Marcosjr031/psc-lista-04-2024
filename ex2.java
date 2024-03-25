import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner dadosScanner = new Scanner(System.in);

        String nome, senha;
        for (;;) {
            System.out.println("Insira o nome de usuário: ");
            nome = dadosScanner.nextLine();

            System.out.println("Insira a senha: ");
            senha = dadosScanner.nextLine();

            if (nome.equals(senha)) {
                System.out.println("Erro: Senha deve ser diferente do nome de usuário.");

            } else {
                System.out.println("Cadastro realizado!");
                dadosScanner.close();
                break;

            }
        }
    }
}