package exercA;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and heigth");
		
		System.out.print("Width: ");
		rectangle.width = ler.nextDouble();
		
		System.out.print("Weigth: ");
		rectangle.heigth = ler.nextDouble();
		
		System.out.println(rectangle);
		
		ler.close();
	}

}
