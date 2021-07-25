package exercises.application;

import java.util.Locale;
import java.util.Scanner;

import exercises.entities.Rectangle;

public class ExerciseOne {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner income = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter width and height of rectangle: ");
        rectangle.width = income.nextDouble();
        rectangle.height = income.nextDouble();

        System.out.printf("Area of rectangle: %.2f", rectangle.area());
        System.out.println();

        System.out.printf("Perimeter of rectangle: %.2f", rectangle.perimeter());
        System.out.println();

        System.out.printf("Diagonal of rectangle: %.2f", rectangle.diagonal());
        System.out.println();

        income.close();
    }
}