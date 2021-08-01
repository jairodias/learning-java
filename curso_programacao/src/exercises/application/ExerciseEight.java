package exercises.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of lines: ");
        int lines = sc.nextInt();

        System.out.println();

        System.out.print("Number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[lines][columns];

        for (int indexLine = 0; indexLine < lines; indexLine++) {
            for (int indexColumn = 0; indexColumn < columns; indexColumn++) {
                System.out.printf("Enter number of matrix, position: [%d], [%d] %n", indexLine, indexColumn);

                matrix[indexLine][indexColumn] = sc.nextInt();
            }
        }

        System.out.println("Search number in matrix: ");
        int number = sc.nextInt();

        for (int indexLine = 0; indexLine < lines; indexLine++) {
            for (int indexColumn = 0; indexColumn < columns; indexColumn++) {
                if (matrix[indexLine][indexColumn] == number) {

                    columns = columns - 1; // reset
                    lines = lines - 1; // reset

                    System.out.println();
                    System.out.printf("Position %d, %d%n", indexLine, indexColumn);

                    if (indexColumn != 0) {
                        Integer left = matrix[indexLine][indexColumn - 1];
                        System.out.printf("Left: %d%n", left);
                    }

                    if (indexColumn < columns) {
                        Integer right = matrix[indexLine][indexColumn + 1];
                        System.out.printf("Right: %d%n", right);
                    }

                    if (indexLine != 0) {
                        Integer up = matrix[indexLine - 1][indexColumn];
                        System.out.printf("Up: %d%n", up);
                    }

                    if (indexLine != lines) {
                        Integer down = matrix[indexLine + 1][indexColumn];
                        System.out.printf("Down: %d%n", down);
                    }

                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
