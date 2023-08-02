import java.util.Scanner;

/*
Desenvolva um programa que pergunte a distância de uma viagem em Km. Calcule o preço da passagem, cobrando R$0,50 por Km para viagens de até 200Km e R$0,45 parta viagens mais longas.
*/
public class ex031 {
    public static void main(String[] args) {
        final double PRECO_ATE_200_KM = 0.50;
        final double PRECO_MAIS_LONGA = 0.45;
        final int LIMITE_DISTANCIA = 200;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância da viagem em Km: ");
        int distanciaViagem = scanner.nextInt();

        double precoPassagem;

        if (distanciaViagem <= LIMITE_DISTANCIA) {
            precoPassagem = distanciaViagem * PRECO_ATE_200_KM;
        } else {
            precoPassagem = distanciaViagem * PRECO_MAIS_LONGA;
        }

        System.out.printf("O preço da passagem é R$%.2f%n", precoPassagem);

        scanner.close();
    }
}
