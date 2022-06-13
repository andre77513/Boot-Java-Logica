package condicional;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, nota3;

        System.out.print(" Informe a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.print(" Informe a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.print(" Informe a terceira nota: ");
        nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        String result;

        if (media >= 6.0) {
            result = "Aprovado.";
        } else {
            result = "Reprovado.";
        }
        System.out.printf(" O aluno obteve média de %.1f e está %s\n", media, result);
        System.out.println(" Encerrando.");

        scan.close();
    }
}
