import java.util.Scanner;

/*
Faça um programa que leia o peso de cinco pessoas. No final, mostre qual foi o maior e o menor peso lidos.
 */
public class ex055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePessoas = 5;
        double maiorPeso = Double.MIN_VALUE;
        double menorPeso = Double.MAX_VALUE;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite o peso da pessoa " + i + ": ");
            double peso = scanner.nextDouble();

            if (peso > maiorPeso) {
                maiorPeso = peso;
            }

            if (peso < menorPeso) {
                menorPeso = peso;
            }
        }

        System.out.println("Maior peso lido: " + maiorPeso);
        System.out.println("Menor peso lido: " + menorPeso);

        scanner.close();
    }
}
