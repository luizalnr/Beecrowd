package Pagina01;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1010 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int id1 = scanner.nextInt();    // código da peça 1 
        int quant1 = scanner.nextInt(); // número de peças 1
        double value1 = scanner.nextDouble(); // valor de cada peça 1

        int id2 = scanner.nextInt();    // código da peça 2 
        int quant2 = scanner.nextInt(); // número de peças 2
        double value2 = scanner.nextDouble(); // valor de cada peça 2

        double finalPurchase = calculateValue(quant1, value1, quant2, value2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", finalPurchase);

        scanner.close();
    }

    // Método simplificado para calcular o valor total a pagar
    public static double calculateValue(int quant1, double value1, int quant2, double value2) {
        return quant1 * value1 + quant2 * value2;
    }
}
