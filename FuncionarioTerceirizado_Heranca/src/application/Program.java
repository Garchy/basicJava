package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int qtt = ler.nextInt();
		ler.nextLine();
		
		for (int i = 0; i < qtt; i++) {
			System.out.printf("\nEmployee #%d data:\n", i + 1);
			
			System.out.print("Outsourced (y/n)? ");
			char outs = ler.next().charAt(0);
			ler.nextLine();			
			
			System.out.print("Name: ");
			String name = ler.nextLine();
			
			System.out.print("Hours: ");
			int hours = ler.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = ler.nextDouble();
	
			if (outs == 'y' || outs == 'Y') {
				System.out.print("Addiotinal charge: ");
				double additionalCharge = ler.nextDouble();
				
				Employee emp = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
				employee.add(emp);
			}
			else {			
				Employee emp = new Employee(name, hours, valuePerHour);
				employee.add(emp);
			}
		}
		
		System.out.println("\nPAYMENTS:");
		for(Employee e : employee) {
			System.out.println(e);
		}
		
		ler.close();
		
	}
}
