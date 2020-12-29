package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicPerson;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List<Person> personList = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int qtt = ler.nextInt();
		ler.nextLine();
		
		for(int i = 0; i < qtt; i++) {
			System.out.printf("\nTax payer #%d data: \n", i + 1);
			
			System.out.print("Individual or company (i/c)? ");
			char type = ler.next().charAt(0);
			ler.nextLine();
			
			System.out.print("Name: ");
			String name = ler.nextLine();
			
			System.out.print("Annual income: ");
			double annualIncome = ler.nextDouble();
			
			if (type == 'i' || type == 'I') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = ler.nextDouble();
				
				Person per = new PhysicPerson(name, annualIncome, healthExpenditures);
				personList.add(per);
			}
			else {
				System.out.print("Number of employees: ");
				int employees = ler.nextInt();
				
				Person per = new LegalPerson(name, annualIncome, employees);
				personList.add(per);
			}
		}
		
		double sum = 0.0;
		System.out.println("\nTAXES PAID:");
		for(Person p : personList) {
			System.out.print(p.getName() + ": $ " + String.format("%.2f", p.taxes()) + "\n");
			sum += p.taxes();
		}
		
		System.out.print("\nTOTAL TAXES: $" + String.format("%.2f", sum));
		
		
		ler.close();
		
	}

}
