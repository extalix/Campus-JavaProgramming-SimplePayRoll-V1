
public class Person {
	protected String name;
	
	public Person(String name) {
		setName(name);
	}
	
	private void setName(String name) {
		if (name.equals(""))
			throw new RuntimeException("Nama tidak valid");
		this.name = name;
	}
}
