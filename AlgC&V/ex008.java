import java.util.Scanner;

/*
Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.
 */
public class ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println(metros + " metros equivalem a:");
        System.out.println(centimetros + " centímetros");
        System.out.println(milimetros + " milímetros");

        sc.close();
    }
}
