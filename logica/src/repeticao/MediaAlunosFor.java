package repeticao;

import java.util.Scanner;

public class MediaAlunosFor {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double total = 0;
            int contador;

            for (contador = 0; contador <= 9; contador++) {
                System.out.printf("\n Digite a %dª nota: ", contador + 1);
                double nota = scan.nextDouble();

                total += nota;
            }

            double media = total / contador;

            System.out.printf("\n Total de todas as notas é: %.1f\n", total);
            System.out.printf(" Total de alunos: %d\n", contador);
            System.out.printf(" Média da turma é %.1f\n", media);

            scan.close();
        }
    }
}
