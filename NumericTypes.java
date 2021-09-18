import java.util.Scanner;
/**
   This program demonstrates how numeric types and operators behave in Java
   Do Task #1 before adding Task#2 where indicated.
*/
public class NumericTypes {
	public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the first score");
		int score1 = userInput.nextInt();
		
		System.out.println("Please enter a second score");
		int score2 = userInput.nextInt();
		
		
		//TASK #2 Create a Scanner object here 
		//identifier declarations
		final int NUMBER = 2 ; // number of scores
		//double score1; // first test score
		//double score2; // second test score
		double five;
		double nine;
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		double sumScore;
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		//Task #2 prompt user to input score1
		//Task #2 read score1 
		//Task #2 prompt user to input score2
		//Task #2 read score2 
		// Find an arithmetic average
		five = 5;
		nine = 9;
		sumScore = score1 + score2;
		average =  sumScore / NUMBER;
		
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		
		// Convert Fahrenheit temperatures to Celsius
		System.out.println("Please enter another temperature in Fahrenheit");
		int fNumber = userInput.nextInt();
		
		fToC = (five / nine) * (fNumber - 32);
		
		output = fNumber + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		//Task #2 read the user’s temperature in Fahrenheit
		//Task #2 convert the user’s temperature to Celsius
		//Task #2 print the user’s temperature in Celsius
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
