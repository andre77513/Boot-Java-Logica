package condicional;

import java.util.Scanner;

public class Genero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char genero;

        System.out.print(" Digite o genero (F ou M): ");
        genero = scan.next().charAt(0);
        genero = Character.toUpperCase(genero);

        System.out.println((genero == 'F') ? " Feminino" : (genero == 'M') ? " Masculino" : " Valor inválido!");

        scan.close();
    }
}
