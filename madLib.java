
import java.util.*;

public class MadLib {

	public static void main(String[] args) {
		String noun = "";
		String verb = "";
		String adjective = "";
		String adverb = "";
		
		//creates a scanner class
		Scanner scan = new Scanner (System.in);
		
		//prompts user for a noun, verb, adjective and adverb
		System.out.println("Enter a noun: ");
		noun = scan.nextLine();
		
		System.out.println("Enter a verb: ");
		verb = scan.nextLine();
		
		System.out.println("Enter an adjective: ");
		adjective = scan.nextLine();
		
		System.out.println("Enter an adverb: ");
		adverb = scan.nextLine();
		
		//prints out story to user with their words entered 
		System.out.println("A " + adjective + " " + noun + " lived in a shining castle. Until one day they decided to " + adverb + " " + verb + " away on an adventure. ");
		
		
		//closes scanner class
		scan.close();

	}

}
