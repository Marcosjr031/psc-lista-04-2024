import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, num4, num5, soma, media;

        System.out.println("Insira o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.println("Insira o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Insira o terceiro número: ");
        num3 = scanner.nextDouble();

        System.out.println("Insira o quarto número: ");
        num4 = scanner.nextDouble();

        System.out.println("Insira o quinto número: ");
        num5 = scanner.nextDouble();

        soma = num1 + num2 + num3 + num4 + num5;

        media = soma / 5;

        System.out.print(String.format("A soma dos números é %s e a média é %s", soma, media));
        scanner.close();
    }
}