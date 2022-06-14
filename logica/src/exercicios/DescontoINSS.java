package exercicios;

import java.util.Scanner;

public class DescontoINSS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salarioBruto, inss;

        System.out.print(" Digite o valor do salário: ");
        salarioBruto = scan.nextDouble();

        inss = salarioBruto * (1 - 0.11);

        System.out.printf(" Salário bruto: %.2f, valor do salário com desconto de 11 porcento do inss: %.2f\n", salarioBruto, inss);

        scan.close();
    }
}
