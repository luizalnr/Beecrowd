package Pagina01;

import java.util.Scanner;

public class Desafio1013 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Leitura dos três valores inteiros
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		// Encontra o maior entre a e b
        int maiorAB = (a + b + Math.abs(a - b)) / 2;
		
		// Encontrando o maior entre maiorAB e c
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorABC + " eh o maior");
        
		
		scanner.close();
	}
}