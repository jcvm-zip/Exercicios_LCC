import java.util.Calendar;
import java.util.Scanner;

/*
Faça um programa que leia o ano de nascimento de um jovem e informe, de acordo com a sua idade, se ele ainda vai se alistar ao serviço militar, se é a hora exata de se alistar ou se já passou do tempo do alistamento. Seu programa também deverá mostrar o tempo que falta ou que passou do prazo.
 */
public class ex039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade < 18) {
            int tempoFalta = 18 - idade;
            System.out.println("Você ainda vai se alistar ao serviço militar.");
            System.out.printf("Falta(m) %d ano(s) para o alistamento.%n", tempoFalta);
        } else if (idade == 18) {
            System.out.println("É a hora exata de se alistar ao serviço militar.");
        } else {
            int tempoPassou = idade - 18;
            System.out.println("Já passou do tempo do alistamento.");
            System.out.printf("Passou(m) %d ano(s) do prazo.%n", tempoPassou);
        }

        scanner.close();
    }
}
