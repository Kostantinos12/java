
public class Magazine extends Item{
	private String issue;
	Magazine(String title, Publiser pub, double price, int quantity, int year, String issue){
		super(title, pub, price, quantity, year);
		this.setIssue(issue);
	}
	public String getIssue(){
		return this.issue;
		
	}
	public void setIssue(String issue){
		this.issue = issue;
	}
	public String toString(){
		return String.format("Magazine:{\n%sIssue: %s\n}\n", super.toString(), this.issue);
	}
}
