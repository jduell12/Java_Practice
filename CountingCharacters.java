
import java.util.*;

public class CountingChars {

	public static void main(String[] args) {
		String input = "";
		int sum = 0;

		// creates a scanner class
		Scanner scan = new Scanner(System.in);

		// asks user for input
		System.out.println("Please enter in some input: ");

		// stores the input in a variable
		if (scan.hasNextLine()) {
			input += scan.nextLine();
		}
		
		//counts the characters and integers in the input string 
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == ' ') {
					
				} else {
					sum++;
				}
			}
		//prints the original input and tells the user how many character and integers were entered
			System.out.println(input + " has " + sum + " characters.");
		

		// closes the scanner class
		scan.close();

	}

}
