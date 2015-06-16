/* Derrick Fox
 * CS 213 31015
 * hw4.java
 * February 25, 2014
 * FizzBuzz Game
 * 
 * This program asks a user to enter a range of numbers. The game will then output the numbers; however,
 * if an integer is divisible by 3 it will print "Fizz" instead of the number and if it is divisible by
 * 5 the console will print "Buzz" instead of the number. If the integer is divisible by both 3 and 5
 * it will print "FizzBuzz" instead of the number. 
 */


// Import Scanner class
import java.util.Scanner;

public class hw4 {
	public static void main(String[] args) {
		int firstNum, secondNum, answer;
		
		// Create a do-while loop to make sure that the method executes at least once and then checks to see if
		// the user would like to play again.
		do {
			System.out.println("Enter a starting number");
			Scanner input = new Scanner(System.in);
			firstNum = input.nextInt();
			
			System.out.println("Enter an ending number");
			secondNum = input.nextInt();
			
			// A for-loop to see if the integer is divisible by 5 first and then 3
			// The loop will print the appropriate statement based on divisiblity 
			for (int i = firstNum; i <= secondNum; i++) {
				if (i % 5 == 0) {
					if (i % 3 == 0) {
						System.out.println("FizzBuzz");
					}
				}
				if (i % 3 ==0) {
				System.out.println("Fizz"); 
				} else if (i % 5 == 0) {
					System.out.println("Buzz"); 
				} else {
					System.out.println(i);
				}
			}
			System.out.println("Do you want to play again? Enter '1' for Yes and '0' for No"); 
			answer = input.nextInt();
		// Here we ask if the user would like to play again by assigning a specific value to a variable that the loop checks.
		} while (answer == 1);			
	}
}