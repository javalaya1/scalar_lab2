package LibraryManagementeSystem;

public abstract class User{
	private String userId;
	private String name;
	private String contactInfo;

	private static int totalUsers;

	protected User(){
		this.userId = "User_".concat(Integer.toString(User.generateUniqueId()));
		totalUsers++;
	}

	protected User(String name, String contactInfo){
		this.name = name;
		this.contactInfo = contactInfo;
	}

	protected User(User anotherUser){
		this.userId = Integer.toString(User.generateUniqueId()); 
		this.name = anotherUser.name;
		this.contactInfo = anotherUser.contactInfo;
	}

	public final static int generateUniqueId(){
		return 0;
	}

	public static int getTotalUsers(){
		return User.totalUsers;
	}

	public String getUserId(){
		return this.userId;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getcontactInfo(){
		return this.contactInfo;
	}

	public void setcontactInfo(String contactInfo){
		this.contactInfo=contactInfo;
	}

	public abstract void displayDashboard();
	public abstract boolean canBorrowBooks()

}