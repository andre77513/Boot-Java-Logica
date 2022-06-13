package sequencial;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        
        double value1, value2, value3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        value1 = scan.nextDouble();
        System.out.println("Informe o segundo valor: ");
        value2 = scan.nextDouble();
        System.out.println("Informe o terceiro valor: ");
        value3 = scan.nextDouble();

        double media = (value1 + value2 + value3);

        System.out.printf(" A média de %.2f, %.2f e %.2f é %.2f\n", value1, value2, value3, media);

        scan.close();
    }

}
