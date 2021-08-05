package curso_programacao.inicio;

import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		Scanner income = new Scanner(System.in);

		System.out.print("Digite os tr�s n�meros para avalia��o: ");
		double numberOne = income.nextDouble();
		double numberTwo = income.nextDouble();
		double numberThree = income.nextDouble();

		double higher = max(numberOne, numberTwo, numberThree);

		show(higher);

		income.close();
	}

	public static double max(double numberOne, double numberTwo, double numberThree) {
		if (numberOne > numberTwo && numberOne > numberThree)
			return numberOne;
		else if (numberTwo > numberOne && numberTwo > numberThree)
			return numberTwo;
		else
			return numberThree;
	}

	public static void show(double higher) {
		System.out.print("O maior n�mero digitado: " + higher);
	}
}
