import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, num4, num5, maiorNum;
        
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

        maiorNum = num1 > num2 ? num1 : (num2 > num3 ? num2 : (num3 > num4 ? num3 : (num4 > num5 ? num4 : num5)));

        System.out.print("O maior número é "+ maiorNum);
        scanner.close();
    }
}