import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
class HelloUser{

	Scanner sc = new Scanner(System.in);
    String userName = sc.next();

	public void greetUser() {
		System.out.println("Hello " +userName +"!");
	}	
}


public class HelloWorld {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.println("Please enter your name: ");
		
		HelloUser hu = new HelloUser();
		hu.greetUser();
	}
}

