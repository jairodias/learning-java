package exercises.application;

import java.util.Locale;
import java.util.Scanner;

import exercises.entities.Account;

public class ExerciseFive {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner income = new Scanner(System.in);
        Account account;
        char choosedOptionBalance = 's';

        System.out.println("Welcome to bank!");

        System.out.print("Enter the customer name: ");
        String customerName = income.nextLine();

        System.out.println("Do you have a starting balance? (S/N) ");
        choosedOptionBalance = income.next().charAt(0);

        if (choosedOptionBalance == 's' || choosedOptionBalance == 'S') {

            System.out.print("Enter the value of deposit: ");

            double balance = income.nextDouble();
            account = new Account(customerName, balance);

        } else {
            account = new Account(customerName);
        }

        System.out.printf("Welcome to bank %s%nAccount Number: %s%n", customerName, account.getAccountNumber());

        System.out.println("Do you want to make a deposit? (S/N)");
        char choosedOptionDeposit = income.next().charAt(0);

        deposit(income, account, choosedOptionDeposit);

        System.out.println("Do you want to make a withdrawal? (S/N)");
        char choosedOptionWitdrawal = income.next().charAt(0);

        withdrawal(income, account, choosedOptionWitdrawal);

        income.close();
    }

    private static void withdrawal(Scanner income, Account account, char choosedOptionWitdrawal) {
        if (choosedOptionWitdrawal == 's' || choosedOptionWitdrawal == 'S') {
            System.out.println("What the value? ");
            double value = income.nextDouble();

            account.withdrawal(value);
        }
    }

    private static void deposit(Scanner income, Account account, char choosedOptionDeposit) {
        if (choosedOptionDeposit == 's' || choosedOptionDeposit == 'S') {
            System.out.print("What the value? ");
            double value = income.nextDouble();

            account.deposit(value);
        }
    }
}