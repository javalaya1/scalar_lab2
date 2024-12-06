public abstract class User{
	private String userId;
	private String name;
	private String contactInfo;


	User(){
		this.userId = Integer.toString(User.generateUniqueId()); 
	}

	User(String name, String contactInfo){
		this.name = name;
		this.contactInfo = contactInfo;
	}

	User(User anotherUser){
		this.name = anotherUser.name;
		this.contactInfo = anotherUser.contactInfo;
	}

	public final static int generateUniqueId(){
		return 0;
	}

	public String getUserId(){
		return this.userId;
	}

	public String getName(){
		return this.name;
	}

	public String getcontactInfo(){
		return this.contactInfo;
	}

	public abstract void displayDashboard();
	public abstract boolean canBorrowBooks()

}
