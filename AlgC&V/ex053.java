import java.util.Scanner;

/*
Crie um programa que leia uma frase qualquer e diga se ela é um palíndromo, desconsiderando os espaços.
 */
public class ex053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        boolean palindromo = verificarPalindromo(frase);

        if (palindromo) {
            System.out.println("A frase é um palíndromo.");
        } else {
            System.out.println("A frase não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean verificarPalindromo(String frase) {
        frase = frase.replace(" ", "").toLowerCase();

        int i = 0;
        int j = frase.length() - 1;

        while (i < j) {
            if (frase.charAt(i) != frase.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
