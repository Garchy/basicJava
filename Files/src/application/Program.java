package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List<Product> productList = new ArrayList<>();
		
		System.out.print("Enter a folder path: ");
		String strPath = ler.nextLine();
		
		File fileFolderPath = new File(strPath);
		String folderPath = fileFolderPath.getParent();
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
			
			String line = br.readLine();
			
			while (line != null) {
				String[] vect = line.split(",");
				
				String name = vect[0];
				double price = Double.parseDouble(vect[1]);
				int quantity = Integer.parseInt(vect[2]);
				
				productList.add(new Product(name, price, quantity));
				
				line = br.readLine();
				
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(folderPath + "\\out.txt"))) {
					for(Product prod: productList) {
						bw.write(prod.toString() + "\n");
					}
				}
				catch(IOException e) {
					e.getStackTrace();
				}				
			}			
		}
		catch (IOException e) {
			e.getStackTrace();
		}		
		System.out.println("CREATED!");
		ler.close();
	}
}
