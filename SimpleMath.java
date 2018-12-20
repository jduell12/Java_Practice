
import java.util.Scanner;

public class SimpleMath {

	public static void main(String[] args) {
		int operand, num, sum, prod, quot, diff;

		// creates a scanner class
		Scanner scan = new Scanner(System.in);

		// prompts user for two numbers
		System.out.println("Enter a number: ");
		operand = scan.nextInt();

		System.out.println("Enter a second number: ");
		num = scan.nextInt();

		// adds the entered numbers together
		sum = operand + num;

		// multiplies the entered numbers together
		prod = operand * num;

		// checks to see which number is larger, then subtracts the smaller number from
		// the larger one and then divides the smaller number into the larger number
		if (operand < num) {
			int a, b;
			a = operand;
			b = num;
			operand = b;
			num = a;

		}
		diff = operand - num;
		quot = operand / num;

		// prints out the number and the simple math solution
		System.out.println("The numbers you entered: " + operand + " and " + num);
		System.out.println(operand + " + " + num + " = " + sum);
		System.out.println(operand + " - " + num + " = " + diff);
		System.out.println(operand + " * " + num + " = " + prod);
		System.out.println(operand + " / " + num + " = " + quot);

		// closes scanner class
		scan.close();

	}

}
