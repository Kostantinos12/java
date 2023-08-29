
public class Item {
	private String title;
	private Publiser pub;
	private double price;
	private int quantity;
	private int year;
	Item(String title, Publiser pub, double price, int quantity, int year){
		this.setTitle(title);
		this.setPrice(price);
		this.setQuantity(quantity);
		this.setYear(year);
		this.setPubliser(pub);
		
	}
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public double getPrice(){
		return this.price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public int getYear(){
		return this.year;
	}
	public void setYear(int year){
		this.year = year;
	}

	public void setPubliser(Publiser pub){
		this.pub = pub;
	}
	public String getPubliser(){
		return this.pub.toString();
	}
	public String toString(){
		return String.format("Title: %s\n%sPrice: %f\nYear: %d\nQuantity: %s\n", this.title, this.pub.toString(), this.price, this.year, this.quantity);
	}
}
