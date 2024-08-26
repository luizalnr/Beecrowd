package Pagina01;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		String vendedor = scanner.nextLine();
		double salariofixo = scanner.nextDouble();
		double totalvendas = scanner.nextDouble();
		
		double salarioFinal = comissao(salariofixo, totalvendas);
		
        System.out.printf("TOTAL = U$ %.2f%n", salarioFinal);
		
		scanner.close();
	}

	public static double comissao(double salariofixo, double totalvendas) {
		double comissao = totalvendas * .15; //Comissão (15% do total de vendas)
		return salariofixo + comissao; //Salário final
	}
}
