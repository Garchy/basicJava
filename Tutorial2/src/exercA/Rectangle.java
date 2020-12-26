package exercA;

public class Rectangle {
	public double width;
	public double heigth;
	
	
	public double area() {
		return width * heigth;
	}
	
	public double perimeter() {
		return (2*width) + (2*heigth);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
	}
	
	public String toString() {
		return "\nAREA = " + String.format("%.2f", area())
		+ "\nPERIMETER = " + String.format("%.2f", perimeter())
		+ "\nDIAGONAL = " + String.format("%.2f", diagonal());
	}

}
