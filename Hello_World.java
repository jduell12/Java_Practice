
import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
		//sets up Scanner class to receive input
		Scanner scan = new Scanner(System.in);
		
		//prompts the user for their name and puts the input into a variable
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		//checks to make sure the input given starts with a letter 
		if (Character.isDigit(name.charAt(0))) { 
			System.out.println("Please enter a name that begins with a letter.");
			 name = scan.nextLine();
			 System.out.println("Hello " + name + ", it's nice to meet you.");
		} else {
			System.out.println("Hello " + name + ", it's nice to meet you.");
		}
		
		
		//closes scanner class
		scan.close();
	}
}
