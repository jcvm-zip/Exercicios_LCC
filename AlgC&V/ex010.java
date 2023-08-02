import java.util.Scanner;

/*
Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos Dólares ela pode comprar. Considere US$1,00 = R$3,27
 */
public class ex010 {
    public static void main(String[] args) {
        final double TAXA_CAMBIO = 3.27;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de dinheiro em reais: ");
        double dinheiroEmReais = sc.nextDouble();

        double quantidadeDolares = dinheiroEmReais / TAXA_CAMBIO;

        System.out.printf("Com R$%.2f, você pode comprar US$%.2f.\n", dinheiroEmReais, quantidadeDolares);

        sc.close();
    }
}
