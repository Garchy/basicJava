package exercC;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		Student stud = new Student();
		
		System.out.print("Name: ");
		stud.name = ler.nextLine();
		
		System.out.print("1st Grade: ");
		stud.grade1 = ler.nextDouble();
		
		System.out.print("2nd Grade: ");
		stud.grade2 = ler.nextDouble();
		
		System.out.print("3rd Grade: ");
		stud.grade3 = ler.nextDouble();
		
		stud.pass();
		
		ler.close();
	}
	

}
