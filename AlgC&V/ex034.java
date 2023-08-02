import java.util.Scanner;

/*
Escreva um programa que pergunte o salário de um funcionário e calcule o valor do seu aumento. Para salários superiores a R$1250,00, calcule um aumento de 10%. Para os inferiores ou iguais, o aumento é de 15%.
 */
public class ex034 {
    public static void main(String[] args) {
        final double LIMITE_SALARIO = 1250.00;
        final double AUMENTO_SUPERIOR_LIMITE = 0.10;
        final double AUMENTO_INFERIOR_LIMITE = 0.15;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$");
        double salario = scanner.nextDouble();

        double aumento;

        if (salario > LIMITE_SALARIO) {
            aumento = salario * AUMENTO_SUPERIOR_LIMITE;
        } else {
            aumento = salario * AUMENTO_INFERIOR_LIMITE;
        }

        double novoSalario = salario + aumento;

        System.out.printf("O aumento salarial é de R$%.2f%n", aumento);
        System.out.printf("Novo salário: R$%.2f%n", novoSalario);

        scanner.close();
    }
}
