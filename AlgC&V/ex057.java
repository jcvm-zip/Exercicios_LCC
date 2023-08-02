import java.util.Scanner;

/*
Faça um programa que leia o sexo de uma pessoa, mas só aceite os valores 'M' ou 'F'. Caso esteja errado, peça a digitação novamente até ter um valor correto.
 */
public class ex057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sexo;

        do {
            System.out.print("Digite o sexo (M/F): ");
            sexo = scanner.next();

            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                System.out.println("Sexo inválido! Digite 'M' para masculino ou 'F' para feminino.");
            }
        } while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"));

        System.out.println("Sexo digitado: " + sexo);

        scanner.close();
    }
}
