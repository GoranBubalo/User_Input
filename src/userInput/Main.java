package userInput;

//IMPORTANT

//  = = > is used for obtaining the input of the primitive types like int, double
//  = = > is the easiest way to read input in a java program.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Class ( Scanner )
		// - - > gets input from User
		// - - > parse into primitive data type
		// scanner = > object
		// System.in - > used to take input from the standard input
		// Scanner is a class
		// Scanner.in = = > means it will take input from console 
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("What is your name?");
		// method ( .nextLine() ) - > returns a line of text
		// used to read line value 
		String name = scanner.nextLine();

		System.out.print("How old are you? ");
		// method ( .nextInt() ) - > returns a number value
		// used to read int value
		int age = scanner.nextInt();

		/*
		 * IMPORTANT !!!!!!
		 * 
		 * FIX method getting SKIPPED!!! =====>
		 */
		scanner.nextLine();

		System.out.println("What is your favorit food? ");
		// method
		String food = scanner.nextLine();

		// CLOSE THE SCANNER
		// If not closed than Java will not garbage collect the Scanner
		// object and you will have a memory leak in your program
		// WHEN CLOSED JAVA RECLAIMS THE MEMORY
		scanner.close();

		// OUTPUT
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old ");
		System.out.println("Your favorit food is: " + food);
	}

}
