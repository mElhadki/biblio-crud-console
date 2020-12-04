package Biblio;

public class worker extends Person {
	
	private int id ;
	private String regNumber;

	
	public worker(String firstName, String lastName, String email, int id, String regNumber) {
		super(firstName, lastName, email);
		this.id = id;
		this.regNumber = regNumber;

	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	@Override
	public String toString() {
		return "worker [id=" + id + ", regNumber=" + regNumber + ", toString()=" + super.toString() + "]";
	}


}
