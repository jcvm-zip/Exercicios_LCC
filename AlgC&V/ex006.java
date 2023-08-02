import java.util.Scanner;

/*
Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.
 */
public class ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor: ");
        int num = sc.nextInt();

        System.out.println("Dobro: "+(num*2));
        System.out.println("triplo: "+(num*3));
        System.out.println("Raiz Quadrada: "+(Math.sqrt(num)));
    }
}
