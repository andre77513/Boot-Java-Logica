package exercicios;

import java.util.Scanner;

public class NotasEscolares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double bimestre1, bimestre2, bimestre3, bimestre4, media;
        int qtdAula, qtdFaltas, presenca;
        String disciplina;

        System.out.print(" Digite o nome da disciplina: ");
        disciplina = scan.next();
        System.out.print(" Digite a quantidade de aulas: ");
        qtdAula = scan.nextInt();
        System.out.print(" Digite o número de faltas: ");
        qtdFaltas = scan.nextInt();

        System.out.print(" Digite a nota do primeiro bimestre: ");
        bimestre1 = scan.nextDouble();
        System.out.print(" Digite a nota do segundo bimestre: ");
        bimestre2 = scan.nextDouble();
        System.out.print(" Digite a nota do terceiro bimestre: ");
        bimestre3 = scan.nextDouble();
        System.out.print(" Digite a nota do quarto bimestre: ");
        bimestre4 = scan.nextDouble();

        media = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;
        presenca = qtdAula - qtdFaltas;

        if (presenca >= qtdAula * 0.75 && media >= 6.0) {
            System.out.printf("\n Disciplina: %s\n Aprovado. \n Média: %.1f\n", disciplina, media);
        } else {
            System.out.printf("\n Disciplina: %s\n Reprovado. \n Média: %.1f\n", disciplina, media);

            if (!(presenca >= qtdAula * 0.75)) {
                System.out.printf(" Reprovado por número de faltas! Faltas: %d\n", presenca);
            }

        }

        scan.close();
    }
}
