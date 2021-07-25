package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner income = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = income.nextLine();
		
		System.out.print("Price: ");
		product.price = income.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = income.nextInt();
		
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = income.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = income.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		income.close();
	}

}
