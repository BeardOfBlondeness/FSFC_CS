package mess;

public class MainMess {
public static void main(String[] args) { 
	
	
	String firstName="bob";
	String lastName="Blogger";
	String fullName= firstName + " " + lastName;
	String anotherFirstName= firstName;
	String anotherAnotherFirstName = firstName + " " + lastName + " " + anotherFirstName;
	
	
	System.out.println(fullName);
	System.out.println(firstName.equals(lastName));
	System.out.println(firstName.equals(anotherFirstName));
	System.out.println(anotherAnotherFirstName);
	
}
}
