
import java.util.*;

public class Quote {

	public static void main(String[] args) {
		//create scanner class 
		Scanner scan = new Scanner (System.in);
		
		//prompts user for a quote
		System.out.println("Enter in a quote: ");
		String quote = scan.nextLine();
		
		//prompts user for an author to the quote
		System.out.println("Enter the author of the quote: ");
		String author = scan.nextLine();
		
		//prints out the quote and author
		System.out.println(quote + " by: " + author);
		
		
		//close scanner class
		scan.close();

	}

}
