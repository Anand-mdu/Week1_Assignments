package week1_assignment;

public class library {
	
	
	public String addBook(String bookTitle) {
		return bookTitle;	
	}
	
	void issueBook() {
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		library ab=new library();
		String book = ab.addBook(null);
		System.out.println("Book added successfully");
		ab.issueBook();
		
	}

}
