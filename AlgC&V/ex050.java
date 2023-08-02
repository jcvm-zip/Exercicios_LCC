import java.util.Scanner;

/*
Desenvolva um programa que leia seis números inteiros e mostre a soma apenas daqueles que forem pares. Se o valor digitado for ímpar, desconsidere-o.
*/
public class ex050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros = 6;
        int soma = 0;

        System.out.println("Digite " + quantidadeNumeros + " números inteiros:");

        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                soma += numero;
            }
        }

        System.out.println("A soma dos números pares é: " + soma);

        scanner.close();
    }
}
