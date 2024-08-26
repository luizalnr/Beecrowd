package Pagina01;

import java.util.Scanner;

public class Desafio1003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int SOMA = A + B;
		
		System.out.print("SOMA = " + SOMA);
		
		scanner.close();
	}

}
