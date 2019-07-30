/**
 * @(#)Divisors.java
 *
 * Griffin White
 * @author 
 * @version 1.00 2018/1/29
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Divisors {

    public static void main (String [] args) 
    {
    	//Setting up a String variable for the run again response.
    	String Answer = "";
    	
    	//The do while loop that encompasses the entire program.
    	do
    	{
    		//Instantiating a Scanner input.
    		Scanner Input = new Scanner (System.in);
    		
    		//Asking the user to enter a number.	
    		System.out.println ("\nEnter a number:");	
    			//Assigning their input to an int variable.
    			int Num   = Input.nextInt();
    			//Setting up some variables for the next loop.
    			int Times = 1;
    			String Results = "";
    		
    		//The while loop for determining the divisors that will run "Num" times.	
    		while (Times <= Num)
    		{
    			//The if statement that will add a number to "Results" if it is a divisor.
    			if (Num % Times == 0)
    				//Adding the divisor along with a space.
    				Results += Times + (" ");
    				
    			//Adding 1 to the number of times the loop has run.
    			Times ++;
    		}	
    		
    		//Printing the number that the user entered and its divisors.
    		System.out.println ("\n" + Num + " has divisors of " + Results);
    		
    		//Asking the user if they want to run the program again.
    		System.out.println ("\nDo you want to run the program again? (Y/N)");
    			//Assigning their response to a String variable.
    			Answer = Input.next();	
    	}
    	//Running the program again if the user desired.
    	while (Answer.equalsIgnoreCase ("Y"));
    }
    
    
}