package exercC;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	
	public void pass () {
		if (grade1 + grade2 + grade3 > 60) {
			System.out.printf("\nFINAL GRADE = %.2f", grade1 + grade2 + grade3);
			System.out.println("\nPASS");
		}
		else {
			System.out.printf("\nFINAL GRADE = %.2f", grade1 + grade2 + grade3);
			System.out.println("\nFAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - (grade1 + grade2 + grade3));
		}
	}

}
