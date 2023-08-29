
public class Person {
	private String firstName;
	private String lastName;
	private String email;
	Person(String firstName, String lastName, String email){
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
	}
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		if(email.contains("@") && email.contains("."))
			this.email = email;
		else
			this.email = "Undefined";
		
	}
	public String toString(){
		return String.format("Name: %s\nLast Name: %s\nEmail: %s\n", this.firstName, this.lastName, this.email);
	}
}
