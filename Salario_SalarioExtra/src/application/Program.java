package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = ler.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = ler.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = ler.nextLine();
		
		System.out.print("Base Salary: ");
		Double baseSalary = ler.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("\nHow many contracts to this worker? ");
		int qtt = ler.nextInt();
		
		for (int i = 0; i < qtt; i++) {
			System.out.printf("\nEnter contract #%d data: ", i + 1);
			System.out.print("\nDate (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(ler.next());
			
			System.out.print("Value per hour: ");
			double valuePerHour = ler.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = ler.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		String monthYear = ler.next();
		int month = Integer.parseInt(monthYear.substring(0, 2));
		int year = Integer.parseInt(monthYear.substring(3));		
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income: " + String.format("%.2f", worker.income(year, month)));
		
		ler.close();
	}

}
