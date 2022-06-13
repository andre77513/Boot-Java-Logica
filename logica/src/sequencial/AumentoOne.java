package sequencial;

import java.util.Scanner;

public class AumentoOne {
    public static void main(String[] args) {

        double salarioBruto;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salário bruto: ");
        salarioBruto = scan.nextDouble();

        double newSalario = salarioBruto * 1.05;

        System.out.printf("O novo salário é de: R$ %.2f\n", newSalario);

        scan.close();
    }
}
