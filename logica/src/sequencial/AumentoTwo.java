package sequencial;

import java.util.Scanner;

public class AumentoTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double salarioBruto, salarioAntigo, percentual;

        System.out.print(" Informe o salário bruto: ");
        salarioBruto = scan.nextDouble();
        System.out.print(" Informe o percentual de aumento: ");
        percentual = scan.nextDouble();

        salarioAntigo = salarioBruto;
        salarioBruto = salarioBruto * (1 + percentual / 100);

        System.out.printf(" O salário antigo de R$ %.2f agora com reajuste de %.1f porcento, é R$ %.2f\n",
                salarioAntigo, percentual, salarioBruto);

        scan.close();
    }
}
