package increaseSalary;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List<Employee> emplo = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int qtt = ler.nextInt();
		ler.nextLine();
		
		for (int i = 0; i < qtt; i++) {
			System.out.printf("\nEmployee #%d:\n", i + 1);
			
			System.out.print("ID: ");
			Integer id = ler.nextInt();
			//ler.nextLine();
			
			System.out.print("Name: ");
			String name = ler.nextLine();
			
			System.out.print("Salary: ");
			Double salary = ler.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			emplo.add(emp);			
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = ler.nextInt();
		ler.nextLine();
		
		Integer pos = position(emplo, id);
		if (pos == null) {
			System.out.println("This id does not exist! ");
		}
		else {
			System.out.print("Enter the percentage: ");
			double perc = ler.nextDouble();
			emplo.get(pos).increaseSalary(perc);			
		}
		
		System.out.println("\nList of Employees: ");
		for (Employee employees : emplo) {
			System.out.println(employees);
		}
		
		ler.close();
		
	}
	
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		
		return null;
	}
	
}
