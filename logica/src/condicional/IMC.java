package condicional;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double height, weight, imc;

        System.out.print("*********************************************************\n");
        System.out.println(" Interpretação do Índice de massa corporal (imc):");
        System.out.println(" - Índice menor que 18,50 = abaixo do peso.");
        System.out.println(" - Índice entre 18,50 24,99 = peso normal.");
        System.out.println(" - Índice entre 25 e 29,99 = sobrepeso.");
        System.out.println(" - Índice entre 30 e 34,99 = obesidade grau I.");
        System.out.println(" - Índice entre 35 e 39,99 = obesidade grau II (severa).");
        System.out.println(" - Índice acima de 40 =  obesidade grau III (mórbida).");
        System.out.print("*********************************************************\n");

        System.out.print(" Digite sua altura: ");
        height = scan.nextDouble();
        System.out.print(" Digite seu peso: ");
        weight = scan.nextDouble();

        imc = weight / (height * height);

        if (imc < 18.50) {
            System.out.printf(" Seu índice de massa corporal é de %.2f, você está abaixo do peso.\n", imc);
        } else if (imc >= 18.50 && imc <= 24.99) {
            System.out.printf(" Seu índice de massa corporal é de %.2f, você está com peso normal.\n", imc);
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.printf(" Seu índice de massa corporal é de %.2f, você está com sobrepeso.\n", imc);
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.printf(" Seu índice de massa corporal é de %.2f, você está com obesidade grau I.\n", imc);
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.printf(" Seu índice de massa corporal é de %.2f, você está com obesidade grau II (severa).\n",
                    imc);
        } else {
            System.out.printf(" Seu índice de massa corporal é de %.2f, você está com obesidade grau III (mórbida).\n",
                    imc);
        }

        scan.close();
    }

}
