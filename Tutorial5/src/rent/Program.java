package rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("\nHow many rooms will be rented? ");
		int rooms = ler.nextInt();
		ler.nextLine();
		
		Guest[] guest = new Guest[10];
		
		for (int i = 0; i < rooms; i++) {
			System.out.printf("\nRent #%d:\n", i + 1);
			
			System.out.printf("Name: ");
			String name = ler.nextLine();
			
			System.out.print("Email: ");
			String email = ler.nextLine();
			
			System.out.print("Room: ");
			int op = ler.nextInt();
			ler.nextLine();
			
			guest[op] = new Guest(name, email);
			
		}
		
		System.out.println("\nBusy rooms: ");
		for(int i = 0; i < 10; i++) {
			if(guest[i] != null) {
				System.out.println(guest[i]);
			}
		}				
		ler.close();

	}

}
