package Pagina01;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		
		int diferenca = (A * B) - (C * D);
		
        System.out.printf("DIFERENCA = %d%n", diferenca);
		
		scanner.close();
	}
}