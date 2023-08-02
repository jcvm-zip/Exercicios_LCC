import java.util.Random;
import java.util.Scanner;

/*
Um professor quer sortear um dos seus quatro alunos para apagar o quadro. Faça um programa que ajude ele, lendo o nome deles e escrevendo o nome do escolhido.
 */
public class ex019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] alunos = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = scanner.nextLine();
        }

        int indiceEscolhido = random.nextInt(4);
        String alunoEscolhido = alunos[indiceEscolhido];

        System.out.println("O aluno escolhido para apagar o quadro é: " + alunoEscolhido);

        scanner.close();
    }
}
