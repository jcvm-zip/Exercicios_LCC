/*
Faça um programa que calcule a soma entre todos os números que são múltiplos de três e que se encontram no intervalo de 1 até 500.
 */
public class ex048 {
    public static void main(String[] args) {
        int limiteSuperior = 500;
        int soma = 0;

        for (int i = 1; i <= limiteSuperior; i++) {
            if (i % 3 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos múltiplos de três entre 1 e " + limiteSuperior + " é: " + soma);
    }
}
