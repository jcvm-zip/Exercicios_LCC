import java.util.Random;
import java.util.Scanner;

/*
O mesmo professor do exercício anterior quer sortear a ordem de apresentação de trabalhos dos alunos. Faça um programa que leia o nome dos quatro alunos e mostre a ordem sorteada.

 */
public class ex020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] alunos = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = scanner.nextLine();
        }

        String[] ordemApresentacao = new String[4];
        boolean[] alunosSorteados = new boolean[4];

        for (int i = 0; i < 4; i++) {
            int indiceSorteado;
            do {
                indiceSorteado = random.nextInt(4);
            } while (alunosSorteados[indiceSorteado]);

            ordemApresentacao[i] = alunos[indiceSorteado];
            alunosSorteados[indiceSorteado] = true;
        }

        System.out.println("\nOrdem de apresentação dos trabalhos:");

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "º lugar: " + ordemApresentacao[i]);
        }

        scanner.close();
    }
}
