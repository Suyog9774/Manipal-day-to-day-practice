import java.util.*; 
public class userInfo{
	String name; 
	private int userId; 	
	String companyname ; 
	String address; 
	protected int age; 
	private String position; 
	Scanner sc=new Scanner(System.in ); 
	void createuser(){ 
		System.out.println("name : " ); 
		name = sc.next(); 
		System.out.println("userId: " ); 
		userId = sc.nextInt(); 
		System.out.println( "companyname: " ); 
		companyname = sc.next(); 
		System.out.println("address: " ); 
		address = sc.next();    
		System.out.println( "age: " ); 
		age = sc.nextInt();
		System.out.println("position: ");
		position=sc.next();
	}
	void displayuser(){
		System.out.println( "user name: "+name);
		System.out.println( "user ID: "+userId);
		System.out.println( "company name: "+companyname);
		System.out.println( "address: "+address);
		System.out.println( "age: "+age);
		System.out.println( "position: "+position);

	}
	public static void main(String[] args){
		userInfo obj=new userInfo();
		obj.createuser();
		obj.displayuser();	
	}
}
