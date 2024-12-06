package LibraryManagementeSystem;


public class Member extends User{

	int borrowedBooksCount;
	public static final int MAX_BORROW_LIMIT = 5;

	public Member(){
		super();
		this.borrowedBooksCount=0;
	}

	public Member(String name, String contactInfo){
		super(name, contactInfo);
	}

	public Member(Member anotherUser){
		super(anotherMember);
	}

	public void displayDashboard(){
		System.out.println("Member Dashboard : "+borrowedBooksCount);
	}
	
	public boolean canBorrowBooks(){

		return borrowedBooksCount<MAX_BORROW_LIMIT;
	}
	
}