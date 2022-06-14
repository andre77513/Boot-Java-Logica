package exercicios;

import java.util.Scanner;

public class AriaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base, altura, area;
        boolean controle;

        System.out.print("\n Informe a base: ");
        base = scan.nextDouble();
        System.out.print("\n Informe a altura: ");
        altura = scan.nextDouble();

        controle = (base <= 0 || altura <= 0);

        while (controle == true) {
            System.out.println("\n Informe um valor para altura e para base maior do que zero!");
            System.out.print("\n Informe a base: ");
            base = scan.nextDouble();
            System.out.print("\n Informe a altura: ");
            altura = scan.nextDouble();

            controle = (base <= 0 || altura <= 0);
        }

        area = (base * altura) / 2;

        System.out.printf("\n Área: %.2fcm²\n", area);

        scan.close();
    }
}
