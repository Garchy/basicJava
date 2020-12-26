package exercB;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.printf("Name: ");
		employee.name = ler.nextLine();
		
		System.out.printf("Gross Salary: ");
		employee.grossSalary = ler.nextDouble();
		
		System.out.printf("Tax: ");
		employee.tax = ler.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.print("\nWhich percentage to increase salary? ");
		employee.increaseSalary(ler.nextDouble());
		
		System.out.printf("\nUpdate data: " + employee);		
		
		ler.close();
	}

}
