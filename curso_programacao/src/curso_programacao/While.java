package curso_programacao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner income = new Scanner(System.in);
		
		int valorDigitado;
		double soma = 0;
		
		valorDigitado = income.nextInt();
		soma += valorDigitado;
		
		while(valorDigitado != 0) {
			valorDigitado = income.nextInt();
			soma += valorDigitado;
			
		}
		
		System.out.print("Soma dos valores digitados: " + soma);
		
		income.close();
	}

}
