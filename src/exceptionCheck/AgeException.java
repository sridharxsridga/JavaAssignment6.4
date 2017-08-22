/*
 * program to generate a user-defined exception called NegativeAgeException if user inputs negative value for age.
 */
package exceptionCheck;

import java.util.Scanner;

public class AgeException {

	public static void main(String[] args) throws NegativeAgeException {
		Scanner scanner = new Scanner(System.in); //Scanner object to get user input
		System.out.println("Enter Age:");
		int age=scanner.nextInt(); //input age
		if(age<0) throw new NegativeAgeException("Not a valid age");//if age is negative generate NegativeAgeException 
		else{
			System.out.println("Valid Age");
		}
		
	}

}
