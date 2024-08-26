package Pagina01;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1005 {
	
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        
        double pesoA = 3.5;
        double pesoB = 7.5;
        
        double media = (notaA * pesoA + notaB * pesoB) / (pesoA + pesoB);
       
        System.out.printf("MEDIA = %.5f%n", media);
        
        sc.close(); 
    }
}
