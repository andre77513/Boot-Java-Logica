package desafio;

import java.util.Scanner;

public class CatalogoProdutos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double aliquota, margem, imposto, lucro, preco, valorCmb, valorEle, valorVes;
        char categoria;
        int cont, op, quantidade, maxProd;

        cont = 0;
        maxProd = 14;
        imposto = 0;
        lucro = 0;
        preco = 0;
        valorCmb = 0;
        valorEle = 0;
        valorVes = 0;

        System.out.print("\n Digite [1] para continuar ou [0] sair: ");
        op = scan.nextInt();

        while (op != 0 && cont <= maxProd) {

            System.out.print("\n Digite a categoria do produto: ");
            categoria = scan.next().charAt(0);
            categoria = Character.toUpperCase(categoria);

            if ((categoria == 'C') || (categoria == 'E') || (categoria == 'V')) {

                switch (categoria) {
                    case 'C':
                        aliquota = 37.41;
                        margem = 30;

                        System.out.println("\n Categoria [C]: Cama, Mesa e Banho");

                        System.out.print("\n Digite o preço do produto: ");
                        preco = scan.nextDouble();
                        System.out.print("\n Digite a quantidade do produto: ");
                        quantidade = scan.nextInt();

                        imposto = (preco * aliquota) / 100;
                        lucro = ((preco + imposto) * margem) / 100;

                        valorCmb += (preco + lucro) * quantidade;

                        System.out.printf(
                                "\n Preço: R$%.2f\n Quantidade: %d\n Valor do imposto: R$%.2f\n Valor do lucro: R$%.2f\n",
                                preco, quantidade, imposto, lucro);
                        System.out.println("_____________________________________________");
                        imposto = 0;
                        lucro = 0;
                        preco = 0;

                        break;
                    case 'E':
                        aliquota = 43.14;
                        margem = 35;

                        System.out.println("\n Categoria [E]: Eletrodoméstico");
                        System.out.print("\n Digite o preço do produto: ");
                        preco = scan.nextDouble();
                        System.out.print("\n Digite a quantidade do produto: ");
                        quantidade = scan.nextInt();

                        imposto = (preco * aliquota) / 100;
                        lucro = ((preco + imposto) * margem) / 100;

                        valorEle += (preco + lucro) * quantidade;

                        System.out.printf(
                                "\n Preço: R$%.2f\n Quantidade: %d\n Valor do imposto: R$%.2f\n Valor do lucro: R$%.2f\n",
                                preco, quantidade, imposto, lucro);
                        System.out.println("_____________________________________________");
                        imposto = 0;
                        lucro = 0;
                        preco = 0;

                        break;
                    case 'V':
                        aliquota = 38.42;
                        margem = 50;

                        System.out.println("\n Categoria [V]: Vestuário");
                        System.out.print("\n Digite o preço do produto: ");
                        preco = scan.nextDouble();
                        System.out.print("\n Digite a quantidade do produto: ");
                        quantidade = scan.nextInt();

                        imposto = (preco * aliquota) / 100;
                        lucro = ((preco + imposto) * margem) / 100;

                        valorVes += (preco + lucro) * quantidade;

                        System.out.printf(
                                "\n Preço: R$%.2f\n Quantidade: %d\n Valor do imposto: R$%.2f\n Valor do lucro: R$%.2f\n",
                                preco, quantidade, imposto, lucro);
                        System.out.println("_____________________________________________");
                        imposto = 0;
                        lucro = 0;
                        preco = 0;

                        break;
                }

            } else {

                System.out.println("\n Categoria inválida!");
                System.out.printf(" Categoria digitada: %c\n", categoria);
                System.out.println(" Categorias aceitas: [C] , [E] e [V].");

            }

            cont++;
            System.out.print("\n Digite [1] para continuar ou [0] sair: ");
            op = scan.nextInt();
        }

        if (cont == maxProd) {
            System.out.printf("\n Cadastro de produtos cheio!\n Quantidade de produtos: %d\n", cont);
        }

        System.out.printf("\n Quantidade de produtos: %d\n", cont);

        System.out.println("\n_____________________________________________");
        System.out.println("\n Categoria [C]: Cama, Mesa e Banho");
        System.out.printf(" Valor total do estoque: R$%.2f\n",
                valorCmb);
        System.out.println("_____________________________________________");

        System.out.println("\n Categoria [E]: Eletrodoméstico");
        System.out.printf(" Valor total do estoque: R$%.2f\n",
                valorEle);
        System.out.println("_____________________________________________");

        System.out.println("\n Categoria [V]: Vestuário");
        System.out.printf(" Valor total do estoque: R$%.2f\n",
                valorVes);
        System.out.println("_____________________________________________");

        scan.close();
    }
}
