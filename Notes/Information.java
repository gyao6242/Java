
public class Information {
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	
	public Information(String fName, String lName, String g, int age) {
		firstName = fName;
		lastName = lName;
		gender = g;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	
	public void setFirstName(String fName) {
		firstName = fName;
	}
	public void setLastName(String lName) {
		firstName = lName;
	}
	public void setGender(String g) {
		gender = g;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return firstName + " " + lastName + " " + gender + " " + age;
	}
}
