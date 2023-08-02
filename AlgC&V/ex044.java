import java.util.Scanner;

/*
Elabore um programa que calcule o valor a ser pago por um produto, considerando o seu preço normal e condição de pagamento:
- à vista dinheiro/cheque: 10% de desconto
- à vista no cartão: 5% de desconto
- em até 2x no cartão: preço formal
- 3x ou mais no cartão: 20% de juros
 */
public class ex044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$");
        double precoProduto = scanner.nextDouble();

        System.out.println("Selecione a condição de pagamento:");
        System.out.println("1 - À vista dinheiro/cheque");
        System.out.println("2 - À vista no cartão");
        System.out.println("3 - Em até 2x no cartão");
        System.out.println("4 - 3x ou mais no cartão");

        int opcaoPagamento = scanner.nextInt();

        double valorFinal = calcularValorFinal(precoProduto, opcaoPagamento);

        System.out.printf("Valor a ser pago: R$%.2f%n", valorFinal);

        scanner.close();
    }

    public static double calcularValorFinal(double precoProduto, int opcaoPagamento) {
        switch (opcaoPagamento) {
            case 1:
                return precoProduto * 0.9;
            case 2:
                return precoProduto * 0.95;
            case 3:
                return precoProduto;
            case 4:
                return precoProduto * 1.2;
            default:
                return precoProduto;
        }
    }
}
