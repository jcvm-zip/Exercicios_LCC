import java.util.Scanner;

/*
Escreva um programa que converta uma temperatura digitando em graus Celsius e converta para graus Fahrenheit.
 */
public class ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit + " °F");

        sc.close();
    }
}

