package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		product.name = ler.nextLine();
		
		System.out.print("Price: ");
		product.price = ler.nextDouble();
		
		System.out.printf("Quantity: ");
		product.quantity = ler.nextInt();		
		
		System.out.println("\nProduct Data: " + product);
		
		System.out.printf("\nEnter the numbers of the products to be added in stock: ");
		int quantity = ler.nextInt();
		product.addProducts(quantity);
		System.out.println("\nUpdate Data: " + product);
		
		System.out.printf("\nEnter the numbers of the products to be removed in stock: ");
		quantity = ler.nextInt();
		product.removeProducts(quantity);
		System.out.println("\nUpdate Data: " + product);
		
		
		ler.close();
		
	}

}
