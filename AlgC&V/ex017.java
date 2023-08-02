import java.util.Scanner;

/*
Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente de um triângulo retângulo, calcule e mostre o comprimento da hipotenusa.
 */
public class ex017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do cateto oposto: ");
        double catetoOposto = scanner.nextDouble();

        System.out.print("Digite o comprimento do cateto adjacente: ");
        double catetoAdjacente = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));

        System.out.println("O comprimento da hipotenusa é: " + hipotenusa);

        scanner.close();
    }
}
