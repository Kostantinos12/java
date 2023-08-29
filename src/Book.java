
public class Book extends Item{
	private Author a;
	private String isbn;
	Book(String title, Publiser pub, double price, int quantity, int year, Author a, String isbn){
		super(title, pub, price, quantity, year);
		this.setIsbn(isbn);
		this.setAuthor(a);
	}
	public String getIsbn(){
		return this.isbn;
	}
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	public String getAuthor(){
		return this.a.toString();
	}
	public void setAuthor(Author a){
		this.a = a;
	}
	public String toString(){
		return String.format("Book:{\n%s%sISBN: %s\n}\n", super.toString(), this.a.toString(), this.isbn);
	}

}
