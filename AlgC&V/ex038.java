import java.util.Scanner;

/*
Escreva um programa que leia dois números inteiros e compare-os. mostrando na tela uma mensagem:
- O primeiro valor é maior
- O segundo valor é maior
- Não existe valor maior, os dois são iguais
 */
public class ex038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro valor é maior.");
        } else if (numero2 > numero1) {
            System.out.println("O segundo valor é maior.");
        } else {
            System.out.println("Não existe valor maior, os dois são iguais.");
        }

        scanner.close();
    }
}
