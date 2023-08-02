import java.util.Scanner;

/*
Crie um programa que leia o ano de nascimento de sete pessoas. No final, mostre quantas pessoas ainda não atingiram a maioridade e quantas já são maiores.
 */
public class ex054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePessoas = 7;
        int maioridade = 18;
        int menoresDeIdade = 0;
        int maioresDeIdade = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite o ano de nascimento da pessoa " + i + ": ");
            int anoNascimento = scanner.nextInt();

            int idade = calcularIdade(anoNascimento);

            if (idade < maioridade) {
                menoresDeIdade++;
            } else {
                maioresDeIdade++;
            }
        }

        System.out.println("Pessoas menores de idade: " + menoresDeIdade);
        System.out.println("Pessoas maiores de idade: " + maioresDeIdade);

        scanner.close();
    }

    public static int calcularIdade(int anoNascimento) {
        int anoAtual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return anoAtual - anoNascimento;
    }
}
