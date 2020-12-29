package entities;

public class LegalPerson extends Person{
	private int employees;
	
	public LegalPerson() {
		
	}

	public LegalPerson(String name, Double annualIncome, int employees) {
		super(name, annualIncome);
		this.employees = employees;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}
	
	@Override
	public Double taxes() {
		if(employees > 10) {
			return annualIncome * 0.14;
		}
		else {
			return annualIncome * 0.16;
		}
	}
	
}
