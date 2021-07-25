package curso_programacao;

import java.util.Scanner;

public class For 
{
	public static void main(String[] args)
	{
		Scanner income = new Scanner(System.in);
		
		int number = income.nextInt();
		
		for (int i=0; i <= number; i++) {
			System.out.println("index: " + i);
		}
		
		income.close();
	}
}
