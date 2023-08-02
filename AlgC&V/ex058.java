import java.util.Random;
import java.util.Scanner;

/*
Melhore o jogo do DESAFIO 028 onde o computador vai "pensar" em um número entre 0 e 10. Só que agora o jogador vai tentar adivinhar até acertar, mostrando no final quantos palpites foram necessários para vencer.
 */
public class ex058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroPensado = random.nextInt(11);
        int palpite;
        int tentativas = 0;

        System.out.println("Jogo da Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 10.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroPensado) {
                System.out.println("Parabéns! Você acertou o número " + numeroPensado + ".");
            } else if (palpite < numeroPensado) {
                System.out.println("Tente novamente. O número pensado é maior.");
            } else {
                System.out.println("Tente novamente. O número pensado é menor.");
            }

        } while (palpite != numeroPensado);

        System.out.println("Você acertou após " + tentativas + " tentativas.");

        scanner.close();
    }
}
