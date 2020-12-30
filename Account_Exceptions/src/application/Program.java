package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.Domain_Exception;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Enter account data");		
		
		System.out.print("Number: ");
		int number = ler.nextInt();
		ler.nextLine();
		
		System.out.print("Holder: ");
		String name = ler.nextLine();
		
		System.out.print("Initial Balance: ");
		Double initialBalance = ler.nextDouble();
		
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = ler.nextDouble();
					
		System.out.print("\nEnter amount for withdraw: ");
		double amount = ler.nextDouble();
		
		Account acc = new Account(number, name, initialBalance, withdrawLimit);
		
		try {	
			acc.withdraw(amount);			
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		}	
		
		catch (Domain_Exception e) {
			System.out.println("Withdraw Error: " + e.getMessage());
		}
		
		catch (RuntimeException e) {
			System.out.println("Unexpected Error!");
		}
		
		ler.close();		
	}
}
