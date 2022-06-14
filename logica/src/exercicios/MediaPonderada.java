package exercicios;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double n1, n2, n3, n4, media;

        System.out.print(" Digite o primeiro valor: ");
        n1 = scan.nextDouble();
        System.out.print(" Digite o segundo valor: ");
        n2 = scan.nextDouble();
        System.out.print(" Digite o terceiro valor: ");
        n3 = scan.nextDouble();
        System.out.print(" Digite o quarto valor: ");
        n4 = scan.nextDouble();

        media = (n1 * 2 + n2 * 2 + n3 * 3 + n4 * 3) / 10;

        System.out.printf(" A média ponderada é de: %.2f\n", media);

        scan.close();
    }
}
