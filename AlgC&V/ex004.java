import java.util.Scanner;

/*
Faça um programa que leia algo pelo teclado e mostre na tela o seu tipo primitivo e todas as informações possíveis sobre ele.
 */
public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("valor: ");
        String input = sc.nextLine();

        if (isInteger(input)) {
            int intValue = Integer.parseInt(input);
            System.out.println("Tipo primitivo: int");
            System.out.println("Valor: " + intValue);
            System.out.println("Tamanho em bytes: " + Integer.BYTES);
            System.out.println("Valor mínimo: " + Integer.MIN_VALUE);
            System.out.println("Valor máximo: " + Integer.MAX_VALUE);
        } else if (isDouble(input)) {
            double doubleValue = Double.parseDouble(input);
            System.out.println("Tipo primitivo: double");
            System.out.println("Valor: " + doubleValue);
            System.out.println("Tamanho em bytes: " + Double.BYTES);
            System.out.println("Valor mínimo: " + Double.MIN_VALUE);
            System.out.println("Valor máximo: " + Double.MAX_VALUE);
        } else if (isBoolean(input)) {
            boolean booleanValue = Boolean.parseBoolean(input);
            System.out.println("Tipo primitivo: boolean");
            System.out.println("Valor: " + booleanValue);
        } else {
            System.out.println("Tipo primitivo: String");
            System.out.println("Valor: " + input);
            System.out.println("Tamanho em bytes: " + input.getBytes().length);
        }

    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isBoolean(String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }
}
