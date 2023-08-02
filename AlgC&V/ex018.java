import java.util.Scanner;

/*
Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo.
 */
public class ex018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do ângulo em graus: ");
        double angulo = scanner.nextDouble();

        double anguloRadianos = Math.toRadians(angulo);

        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);

        System.out.println("Seno do ângulo: " + seno);
        System.out.println("Cosseno do ângulo: " + cosseno);
        System.out.println("Tangente do ângulo: " + tangente);

        scanner.close();
    }
}
