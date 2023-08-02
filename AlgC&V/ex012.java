import java.util.Scanner;

/*
Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
 */
public class ex012 {
    public static void main(String[] args) {
        final double DESCONTO_PERCENTUAL = 5.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$");
        double precoProduto = sc.nextDouble();

        double desconto = (precoProduto * DESCONTO_PERCENTUAL) / 100.0;
        double novoPreco = precoProduto - desconto;

        System.out.printf("O novo preço com 5%% de desconto é: R$%.2f\n", novoPreco);

        sc.close();
    }
}