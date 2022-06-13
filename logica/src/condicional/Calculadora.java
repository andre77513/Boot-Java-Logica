package condicional;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        double n1, n2, result;

        System.out.print(" Informe o primeiro valor: ");
        n1 = scan.nextDouble();
        System.out.print(" Informe o segundo valor: ");
        n2 = scan.nextDouble();

        System.out.println("\n Calculadora");
        System.out.println(" [1] Soma");
        System.out.println(" [2] Subtração");
        System.out.println(" [3] Divisão");
        System.out.println(" [4] Multiplicação");
        System.out.print(" Escolha uma opção: ");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                result = n1 + n2;
                System.out.printf(" %.2f + %.2f = %.2f\n", n1, n2, result);
                break;
            case 2:
                result = n1 - n2;
                System.out.printf(" %.2f - %.2f = %.2f\n", n1, n2, result);
                break;
            case 3:
                result = n1 / n2;
                System.out.printf(" %.2f / %.2f = %.2f\n", n1, n2, result);
                break;
            case 4:
                result = n1 * n2;
                System.out.printf(" %.2f * %.2f = %.2f\n", n1, n2, result);
                break;
            default:
                System.out.println(" Opção inválida!");
        }

        scan.close();
    }
}
