package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Set<Student> stuCod = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int courA = ler.nextInt();
		
		for(int i = 0; i < courA; i++) {
			System.out.printf("#%d: ", i + 1);
			stuCod.add(new Student(ler.nextInt()));
		}
		
		System.out.print("\nHow many students for course B? ");
		int courB = ler.nextInt();
		
		for(int i = 0; i < courB; i++) {
			System.out.printf("#%d: ", i + 1);
			stuCod.add(new Student(ler.nextInt()));
		}
		
		System.out.print("\nHow many students for course C? ");
		int courC = ler.nextInt();
		
		for(int i = 0; i < courC; i++) {
			System.out.printf("#%d: ", i + 1);
			stuCod.add(new Student(ler.nextInt()));
		}
		
		System.out.printf("Total students: " + stuCod.size());
		
		ler.close();
	}

}
