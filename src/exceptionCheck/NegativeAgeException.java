/*
 * User defined exception that will be generated when the age is negativ
 */


package exceptionCheck;

public class NegativeAgeException extends Exception { //extending Exception class to create user defined exception

	NegativeAgeException(String message){
		super(message);//Constructs a new exception with the specified detail message.
		
	}
}
