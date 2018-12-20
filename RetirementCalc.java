
import java.util.*;
import java.time.*;

public class RetireCalc {

	public static void main(String[] args) {
		int age, retireAge, retireYear, num, currYearInt;
		Year currYear;
		
		//creates a scanner class
		Scanner scan = new Scanner(System.in);
		
		//prompts user for their current age
		System.out.println("What is your current age? ");
		age = scan.nextInt();
		
		//prompts user for the age they want to retire
		System.out.println("At what age would you like to retire? ");
		retireAge = scan.nextInt();
		
		//finds the difference in ages to find how many years they have left until retirement
		num = retireAge - age;
		
		//finds the current year and then finds the year the user will retire 
		currYear = java.time.Year.now();
		currYearInt = currYear.getValue();
		retireYear = currYearInt + num;
		
		
		//Prints out to user 
		System.out.println("You have " + num + " years left until you can retire.");
		System.out.println("It's " + currYear + ", so you can retire in " + retireYear);
		
		//closes scanner class
		scan.close();

	}

}
