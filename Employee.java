package application;

public class Employee extends Person
	implements Taxable {
	private double salary;
	
	public Employee(String name, double salary) {
		super(name);
		setSalary(salary);
		
	}
	
	private void setSalary(double newSalary) {
		if (newSalary < 0.0)
			throw new RuntimeException("Salary tidak Valid");
		this.salary = newSalary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public double getTakeHomePay() {
		return this.getSalary() - this.getTax();
	}
	
	public double getTax() {
		return this.getSalary() * 0.1;
	}
}
