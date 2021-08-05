package exercises.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercises.entities.Department;
import exercises.entities.HourContract;
import exercises.entities.Worker;
import exercises.entities.enums.WorkerLevel;

public class ExerciseNine {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament's name: ");
        String departmentName = sc.nextLine();

        System.out.print("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
                new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int numberOfContracts = sc.nextInt();

        for (int index = 1; index <= numberOfContracts; index++) {
            System.out.printf("Enter contract #%d data: %n", index);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = simpleDateFormat.parse(sc.next());

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);

            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year income (MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.printf("Name: %s%n", worker.getName());
        System.out.printf("Department: %s%n", worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f%n", monthAndYear, worker.income(year, month));

        sc.close();
    }
}
