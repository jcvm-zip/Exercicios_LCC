import java.util.Scanner;

/*
Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento.
 */
public class ex013 {
    public static void main(String[] args) {
        final double AUMENTO_PERCENTUAL = 15.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$");
        double salarioAtual = sc.nextDouble();

        double aumento = salarioAtual * (AUMENTO_PERCENTUAL / 100.0);
        double novoSalario = salarioAtual + aumento;

        System.out.printf("O novo salário com 15%% de aumento é: R$%.2f\n", novoSalario);

        sc.close();
    }
}
