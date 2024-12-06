package LibraryManagementeSystem;

public class Librarian extends User{
	
	private String employeeNumber;
	public static final int MAX_BORROW_LIMIT = 5;

	public Librarian(String employeeNumber){
		super();
		this.employeeNumnber = employeeNumnber;
	}
	public Librarian(String employeeNumnber, String name, String contactInfo){
		super(name, contactInfo);
		this.employeeNumnber = employeeNumnber;
	}

	public Librarian(Librarian anotherLibrarian){
		super(anotherLibrarian.name, anotherLibrarian.contactInfo);
	}

	public void displayDashboard(){
		System.out.println("Librarian Dashboard :	");
		System.out.println("Employee Number : "+this.employeeNumber);
	}
	
	public boolean canBorrowBooks(){

		return true;
	}

	public void addNewBook(Book book){
		//implmentation is done later.
	}
	
	public void removeBook(Book book){
		//Implementation is done later.
	}
	
}