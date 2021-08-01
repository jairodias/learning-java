package exercises.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercises.entities.Employee;

public class ExerciseSix {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int quantity = sc.nextInt();

        for (int index = 1; index <= quantity; index++) {
            System.out.println("Employee #" + index);

            System.out.print("Id: ");
            int id = sc.nextInt();

            while (hasId(employees, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            String name = sc.next();

            System.out.println("Salary: ");
            double grossSalary = sc.nextDouble();

            employees.add(new Employee(id, name, grossSalary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        if (!hasId(employees, id)) {
            System.out.println("This id does not exist!");
        } else {
            Employee employee = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");

        for (var employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }

    private static Boolean hasId(List<Employee> employees, int id) {
        Employee employee = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        return employee != null;
    }
}
