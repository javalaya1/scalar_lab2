package LibraryManagementeSystem;

public class Librarian extends User{
	
	private String employeeNumber;
	public static final int MAX_BORROW_LIMIT = 5;

	public Librarian(String employeeNumnber, String name, String contactInfo){
		super(name, contactInfo);
		this.employeeNumnber = employeeNumnber;
	}

	public Librarian(Librarian anotherLibrarian){
		super(anotherLibrarian.name, anotherLibrarian.contactInfo);
	}

	public void displayDashboard(){
		System.out.println(borrowedBooksCount);
	}
	
	public boolean canBorrowBooks(){
		if(borrowedBooksCount<MAX_BORROW_LIMIT){
			borrowedBooksCount++;
		}
		return borrowedBooksCount<=MAX_BORROW_LIMIT;
	}

	void addNewBook(Book book){
		//implmentation is done later.
	}
	
	void removeBook(Book book){
		//Implementation is done later.
	}
	
}