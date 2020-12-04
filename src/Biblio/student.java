package Biblio;

public class student extends Person {

	
	private int id;
	private int age;
	private String adress;


	public student(String firstName, String lastName, String email, int id, int age, String adress) {
		super(firstName, lastName, email);
		this.id = id;
		this.age = age;
		this.adress = adress;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", age=" + age + ", adress=" + adress + ", toString()=" + super.toString() + "]";
	}


}
