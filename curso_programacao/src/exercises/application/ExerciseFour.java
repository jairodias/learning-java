package exercises.application;

import java.util.Locale;
import java.util.Scanner;

import exercises.util.Calculator;

public class ExerciseFour {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner income = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = income.nextDouble();

        System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        income.close();
    }
}
