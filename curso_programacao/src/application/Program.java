package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner income = new Scanner(System.in);
		
		Triangle triangleOne, triangleTwo;
		
		triangleOne = new Triangle();
		triangleTwo = new Triangle();
		
		triangleOne.a = income.nextDouble();
		triangleOne.b = income.nextDouble();
		triangleOne.c = income.nextDouble();
		
		double areaTriangleOne = triangleOne.area();
		
		System.out.printf("Triangle one: %.4f%n", areaTriangleOne);
		
		triangleTwo.a = income.nextDouble();
		triangleTwo.b = income.nextDouble();
		triangleTwo.c = income.nextDouble();
		
		double areaTriangleTwo = triangleTwo.area();
		
		System.out.printf("Triangle two: %.4f%n", areaTriangleTwo);
		
		income.close();
	}
}
