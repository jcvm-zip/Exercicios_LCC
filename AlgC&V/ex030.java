import java.util.Scanner;

/*
Crie um programa que leia um número inteiro e mostre na tela se ele é PAR ou ÍMPAR.
 */
public class ex030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        scanner.close();
    }
}
