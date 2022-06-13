package sequencial;

public class Variaveis {

    public static void main(String[] args) {

        int quantidade = 1500;
        float valorMercadoria = 750.28f;
        double peso = 78.3;
        char genero = 'F';

        System.out.printf("Quantidade em estoque: %d\n", quantidade);
        System.out.printf("Valor Mercadoria: R$%.1f\n", valorMercadoria);
        System.out.printf("O André pesa %.3f quilos\n", peso);
        System.out.printf("Gênero: %c", genero);

    }

}
