import java.util.Scanner;

/*
Faça um programa que leia uma frase pelo teclado e mostre: quantas vezes aparece a letra "A", em que posição ela aparece a primeira vez, em que posição ela aparece a última vez.
 */
public class ex026{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        // Contar quantas vezes a letra "A" aparece na frase
        int contadorA = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'a') {
                contadorA++;
            }
        }

        // Encontrar a posição da primeira ocorrência da letra "A" na frase
        int posicaoPrimeiraA = frase.toLowerCase().indexOf('a');

        // Encontrar a posição da última ocorrência da letra "A" na frase
        int posicaoUltimaA = frase.toLowerCase().lastIndexOf('a');

        System.out.println("Quantidade de vezes que a letra 'A' aparece na frase: " + contadorA);
        System.out.println("Posição da primeira ocorrência da letra 'A': " + posicaoPrimeiraA);
        System.out.println("Posição da última ocorrência da letra 'A': " + posicaoUltimaA);

        sc.close();
    }
}
