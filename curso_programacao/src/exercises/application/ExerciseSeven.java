package exercises.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of lines and columns: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int indexLine = 0; indexLine < n; indexLine++) {
            for (int indexColumn = 0; indexColumn < n; indexColumn++) {
                matriz[indexLine][indexColumn] = sc.nextInt();
            }
        }

        System.out.print("Main diagonal: ");
        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < n; index++) {
            list.add(matriz[index][index]);
        }

        System.out.println(list);
        System.out.println();

        System.out.print("Negative numbers: ");
        List<Integer> negativeList = new ArrayList<>();

        for (int indexLine = 0; indexLine < n; indexLine++) {
            for (int indexColumn = 0; indexColumn < n; indexColumn++) {
                if (matriz[indexLine][indexColumn] < 0)
                    negativeList.add(matriz[indexLine][indexColumn]);
            }
        }

        System.out.println(negativeList);
        System.out.println();

        sc.close();
    }
}
