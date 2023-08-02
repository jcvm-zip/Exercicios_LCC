import java.util.Scanner;

/*
Faça um programa que leia um número de 0 a 9999 e mostre na tela cada um dos dígitos separados.
 */
public class ex023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 0 a 9999: ");
        int numero = scanner.nextInt();

        int unidade = numero % 10;
        int dezena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;
        int milhar = (numero / 1000) % 10;

        System.out.println("Unidade: " + unidade);
        System.out.println("Dezena: " + dezena);
        System.out.println("Centena: " + centena);
        System.out.println("Milhar: " + milhar);

        scanner.close();
    }
}
