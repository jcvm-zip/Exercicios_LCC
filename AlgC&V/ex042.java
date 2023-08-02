import java.util.Scanner;

/*
Refaça o DESAFIO 035 dos triângulos, acrescentando o recurso de mostrar que tipo de triângulo será formado:
- EQUILÁTERO: todos os lados iguais
- ISÓSCELES: dois lados iguais, um diferente
- ESCALENO: todos os lados diferentes
 */
public class ex042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        if (ehTriangulo(lado1, lado2, lado3)) {
            String tipoTriangulo = determinarTipoTriangulo(lado1, lado2, lado3);
            System.out.println("É possível formar um triângulo do tipo: " + tipoTriangulo);
        } else {
            System.out.println("Não é possível formar um triângulo com esses lados.");
        }

        scanner.close();
    }

    public static boolean ehTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public static String determinarTipoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado1 == lado3) {
            return "EQUILÁTERO";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "ISÓSCELES";
        } else {
            return "ESCALENO";
        }
    }
}
