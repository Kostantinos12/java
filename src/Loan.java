import java.util.Date;

public class Loan implements Time{
	private Student stud;
	private Item im;
	private String timestamp;
	Loan(Student stud, Item im){
		this.setStudent(stud);
		this.setItem(im);
		this.timestamp = loanTime();
	}
	public String getStudent(){
		return this.stud.toString();
	}
	public String getItem(){
		if(im instanceof Book)
			return ((Book)(this.im)).toString();
		else
			return ((Magazine)(this.im)).toString();
	}
	public void setStudent(Student stud){
		this.stud = stud;
		
	}
	public void setItem(Item im){
		this.im = im;
		
	}

	public String getLoanTime(){
		return this.timestamp;
	}
	public String toString(){
		if(im instanceof Book)
			return String.format("Loan:{\n%s%sTimestamp: %s\n}\n", this.stud.toString(), ((Book)(this.im)).toString(), this.getLoanTime());
		else
			return String.format("Loan:{\n%s%sTimestamp: %s\n}\n", this.stud.toString(), ((Magazine)(this.im)).toString(), this.getLoanTime());	
	}
	public String loanTime(){
		return (new Date()).toString();
	}
	
}
