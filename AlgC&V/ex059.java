import java.util.Scanner;

/*
Crie um programa que leia dois valores e mostre um menu na tela:
[ 1 ] somar
[ 2 ] multiplicar
[ 3 ] maior
[ 4 ] novos números
[ 5 ] sair do programa
 */
public class ex059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1, valor2;
        int opcao;

        do {
            System.out.print("Digite o primeiro valor: ");
            valor1 = scanner.nextInt();

            System.out.print("Digite o segundo valor: ");
            valor2 = scanner.nextInt();

            System.out.println("\nMENU DE OPÇÕES:");
            System.out.println("[ 1 ] Somar");
            System.out.println("[ 2 ] Multiplicar");
            System.out.println("[ 3 ] Maior valor");
            System.out.println("[ 4 ] Novos números");
            System.out.println("[ 5 ] Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int soma = valor1 + valor2;
                    System.out.println("A soma dos valores é: " + soma);
                    break;
                case 2:
                    int multiplicacao = valor1 * valor2;
                    System.out.println("A multiplicação dos valores é: " + multiplicacao);
                    break;
                case 3:
                    int maior = valor1 > valor2 ? valor1 : valor2;
                    System.out.println("O maior valor é: " + maior);
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
