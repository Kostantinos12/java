
public class Publiser {
	private String name;
	private String adress;
	private String city;
	private String country;
	Publiser(String name, String adress, String city, String country){
		this.setName(name);
		this.setAdress(adress);
		this.setCity(city);
		this.setCountry(country);
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAdress(){
		return this.adress;
	}
	public void setAdress(String adress){
		this.adress = adress;
	}
	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
	
			this.city = city;
		
	}
	public String getCountry(){
		return this.country;
	}
	public void setCountry(String country){
	
			this.country = country;
		
	}
	public String toString(){
		return String.format("Publiser:{\nName: %s\nAdress: %s\nCity: %s\nCountry: %s\n}\n", this.name, this.adress, this.city, this.country);
	}
}
