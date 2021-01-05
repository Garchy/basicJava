package entities;

public class Student {
	private int cod;

	public Student(int cod) {
		super();
		this.cod = cod;
	}

	public int getCod() {
		return cod;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cod;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (cod != other.cod)
			return false;
		return true;
	}
	
}
