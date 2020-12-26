package bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Client client;
		
		System.out.print("Enter account number: ");
		int accountNumber = ler.nextInt();	
		ler.nextLine();		
		
		System.out.print("Enter account holder: ");
		String name = ler.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n): ");
		char resp = ler.next().charAt(0);
		
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = ler.nextDouble();
			client = new Client(accountNumber, name, initialDeposit);
			System.out.println(client);
		}
		else {
			client = new Client(accountNumber, name);
			System.out.println(client);
		}
		
		System.out.print("\nEnter a deposit value: ");
		client.deposit(ler.nextDouble());
		System.out.printf("\nUpdate account data:" + client);
		
		System.out.print("\n\nEnter a withdraw value: ");
		client.withdraw(ler.nextDouble());
		System.out.printf("\nUpdate account data:" + client);		
		
		ler.close();

	}

}
