package exercises.application;

import java.util.Locale;
import java.util.Scanner;

import exercises.entities.Employee;

public class ExerciseTwo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner income = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter name employee: ");
        employee.name = income.nextLine();

        System.out.println("Enter gross salary of employee: ");
        employee.grossSalary = income.nextDouble();

        System.out.println("Enter tax inside of gross salary the employee: ");
        employee.tax = income.nextDouble();

        System.out.println("Enter wiche percentage to increase salary: ");
        double percentage = income.nextDouble();

        System.out.println();
        System.out.printf("Updated salary liquid: %.2f", employee.increaseSalary(percentage));

        income.close();
    }
}
