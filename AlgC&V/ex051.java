import java.util.Scanner;

/*
Desenvolva um programa que leia o primeiro termo e a razão de uma PA. No final, mostre os 10 primeiros termos dessa progressão.
 */
public class ex051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = scanner.nextInt();

        System.out.print("Digite a razão da PA: ");
        int razao = scanner.nextInt();

        System.out.println("Os 10 primeiros termos da PA são:");

        for (int i = 0; i < 10; i++) {
            int termo = primeiroTermo + (i * razao);
            System.out.print(termo + " ");
        }

        scanner.close();
    }
}
