import java.util.Scanner;

/*
Crie um programa que leia o nome completo de uma pessoa e mostre o nome com todas as letras maiúsculas, com todas as minúsculas, quantas letras ao todo (sem contar os espaços) e quantas letras tem o primeiro nome.
 */
public class ex022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String nomeMaiusculo = nomeCompleto.toUpperCase();
        System.out.println("Nome com todas as letras maiúsculas: " + nomeMaiusculo);

        String nomeMinusculo = nomeCompleto.toLowerCase();
        System.out.println("Nome com todas as letras minúsculas: " + nomeMinusculo);

        int quantidadeLetras = nomeCompleto.replaceAll(" ", "").length();
        System.out.println("Quantidade de letras ao todo (sem contar os espaços): " + quantidadeLetras);

        int posicaoEspaco = nomeCompleto.indexOf(" ");
        String primeiroNome = nomeCompleto.substring(0, posicaoEspaco);
        int quantidadeLetrasPrimeiroNome = primeiroNome.length();
        System.out.println("Quantidade de letras no primeiro nome: " + quantidadeLetrasPrimeiroNome);

        scanner.close();
    }
}
