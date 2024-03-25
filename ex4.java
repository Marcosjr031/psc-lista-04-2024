import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner dadosScanner = new Scanner(System.in);
        double paisA = 80000;
        double paisB = 200000;

        System.out.println("Número de anos necessários é:");

        int ano = 0;
        for (double index = paisA * 0.03; index < paisB * 0.015; index++) {
            ano++;

            System.out.print(ano + ", ");
        }

        dadosScanner.close();
    }
}