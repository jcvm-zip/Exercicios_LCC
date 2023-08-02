import java.util.Random;
import java.util.Scanner;

/*
Crie um programa que faça o computador jogar Jokenpô com você.
 */
public class ex045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao Jokenpô! Escolha uma opção:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        int escolhaUsuario = scanner.nextInt();

        if (escolhaUsuario < 1 || escolhaUsuario > 3) {
            System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
        } else {
            int escolhaComputador = random.nextInt(3) + 1;
            String resultado = jogar(escolhaUsuario, escolhaComputador);
            System.out.println(resultado);
        }

        scanner.close();
    }

    public static String jogar(int escolhaUsuario, int escolhaComputador) {
        if (escolhaUsuario == escolhaComputador) {
            return "Empate! Ambos escolheram a mesma opção.";
        } else if ((escolhaUsuario == 1 && escolhaComputador == 3)
                || (escolhaUsuario == 2 && escolhaComputador == 1)
                || (escolhaUsuario == 3 && escolhaComputador == 2)) {
            return "Você venceu! Parabéns!";
        } else {
            return "Você perdeu! O computador venceu!";
        }
    }
}
