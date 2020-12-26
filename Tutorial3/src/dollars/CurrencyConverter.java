package dollars;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter(double dollarPrice, double qttDollar) {
		return dollarPrice * qttDollar * (1.00 + IOF);
		
	}
	
}
