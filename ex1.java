import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner dadosScanner = new Scanner(System.in);

        double nota;

        do {
            System.out.print("Insira uma nota entre 0 e 10: ");
            nota = dadosScanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! A nota deve ser entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota digitada: " + nota);

        dadosScanner.close();
    }
}