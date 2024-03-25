import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, troca;

        System.out.println("Insira o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Insira o segundo número: ");
        num2 = scanner.nextInt();

        troca = -1;

        if (num1 > num2) {
            troca = num1;
        }

        if (troca != -1) {
            for (int index = num2 + 1; index < troca; index++) {
                System.out.print(index + " ");
            }
        }

        for (int index = num1 + 1; index < num2; index++) {
            System.out.print(index + " ");
        }

        scanner.close();
    }
}