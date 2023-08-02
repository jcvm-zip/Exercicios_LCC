import java.util.Scanner;

/*
Escreva um programa para aprovar o empréstimo bancário para a compra de uma casa. Pergunte o valor da casa, o salário do comprador e em quantos anos ele vai pagar. A prestação mensal não pode exceder 30% do salário ou então o empréstimo será negado.
 */
public class ex036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da casa: R$");
        double valorCasa = scanner.nextDouble();

        System.out.print("Digite o salário do comprador: R$");
        double salarioComprador = scanner.nextDouble();

        System.out.print("Digite o prazo de pagamento (em anos): ");
        int prazoPagamentoAnos = scanner.nextInt();

        int prazoPagamentoMeses = prazoPagamentoAnos * 12;
        double prestacaoMensal = valorCasa / prazoPagamentoMeses;

        double limitePrestacao = salarioComprador * 0.30;

        if (prestacaoMensal <= limitePrestacao) {
            System.out.println("Empréstimo APROVADO!");
            System.out.printf("Valor da prestação mensal: R$%.2f%n", prestacaoMensal);
        } else {
            System.out.println("Empréstimo NEGADO! A prestação excede 30% do salário.");
            System.out.printf("Limite máximo de prestação: R$%.2f%n", limitePrestacao);
        }

        scanner.close();
    }
}
