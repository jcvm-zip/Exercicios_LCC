import java.util.Scanner;

/*
Faça um programa que leia a largura e a altura de uma parede em metros, calcule a sua área e a quantidade de tinta necessária para pinta-la, sabendo que cada litro de tinta, pinta uma área de 2 m².
 */
public class ex011 {
    public static void main(String[] args) {
        final int AREA_POR_LITRO_TINTA = 2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura da parede em metros: ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura da parede em metros: ");
        double altura = sc.nextDouble();

        double areaParede = largura * altura;
        double quantidadeTintaLitros = areaParede / AREA_POR_LITRO_TINTA;

        System.out.println("Área da parede: " + areaParede + " m²");
        System.out.println("Quantidade de tinta necessária: " + quantidadeTintaLitros + " litros");

        sc.close();
    }
}
