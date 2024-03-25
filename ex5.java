import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner dadosScanner = new Scanner(System.in);
        double paisUm, paisDois;

        System.out.println("Insira a população do país A: ");
        paisUm = dadosScanner.nextDouble();

        System.out.println("Insira a população do país B: ");
        paisDois = dadosScanner.nextDouble();

        System.out.println("Número de anos necessários é");

        int ano = 0;
        for (double index = paisUm * 0.03; index < paisDois * 0.015; index++) {
            ano++;

            System.out.print(ano + ", ");
        }

        dadosScanner.close();
    }
}