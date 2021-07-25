package exercises.application;

import java.util.Locale;
import java.util.Scanner;

import exercises.entities.Student;

public class ExerciseTrhee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner income = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Student grade entry:");
        System.out.println("Student name:");
        student.name = income.nextLine();
        System.out.println();

        System.out.println("First note:");
        student.firstNote = income.nextDouble();
        System.out.println();

        System.out.println("Second note:");
        student.secondNote = income.nextDouble();
        System.out.println();

        System.out.println("Second note:");
        student.thirdNote = income.nextDouble();
        System.out.println();

        if (student.approvedStudent())
            approved(student);
        else
            disapproved(student);

        income.close();
    }

    public static void disapproved(Student student) {
        System.out.println();
        System.out.printf("Unfortunately %s fails", student.name);

        System.out.println();
        System.out.printf("Missing %.2f points", student.missingScore());

        System.out.println();
        System.out.print("Situation FAILED");
    }

    public static void approved(Student student) {
        System.out.println();
        System.out.printf("Congratulations %s it's approved", student.name);

        System.out.println();
        System.out.printf("Final Score: %.2f", student.sumScore());
    }
}
