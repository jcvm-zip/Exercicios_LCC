import java.util.Scanner;

/*
Crie um programa que leia o nome de uma pessoa e diga se ela tem "SILVA" no nome.
 */
public class ex025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();


        boolean contemSilva = nomeCompleto.trim().toUpperCase().contains("SILVA");

        if (contemSilva) {
            System.out.println("O nome contém 'SILVA'.");
        } else {
            System.out.println("O nome NÃO contém 'SILVA'.");
        }

        scanner.close();
    }
}
