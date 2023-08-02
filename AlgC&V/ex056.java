import java.util.Scanner;

/*
Desenvolva um programa que leia o nome, idade e sexo de 4 pessoas. No final do programa, mostre: a média de idade do grupo, qual é o nome do homem mais velho e quantas mulheres têm menos de 20 anos.
 */
public class ex056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePessoas = 4;
        int totalIdade = 0;
        int contadorMulheresMenos20 = 0;
        String nomeHomemMaisVelho = "";
        int idadeHomemMaisVelho = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite o nome: ");
            String nome = scanner.next();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            totalIdade += idade;

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.next();

            if (sexo.equalsIgnoreCase("F") && idade < 20) {
                contadorMulheresMenos20++;
            }

            if (sexo.equalsIgnoreCase("M") && idade > idadeHomemMaisVelho) {
                nomeHomemMaisVelho = nome;
                idadeHomemMaisVelho = idade;
            }
        }

        double mediaIdade = (double) totalIdade / quantidadePessoas;

        System.out.println("Média de idade do grupo: " + mediaIdade);
        System.out.println("Nome do homem mais velho: " + nomeHomemMaisVelho);

        if (contadorMulheresMenos20 == 0) {
            System.out.println("Nenhuma mulher com menos de 20 anos.");
        } else {
            System.out.println("Quantidade de mulheres com menos de 20 anos: " + contadorMulheresMenos20);
        }

        scanner.close();
    }
}
