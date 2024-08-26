package Pagina01;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1008 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int employeeID    = scanner.nextInt();    // ID do funcionário
        int hoursWorked   = scanner.nextInt();    // Horas trabalhadas
        double hourlyRate = scanner.nextDouble(); // Valor por hora

        // Calculando o salário
        double salary = calculateSalary(hoursWorked, hourlyRate);
        
        // Exibindo o resultado
        System.out.printf("NUMBER = %d%n", employeeID);
        System.out.printf("SALARY = U$ %.2f%n", salary);
        
        scanner.close();
    }

    // Função para calcular o salário
    public static double calculateSalary(int hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }
}
