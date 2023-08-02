import java.util.Scanner;

/*
Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0,15 por Km rodado.
 */
public class ex015 {
    public static void main(String[] args) {
        final double PRECO_DIARIA = 60.0;
        final double PRECO_POR_KM = 0.15;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de Km percorridos: ");
        double kmPercorridos = scanner.nextDouble();

        System.out.print("Digite a quantidade de dias de aluguel: ");
        int diasAlugados = scanner.nextInt();

        double precoPorKm = kmPercorridos * PRECO_POR_KM;
        double precoPorDias = diasAlugados * PRECO_DIARIA;
        double precoTotal = precoPorKm + precoPorDias;

        System.out.println("O preço total a pagar é: R$" + precoTotal);

        scanner.close();
    }
}
