
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Management {
	
	public static void main(String[] args) throws IOException {
		ArrayList<Student> students = new ArrayList();
		ArrayList<Item> items = new ArrayList();
		ArrayList<Loan> loans = new ArrayList();
		String choice = new String();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.printf("[+] To Insert New Student Press: 1\n"
							+ "[+] To Insert New Book Press: 2\n"
							+ "[+] To Insert New Magazine Press: 3\n"
							+ "[+] To Insert New Loan Press: 4\n"
							+ "[+] To Delete Loan Press: 5\n"
							+ "[+] To Print Students Press: 6\n"
							+ "[+] To Print Books and Magazines Press: 7\n"
							+ "[+] To Print Loans Press: 8\n"
							+ "[+] For Exit Press: x or X\n"
							+ "[>] Insert Choice: ");
			choice = input.next();
			
			if(choice.equals("1")){
				boolean flag = false;
				String firstName = new String();
				String lastName = new String();
				String email = new String();
				String id = new String();
				System.out.println("Give Firstname: ");
				firstName = input.next();
				System.out.println("Give Lastname: ");
				lastName = input.next();
				System.out.println("Give Email: ");
				email = input.next();
				System.out.println("Give id: ");
				id = input.next();
				for(int i=0; i<students.size();i++){
					if(students.get(i).getId() == id)
						flag = true;
				}
				if(flag  == false)
					students.add(new Student(firstName, lastName, email, id));
			}
			if(choice.equals("2")){
				//title, pub, price, quantity, year
				boolean flag = false;
				String title = new String();
				double price;
				int quantity;
				int year;
				String isbn= new String();
				System.out.println("Give title of the book: ");
				title = input.next();
				for(int i=0; i<items.size();i++){
					if(title.equals(items.get(i).getTitle())){
						flag = true;
					}
				}
				if(flag==false){
					System.out.println("Give price of the book: ");
					price = input.nextDouble();
					System.out.println("Give quantity of books: ");
					quantity = input.nextInt();
					System.out.println("Give year of the book: ");
					year = input.nextInt();
					System.out.println("Give isbn of book: ");
					isbn = input.next();
					String firstName = new String();
					String lastName = new String();
					String email = new String();
					String gender = new String();
					System.out.println("Give Firstname of author: ");
					firstName = input.next();
					System.out.println("Give Lastname of author: ");
					lastName = input.next();
					System.out.println("Give Email of author: ");
					email = input.next();
					System.out.println("Give Gender of author: ");
					gender = input.next();
					String name = new String();
					String adress = new String();
					String city = new String();
					String country = new String();
					System.out.println("Give the name of the publisher: ");
					name = input.next();
					System.out.println("Give the adress of the publisher: ");
					adress = input.next();
					System.out.println("Give the city of the publisher: ");
					city = input.next();
					System.out.println("Give the country of the publisher: ");
					country = input.next();
					items.add(new Book(title, new Publiser(name, adress, city, country), price, quantity, year, new Author(firstName, lastName, email, gender), isbn));
				}
			}
			if(choice.equals("3")){
				boolean flag = false;
				String title = new String();
				double price;
				int quantity;
				int year;
				String issue= new String();
				System.out.println("Give title of Magazine: ");
				title = input.next();
				for(int i=0; i<items.size();i++){
					if(title.equals(items.get(i).getTitle())){
						flag = true;
					}
				}
				if(flag==false){
					System.out.println("Give price: ");
					price = input.nextDouble();
					System.out.println("Give quantity: ");
					quantity = input.nextInt();
					System.out.println("Give year: ");
					year = input.nextInt();
					System.out.println("Give issue: ");
					issue = input.next();
					String name = new String();
					String adress = new String();
					String city = new String();
					String country = new String();
					System.out.println("Give the name of the publisher: ");
					name = input.next();
					System.out.println("Give the adress of the publisher: ");
					adress = input.next();
					System.out.println("Give the city of the publisher: ");
					city = input.next();
					System.out.println("Give the country of the publisher: ");
					country = input.next();
					
					items.add(new Magazine(title, new Publiser(name, adress, city, country), price, quantity, year, issue));
		
				}
			}
			if(choice.equals("4")){
				int indexOfItem = 0;
				int indexOfStudent = 0;
				String id = new String();
				String title = new String();
				boolean flag1 = false;
				boolean flag2 = false;
				
				System.out.println("Give the title of the book: ");
				title = input.next();
				for(int i=0; i<items.size();i++){
					if(title.equals((items.get(i).getTitle()))){
						flag1 = true;
						indexOfItem = i;
					}
				
				}
				
				if(flag1==true){
					System.out.println("<Item found!>");
					System.out.println("Give the id of the Strudent: ");
					id = input.next();
					
					for(int i=0; i<students.size();i++){
						if(id.equals(students.get(i).getId())){
							flag2 = true;
							indexOfStudent = i;
						}
					}
					if(flag2 == false){System.out.println("<Student not found...>");}
				}
				
				if(flag1 && flag2 == true){
					if(items.get(indexOfItem).getQuantity() > 0)
						loans.add(new Loan(students.get(indexOfStudent), items.get(indexOfItem)));
						items.get(indexOfItem).setQuantity((items.get(indexOfItem).getQuantity())-1);
				}
					
			}
			if(choice.equals("5")){
				String date = "";
				System.out.println("Give the date of the loan you wish to remove: ");
				date = buffer.readLine();
				
				for(int i =0;i<loans.size();i++){
					if(date.equals(loans.get(i).getLoanTime())){
						loans.remove(i);
						System.out.println("Loan Deleted Successfully");
						break;
					}
				}
			}
			
			if(choice.equals("6")){
				for(int i = 0; i<students.size(); i++){
					System.out.println(students.get(i).toString());
				}
				
			}
			
			if(choice.equals("7")){
				for(int i = 0; i<items.size(); i++){
					if(items.get(i) instanceof Book)
						System.out.println(((Book)(items.get(i))).toString());
					else
						System.out.println(((Magazine)(items.get(i))).toString());
				}
				
			}
			
			if(choice.equals("8")){
				
				for(int i = 0; i<loans.size(); i++){
					System.out.println(loans.get(i).toString());
					System.out.printf("\n\n\n");
				}
			}
			
		}while((!choice.equals("X")) && (!choice.equals("x")));
		
		buffer.close();
		input.close();
	}
}
