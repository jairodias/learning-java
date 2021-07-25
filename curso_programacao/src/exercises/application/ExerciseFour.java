package exercises.application;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseFour {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner income = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = income.nextDouble();

        System.out.printf("Circumference: %.2f%n", circumference(radius));
        System.out.printf("Volume: %.2f%n", volume(radius));
        System.out.printf("PI value: %.2f%n", PI);
        income.close();
    }

    public static double circumference(double radius) {
        return 2.0 * PI / radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
