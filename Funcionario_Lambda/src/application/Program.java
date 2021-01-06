package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);		
		
		
		System.out.print("Enter full file path: ");
		String filePath = ler.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
			System.out.print("Enter salary: ");
			double enterSalary = ler.nextDouble();
			
			List<Employee> emploList = new ArrayList<>();
			
			String line = br.readLine();			
			while (line != null) {
				String[] vect = line.split(",");
				emploList.add(new Employee(vect[0], vect[1], Double.parseDouble(vect[2])));
				line = br.readLine();
			}
			
			List<String> email = emploList.stream()
					.filter(e -> e.getSalary() > enterSalary)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("\nEmail of people whose salary is more than " + String.format("%.2f", enterSalary) + ":");
			email.forEach(System.out::println);
			
			Double sum = emploList.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("\nSum of salary of people whose name stats with 'M': " + String.format("%.2f", sum));
			
		}		
		catch (IOException o) {
			o.getStackTrace();
		}
		
		ler.close();
	}

}
