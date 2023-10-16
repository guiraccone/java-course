package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.println("Enter account number");
		int number = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter account holder.");
		String name = sc.nextLine();

		System.out.println("Is there an initial deposit ? (y/n)");

		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter initial deposit.");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
		} else {
			account = new Account(number, name);

		}

		System.out.println(account.toString());

		System.out.println("Enter a deposit value.");
		double amount = sc.nextDouble();
		account.deposit(amount);

		System.out.println("Updated data:");
		System.out.println(account.toString());

		System.out.println("Enter a withdraw value.");
		amount = sc.nextDouble();
		account.withdraw(amount);

		System.out.println("Updated data:");
		System.out.println(account.toString());

		sc.close();

	}

}
