import java.util.Scanner;

/*
Escreva um programa em Python que leia um número inteiro qualquer e peça para o usuário escolher qual será a base de conversão: 1 para binário, 2 para octal e 3 para hexadecimal.
 */
public class ex037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Escolha a base de conversão:");
        System.out.println("1 - Binário");
        System.out.println("2 - Octal");
        System.out.println("3 - Hexadecimal");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            String resultado = decimalParaBinario(numero);
            System.out.println(numero + " em binário é: " + resultado);
        } else if (opcao == 2) {
            String resultado = decimalParaOctal(numero);
            System.out.println(numero + " em octal é: " + resultado);
        } else if (opcao == 3) {
            String resultado = decimalParaHexadecimal(numero);
            System.out.println(numero + " em hexadecimal é: " + resultado);
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
        }

        scanner.close();
    }

    public static String decimalParaBinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    public static String decimalParaOctal(int numero) {
        return Integer.toOctalString(numero);
    }

    public static String decimalParaHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }
}
