package Pagina01;

import java.util.Scanner;

public class Desafio1012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores A, B, C
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double pi = 3.14159;

        //Área do triângulo retângulo que tem A por base e C por altura
        double areaTriangulo = (A * C) / 2.0;

        //Área do círculo de raio C
        double areaCirculo = pi * Math.pow(C, 3);

        //Área do trapézio que tem A e B por bases e C por altura
        double areaTrapezio = ((A + B) * C) / 2.0;

        //Área do quadrado que tem lado B
        double areaQuadrado = Math.pow(B, 2);

        //Área do retângulo que tem lados A e B
        double areaRetangulo = A * B;

        // Exibindo os resultados
        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        scanner.close();
    }
}
