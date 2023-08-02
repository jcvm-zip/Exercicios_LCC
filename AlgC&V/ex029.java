import java.util.Scanner;

/*
 Escreva um programa que leia a velocidade de um carro. Se ele ultrapassar 80 Km/h, mostre uma mensagem dizendo que ele foi multado. A multa vai custar R$7.00 por cada Km acima do limite.
 */
public class ex029 {
    public static void main(String[] args) {
        final int LIMITE_VELOCIDADE = 80;
        final double VALOR_MULTA_POR_KM_ACIMA = 7.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro em Km/h: ");
        int velocidadeCarro = scanner.nextInt();

        if (velocidadeCarro > LIMITE_VELOCIDADE) {
            int kmAcimaLimite = velocidadeCarro - LIMITE_VELOCIDADE;
            double valorMulta = kmAcimaLimite * VALOR_MULTA_POR_KM_ACIMA;
            System.out.println("Você foi multado! O valor da multa é R$" + valorMulta);
        } else {
            System.out.println("Velocidade dentro do limite permitido. Dirija com segurança!");
        }

        scanner.close();
    }
}
