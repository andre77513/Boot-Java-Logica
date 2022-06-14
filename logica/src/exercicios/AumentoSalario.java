package exercicios;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ano;
        double aumento, salario, percentual;

        salario = 1000.00;
        aumento = 0;

        // percentuais de aumento: 2015=8.80 2016=11.67 2017=6.47 2018=1.81 2019=4.61
        // 2020=4.68 2021=5.26
        // 2022=9.24

        System.out.print("\n Informe o ano atual: ");
        ano = scan.nextInt();
        System.out.print("\n Informe o percentual de aumento: ");
        percentual = scan.nextDouble();

        // aumento = (salario * 8.80) / 100;
        aumento = (salario * 11.67) / 100;
        salario += aumento;
        aumento = (salario * 6.47) / 100;
        salario += aumento;
        aumento = (salario * 1.81) / 100;
        salario += aumento;
        aumento = (salario * 4.61) / 100;
        salario += aumento;
        aumento = (salario * 4.68) / 100;
        salario += aumento;
        aumento = (salario * 5.26) / 100;
        salario += aumento;
        aumento = (salario * percentual) / 100;
        salario += aumento;

        System.out.printf("\n Ano: %d\n Salário atual: %.2f\n", ano, salario);

        scan.close();
    }
}
