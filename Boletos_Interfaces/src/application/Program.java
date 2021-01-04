package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalServices;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data:");
		System.out.print("Number: ");
		int number = ler.nextInt();
		
		System.out.print("Date: ");
		Date date = sdf.parse(ler.next());
		
		System.out.print("Contract value: ");
		double totalValue = ler.nextDouble();
		
		Contract cont = new Contract(number, date, totalValue);
		ContractService contServ = new ContractService(new PaypalServices());
		
		System.out.print("\nEnter number os installments: ");
		int installments = ler.nextInt();
		
		contServ.processContract(cont, installments);
		
		System.out.println("\nInstallments:");
		
		for (Installment inst : cont.getInstallment()) {
			System.out.println(inst.toString());
		}
		
		ler.close();
	}

}
