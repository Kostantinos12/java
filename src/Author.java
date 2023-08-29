
public class Author extends Person{
	private String gender = new String();
	Author(String firstName, String lastName, String email, String gender){
		super(firstName, lastName, email);
		this.setGender(gender);
	}
	public String getGender(){
		return this.gender;
	}
	public void setGender(String gender){
		
		if(gender.equals("M") || gender.equals("F"))
			this.gender = gender;
		else
			this.gender = "Undefined";
	}
	public String toString(){
		return String.format("Author:{\n%sGender: %s\n}\n", super.toString(), this.gender);
	}
}
