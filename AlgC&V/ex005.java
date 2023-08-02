import java.util.Scanner;

/*
Faça um programa que leia um número inteiro e mostre na tela o seu sucessor e seu antecessor.
 */
public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero Inteiro: ");
        int num = sc.nextInt();

        System.out.println("Antecessor: " +(num-1));
        System.out.println("Numero: " + num);
        System.out.println("Sucessor: "+ (num+1));
    }
}
