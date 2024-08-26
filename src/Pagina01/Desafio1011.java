package Pagina01;

import java.util.Scanner;

public class Desafio1011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double pi = 3.14159;
		double raio = scanner.nextDouble();
		
		double result = volume(pi, raio);
		
		System.out.printf("VOLUME = %.3f", result);
		
		scanner.close();
	}
	
	//Fórmula para calcular o volume é: (4/3) * pi * R3
	public static double volume(double pi, double raio) {
		return (4.0 / 3) * pi * Math.pow(raio, 3);
	}
}