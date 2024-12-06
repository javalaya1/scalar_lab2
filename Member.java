package LibraryManagementeSystem;

public class Member extends User{
	

	int borrowedBooksCount=0;
	public static final int MAX_BORROW_LIMIT = 5;

	Member(String name, String contactInfo){
		super();
		this.name = name;
		this.contactInfo = contactInfo;
	}

	Memeber(Member anotherUser){
		super(anotherMember);
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
	
}