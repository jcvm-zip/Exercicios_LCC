/*
Faça um programa que mostre na tela uma contagem regressiva para o estouro de fogos de artifício, indo de 10 até 0, com uma pausa de 1 segundo entre eles.
 */
public class ex046 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Contagem regressiva para o estouro de fogos de artifício:");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("BOOM! Feliz Ano Novo!");
    }
}
