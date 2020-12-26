package bank;

public class Client {
	private int accountNumber;
	private String name;
	private double balance;
	
	public Client(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
		
	}

	public Client(int accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public String toString() {
		return "\nAccount data:"
		+ "\nAccount "
		+ accountNumber
		+ ", Holder: "
		+ name
		+ ", Balance: $ "
		+ String.format("%.2f", balance);
	}
	
	public void deposit(double value) {
		balance = balance + value;
		
	}
	
	public void withdraw(double value) {
		balance = (balance - value) - 5;
	}
}
