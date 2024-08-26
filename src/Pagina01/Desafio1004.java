package Pagina01;

import java.util.Scanner;

public class Desafio1004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int PROD = A * B;
				
		System.out.print("PROD = " + PROD);
		
		scanner.close();
	}

}
