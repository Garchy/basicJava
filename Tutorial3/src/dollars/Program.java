package dollars;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("What's the dollar price? ");
		double priceDollar = ler.nextDouble();
		
		System.out.printf("How many dollar will be bougth? ");
		double manyDollars = ler.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(priceDollar, manyDollars));
		
		ler.close();
	}

}
