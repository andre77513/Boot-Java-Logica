package repeticao;

import java.util.Scanner;

public class MediaSentinela {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        int contador = 0;

        System.out.print("\n Digite uma nota ou -1 para sair: ");
        double nota = scan.nextDouble();

        while (nota != -1) {
            total += nota;
            contador++;

            System.out.print("\n Digite uma nota ou -1 para sair: ");
            nota = scan.nextDouble();
        }

        if (contador != 0) {
            double media = total / contador;

            System.out.printf("\n Total de alunos: %d\n Total de notas computadas: %.1f\n Média da sala: %.1f\n",
                    contador, total, media);
        } else {
            System.out.println("\n Não há notas cadastradas no sistema.");
        }

        scan.close();
    }
}
