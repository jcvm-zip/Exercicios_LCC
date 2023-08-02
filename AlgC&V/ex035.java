import java.util.Scanner;

/*
Desenvolva um programa que leia o comprimento de três retas e diga ao usuário se elas podem ou não formar um triângulo.
*/
public class ex035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento das três retas:");
        System.out.print("Reta 1: ");
        double reta1 = scanner.nextDouble();

        System.out.print("Reta 2: ");
        double reta2 = scanner.nextDouble();

        System.out.print("Reta 3: ");
        double reta3 = scanner.nextDouble();

        if (verificarTriangulo(reta1, reta2, reta3)) {
            System.out.println("As retas podem formar um triângulo.");
        } else {
            System.out.println("As retas NÃO podem formar um triângulo.");
        }

        scanner.close();
    }

    public static boolean verificarTriangulo(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
