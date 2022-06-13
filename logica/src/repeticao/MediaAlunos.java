package repeticao;

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        int contador = 0;

        while (contador <= 9) {
            System.out.printf("\n Digite a %dª nota: ", contador + 1);
            double nota = scan.nextDouble();
            total += nota;
            contador++;
        }

        double media = total / contador;

        System.out.printf("\n Total de todas as notas é: %.1f\n", total);
        System.out.printf(" Total de alunos: %d\n", contador);
        System.out.printf(" Média da turma é %.1f\n", media);

        scan.close();
    }
}
