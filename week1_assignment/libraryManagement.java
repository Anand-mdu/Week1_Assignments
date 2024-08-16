package week1_assignment;

public class libraryManagement {

	public static void main(String[] args) {
		
		library cd=new library();
		String book = cd.addBook(null);
		System.out.println("Book added successfully");
		cd.issueBook();
		

	}

}
