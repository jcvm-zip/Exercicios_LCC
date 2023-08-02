import java.util.Calendar;
import java.util.Scanner;

/*
A Confederação Nacional de Natação precisa de um programa que leia o ano de nascimento de um atleta e mostre sua categoria, de acordo com a idade:
- Até 9 anos: MIRIM
- Até 14 anos: INFANTIL
- Até 19 anos: JÚNIOR
- Até 25 anos: SÊNIOR
- Acima de 25 anos: MASTER
 */
public class ex041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Digite o ano de nascimento do atleta: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        String categoria;

        if (idade <= 9) {
            categoria = "MIRIM";
        } else if (idade <= 14) {
            categoria = "INFANTIL";
        } else if (idade <= 19) {
            categoria = "JÚNIOR";
        } else if (idade <= 25) {
            categoria = "SÊNIOR";
        } else {
            categoria = "MASTER";
        }

        System.out.println("Categoria do atleta: " + categoria);

        scanner.close();
    }
}
