import java.util.Scanner;

public class ex3 {
      public static void main(String[] args) {

        Scanner dadosScanner= new Scanner(System.in);

        String nome, sexo, estado;
        int idade;
        double salario;
       
        do {
            System.out.println("Insira seu nome: ");
            nome = dadosScanner.nextLine();

            System.out.println("Insira seu sexo: 'f' ou 'm' ");
            sexo = dadosScanner.nextLine();

            System.out.println("Insira seu Estado Civil: 's', 'c', 'v', 'd' ");
            estado = dadosScanner.nextLine();

            System.out.println("Insira sua idade: ");
            idade = dadosScanner.nextInt();
            dadosScanner.nextLine();

            System.out.println("Insira seu salário: ");
            salario = dadosScanner.nextDouble();
            dadosScanner.nextLine();

        } while (
            nome.length() < 3 ||
            idade > 150 ||
            idade <= 0 ||
            salario < 0 ||
            !sexo.equals("m") && !sexo.equals("f") ||
            !estado.equals("s") && !estado.equals("c") && !estado.equals("v") && !estado.equals("d")
        );

        System.out.println("Cadastro realizado!");
        dadosScanner.close();

    }
}