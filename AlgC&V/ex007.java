import java.util.Scanner;

/*
Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.
 */
public class ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = sc.nextInt();

        System.out.println("Nota 2: ");
        double nota2 = sc.nextInt();

        System.out.println("Média: "+(nota1+nota2)/2);
    }
}
