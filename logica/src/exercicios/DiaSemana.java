package exercicios;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numDia;

        System.out.print(" Digite um número inteiro de 1 a 7: ");
        numDia = scan.nextInt();

        switch (numDia) {
            case 1:
                System.out.println(" Domingo");
                break;
            case 2:
                System.out.println(" Segunda-Feira");
                break;
            case 3:
                System.out.println(" Terça-Feira");
                break;
            case 4:
                System.out.println(" Quarta-Feira");
                break;
            case 5:
                System.out.println(" Quinta-Feira");
                break;
            case 6:
                System.out.println(" Sexta-Feira");
                break;
            case 7:
                System.out.println(" Sábado");
                break;
            default:
                System.out.printf(" Número inválido!\n Número digitado: %d\n", numDia);
                System.out.println(" Números válidos são de 1 a 7.");
        }
        scan.close();
    }
}
