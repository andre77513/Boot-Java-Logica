package condicional;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        String result;

        System.out.print(" Digite um número: ");
        num = scan.nextInt();

        if (num % 2 == 0) {
            result = "par";
        } else {
            result = "impar";
        }
        
        System.out.printf("\n O número %d é %s.", num, result);
        System.out.println("\n Encerrando a execução.");

        scan.close();
    }
}
