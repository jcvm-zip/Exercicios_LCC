import java.util.Scanner;

/*
Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas.
 */
public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Seja bem vindo, "+nome);
    }
}
