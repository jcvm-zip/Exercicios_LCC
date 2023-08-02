import java.util.Scanner;

/*
Faça um programa que leia o nome completo de uma pessoa, mostrando em seguida o primeiro e o último nome separadamente.
 */
public class ex027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine().trim();

        int posicaoPrimeiroEspaco = nomeCompleto.indexOf(' ');

        String primeiroNome = nomeCompleto.substring(0, posicaoPrimeiroEspaco);

        String ultimoNome = nomeCompleto.substring(nomeCompleto.lastIndexOf(' ') + 1);

        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Último nome: " + ultimoNome);

        scanner.close();
    }
}
