package Pagina01;

import java.util.Scanner;

public class Desafio1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double PI = 3.14159;
        double raio = sc.nextDouble(); 
        double area = PI * (raio * raio);
        
        System.out.printf("A= %.4f%n", area);
                
        sc.close();
    }
}
