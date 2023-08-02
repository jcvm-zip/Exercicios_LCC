import java.util.Scanner;

/*
 Crie um programa que leia o nome de uma cidade e diga se ela começa ou não com o nome "SANTO".
 */
public class ex024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da cidade: ");
        String nomeCidade = scanner.nextLine();

        boolean comecaComSanto = nomeCidade.trim().toUpperCase().startsWith("SANTO");

        if (comecaComSanto) {
            System.out.println("O nome da cidade começa com 'SANTO'.");
        } else {
            System.out.println("O nome da cidade NÃO começa com 'SANTO'.");
        }

        scanner.close();
    }
}
