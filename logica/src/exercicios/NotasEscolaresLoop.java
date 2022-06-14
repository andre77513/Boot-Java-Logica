package exercicios;

import java.util.Scanner;

public class NotasEscolaresLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0, qtdAprovados = 0, qtdReprovados = 0;
        double total;

        total = 0;

        while (cont <= 9) {
            System.out.printf("\n Digite a nota do %dº aluno: ", cont + 1);
            double nota = scan.nextDouble();

            if (nota >= 6.0) {
                qtdAprovados ++;
            } else {
                qtdReprovados ++;
            }

            total += nota;
            cont++;
        }

        double media = total / cont;

        System.out.printf(
                "\n Quantidade de alunos aprovados: %d\n Quantidade de alunos reprovados: %d\n Média da turma: %.1f\n",
                qtdAprovados, qtdReprovados, media);

        scan.close();
    }
}
