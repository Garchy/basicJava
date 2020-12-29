package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> prodList = new ArrayList<>();
		
		System.out.print("Enter the numbers of products: ");
		int qtt = ler.nextInt();
		ler.nextLine();
		
		for (int i = 0; i < qtt; i++) {
			System.out.printf("\nProduct #%d data: \n", i + 1);
			
			System.out.print("Commom, used or imported (c/u/i)? ");
			char type = ler.next().charAt(0);
			ler.nextLine();
			
			System.out.print("Name: ");
			String name = ler.nextLine();
			
			System.out.print("Price: ");
			Double price = ler.nextDouble();
			
			if (type == 'i' || type == 'I' ) {
				System.out.print("Customs fee: ");
				Double customsFee = ler.nextDouble();
				
				Product prod = new ImportedProduct(name, price, customsFee);
				prodList.add(prod);
			}
			else if (type == 'u' || type == 'U') {
				System.out.print("Manufacture date: ");
				Date manufactureDate = sdf.parse(ler.next());
				
				Product prod = new UsedProduct(name, price, manufactureDate);
				prodList.add(prod);				
			}
			else {
				Product prod = new Product(name, price);
				prodList.add(prod);
			}
			
		}
		
		System.out.println("\nPRICE TAGS:");
		for (Product p : prodList) {
			System.out.println(p.priceTag());
		}
		
		ler.close();
	}

}
