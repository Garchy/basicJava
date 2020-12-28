package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = ler.nextLine();
		
		System.out.print("Email: ");
		String email = ler.nextLine();
		
		System.out.print("Birthday date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(ler.next());		
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("\nEnter order data: ");
		System.out.print("Status: ");
		ler.nextLine();
		String status = ler.nextLine();
				
		System.out.print("\nHow many items to this order? ");
		int qtt = ler.nextInt();
		ler.nextLine();
		
		Order ord = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		for (int i = 0; i < qtt; i++) {
			System.out.printf("\nEnter #%d item data: ", i + 1);
			System.out.print("\nProduct name: ");
			String productName = ler.nextLine();
			
			System.out.print("Product Price: ");
			Double productPrice = ler.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = ler.nextInt();
			ler.nextLine();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			
			ord.addItem(orderItem);

		} 
		
		System.out.println(ord);
		
		
		ler.close();
		
	}

}
