/**
 * @(#)oddevenmethod.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/9/25
 */
//IN THE FUTURE, MAKE YOUR METHOD NAMES DESCRIPTIVE
//GRADE = 100
import java.io.*;
import java.util.*;

public class oddevenmethod {

    public static void main (String [] args) 
    {
    	//A String variable that will record whether or not the user wants to run the program again.
    	String Response = "";
    	//A do while loop that will hold the main program.
    	do
    	{
    		//A scanner that will take the user's input.
    		Scanner Input = new Scanner (System.in);
    		
    		//Asking the user to enter an integer.
    		System.out.println ("\nEnter an interger.");
    		
    		//An if statement that determines if the number is even.
    		if (Input.nextInt() % 2 == 0)
    			//Calling to the even response method.
    			Method1();
    		
    		//An else statement for when the number is odd.
    		else 
    			//Calling to the odd response method.
    			Method2();
    		
    		//Asking the user if they want to run the program again.
    		System.out.println ("Would you like to enter another integer? (y/n)");
    		
    		//Reading in the user's response.
    		Response = Input.next();
    		
    	}
    	//Running the program again if they desire.
    	while (Response.equalsIgnoreCase("Y"));
    	
    }
    
    //The method for the even response.
    public static void Method1()
    	{
    		//Printing out that the number is even.
    		System.out.println("The number is even");
    	}
    	
    	//The method for the odd resonse.
    	public static void Method2()
    	{
    		//Printing out that the number is odd.
    		System.out.println("The number is odd");
    	}
    
}