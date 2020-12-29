package entities;

public class PhysicPerson extends Person{
	private double expenditureHealth;

	public PhysicPerson() {
		
	}

	public PhysicPerson(String name, Double annualIncome, double expenditureHealth) {
		super(name, annualIncome);
		this.expenditureHealth = expenditureHealth;
	}

	public double getExpenseHealth() {
		return expenditureHealth;
	}

	public void setExpenseHealth(double expenditureHealth) {
		this.expenditureHealth = expenditureHealth;
	}	
	
	@Override
	public Double taxes() {
		if (annualIncome > 20000.00) {
			return (annualIncome * 0.25) - (expenditureHealth * 0.5);
		}
		else {
			return (annualIncome * 0.15) - (expenditureHealth * 0.5);
		}
	}

}
