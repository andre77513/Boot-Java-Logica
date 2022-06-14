package exercicios;

import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario, salarioIR;

        System.out.print(" Digite o valor do salário: ");
        salario = scan.nextDouble();

        if (salario <= 1903.98) {

            System.out.printf("\n Isento do IR\n Salário: %.2f\n", salario);

        } else if (salario > 1903.98 && salario <= 2826.65) {

            salarioIR = (salario * 7.5) / 100 - 142.80;
            System.out.printf("\n Salário: %.2f\n Desconto do IR: %.2f\n", salario, salarioIR);

        } else if (salario > 2826.65 && salario <= 3751.06) {

            salarioIR = (salario * 15) / 100 - 354.80;
            System.out.printf("\n Salário: %.2f\n Desconto do IR: %.2f\n", salario, salarioIR);

        } else if (salario > 3751.06 && salario <= 4664.68) {

            salarioIR = (salario * 22.5) / 100 - 636.13;
            System.out.printf("\n Salário: %.2f\n Desconto do IR: %.2f\n", salario, salarioIR);

        } else {

            salarioIR = (salario * 27.5) / 100 - 869.36;
            System.out.printf("\n Salário: %.2f\n Desconto do IR: %.2f\n", salario, salarioIR);

        }

        scan.close();
    }
}
