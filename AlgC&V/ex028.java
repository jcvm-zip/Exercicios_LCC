import java.util.Random;
import java.util.Scanner;

/*
Escreva um programa que faça o computador "pensar" em um número inteiro entre 0 e 5 e peça para o usuário tentar descobrir qual foi o número escolhido pelo computador. O programa deverá escrever na tela se o usuário venceu ou perdeu.
 */
public class ex028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroComputador = random.nextInt(6); // Números gerados de 0 a 5
        System.out.print("Tente adivinhar o número que estou pensando (0 a 5): ");
        int numeroUsuario = scanner.nextInt();

        if (numeroUsuario >= 0 && numeroUsuario <= 5) {
            if (numeroUsuario == numeroComputador) {
                System.out.println("Parabéns! Você acertou o número.");
            } else {
                System.out.println("Que pena! O número que eu estava pensando era: " + numeroComputador);
            }
        } else {
            System.out.println("Número inválido. Por favor, tente novamente com um número de 0 a 5.");
        }

        scanner.close();
    }
}
