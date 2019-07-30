/**
 * @(#)DigitCounter.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/1/24
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class DigitCounter {

    public static void main (String [] args) 
    {
    	//Setting up a variable for the run again response.
    	String Answer = "Y";
    	
    	//Inclosing the program inside a do while loop so that it can easily be run again.
    	do
    	{
    		//Instantiating a Scanner input.
    		Scanner Input = new Scanner (System.in);
    		
    		//The message that asks the user to enter a number.
    		System.out.println ("\nEnter a number");
    			//Their input assigned to an int variable.
    			int Num   = Input.nextInt();
    			//Creating a duplicate of the previous variable that will remain unmodified.
    			int Num1  = Num;
    			//Setting up a variable for the number of times the following loop runs.
    			int Count = 0;
    		
    		//The loop for determining the length of the number.	
    		while (Num != 0)
    		{
    			//Dividing the number by ten so that each time the loop runs the number will become one digit shorter.
    			Num /= 10;
    			//Adding one to the value of count and therefore calculating the length of the number.
    			Count ++;
    		}
    		
    		//The message that prints the unmodified number and states its length.
    		System.out.println ("\n" + Num1 + " contains " + Count + " digit(s).");
    		
    		//The message that asks the user if they want to run the program again.
    		System.out.println ("\nDo you want to run the program again? (Y/N)\n");
    			//Their input assigned to a String variable.
    			Answer = Input.next();			
    	}
    	//Deciding if the program should be run again, given the user's response.
    	while (Answer.equalsIgnoreCase("Y"));
    	
    	
    }
    
    
}