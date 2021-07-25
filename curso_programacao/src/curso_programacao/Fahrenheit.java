package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner income = new Scanner(System.in);
		char resp = 's';
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = income.nextDouble();
			double fahrenheit = (9.0 * celsius)/5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", fahrenheit);
			
			System.out.print("Deseja continuar?");
			
			resp = income.next().charAt(0);
			
		} while(resp != 'n');
		
		income.close();
	}
}
