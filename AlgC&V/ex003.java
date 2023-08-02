import java.util.Scanner;

/*
Crie um programa que leia dois números e mostre a soma entre eles.
 */
public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int valor1 = sc.nextInt();

        System.out.println("Valor 2: ");
        int valor2 = sc.nextInt();

        System.out.println(valor1 + " + " + valor2 + " = " + (valor1+valor2));
    }
}
