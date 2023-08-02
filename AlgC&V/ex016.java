import java.util.Scanner;

/*
Crie um programa que leia um número Real qualquer pelo teclado e mostre na tela a sua porção inteira. Ex: Digite um número: 6.127. O número 6.127 tem a parte inteira 6
 */
public class ex016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numeroReal = scanner.nextDouble();

        int parteInteira = (int) numeroReal;

        System.out.println("A parte inteira do número " + numeroReal + " é: " + parteInteira);

        scanner.close();
    }
}
