
public class ComissionedEmployee extends Employee
	implements Taxable {
	private double comission;
	
	public ComissionedEmployee(String nama, double salary, double newComission) {
		super(nama,salary);
		setComission(newComission);
	}
	
	private void setComission(double newComission) {
		if (newComission < 0.0)
			throw new RuntimeException("Comission tidak valid");
		this.comission = newComission;
	}
	
	public double getComission() {
		return this.comission;
	}
	
	public double getTakeHomePay() {
		return this.getSalary() + this.getComission() - this.getTax();
	}	
	
	public double getTax() {
		return (this.getSalary() + this.getComission()) * 0.1;
	}
}
