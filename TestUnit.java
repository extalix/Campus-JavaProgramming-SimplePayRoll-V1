package application;

public class TestUnit {
	public static void main(String []args) {
		Employee budi = new Employee("Budi", 100.0);
		ComissionedEmployee susi = new ComissionedEmployee("Susi", 100.0, 300.0);
		
		System.out.println("NAMA : " + budi.getName() + "(" + budi.getClass().getName() + ")");
		System.out.println("GAJI : " + budi.getSalary());
		System.out.println("PAJK : " + budi.getTax());
		System.out.println("GABI : " + budi.getTakeHomePay());
		
		System.out.println();
		
		System.out.println("NAMA : " + susi.getName() + "(" + susi.getClass().getName() + ")");
		System.out.println("GAJI : " + susi.getSalary());
		System.out.println("KOMI : " + susi.getComission());
		System.out.println("PAJK : " + susi.getTax());
		System.out.println("GABI : " + susi.getTakeHomePay());
		
	}
}
