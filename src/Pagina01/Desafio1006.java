package Pagina01;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1006 {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
    	Scanner scanner = new Scanner(System.in);
    	
    	double notaA = scanner.nextDouble();
    	double notaB = scanner.nextDouble();
    	double notaC = scanner.nextDouble();
    	
    	double pesoA = 2;
    	double pesoB = 3;
    	double pesoC = 5;
    	
    	double media = (notaA * pesoA + 
    					notaB * pesoB + 
    					notaC * pesoC) / (pesoA + pesoB + pesoC);
    	
    	System.out.printf("MEDIA = %.1f%n", media);
    	
    	scanner.close();
    }
}
