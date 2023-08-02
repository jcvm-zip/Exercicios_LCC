import java.util.Scanner;

/*
Faça um programa que leia um ano qualquer e mostre se ele é bissexto.
 */
public class ex032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        boolean bissexto = false;

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            bissexto = true;
        }

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " NÃO é um ano bissexto.");
        }

        scanner.close();
    }
}
