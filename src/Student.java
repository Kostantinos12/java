
public class Student extends Person{
	private String id;
	Student(String firstName, String lastName, String email, String id){
		super(firstName, lastName, email);
		this.setId(id);
	}
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String toString(){
		return String.format("Student:{\n%sID: %s\n}\n", super.toString(), this.id);
	}
}
