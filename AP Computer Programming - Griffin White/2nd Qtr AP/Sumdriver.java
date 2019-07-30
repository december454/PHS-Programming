/**
 * @(#)Sumdriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/22
 */
//INSTRUCTIONS STATE THE SUM SHOULD BE RETURNED
//GRADE = 85

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Sumdriver 
{

    public static void main (String [] args) 
    {
    	//A scanner object that will take in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//A String variable that will record whether or not the user wants to run the program again.
    	String Response = "Y";
    	
    	//A do while loop that encompasses the main program.
    	do
    	{
    		//Asking the user to enter two numbers.
    		System.out.println ("\nEnter 2 numbers");
    		
    		//Instantiating a NumSet object and sending the values to the "Sum" class.
    		Sum NumSet = new Sum (Input.nextDouble(), Input.nextDouble());
    			
    		//Calling the "PrintSum" method from the "NumSet" class.
    		NumSet.PrintSum();	
    			
    		//Asking the user if they want to run the program again.	
    		System.out.println ("\n\nWould you like to run the program again? (Y/N)");
    		
    		//Recording the user's response.
    		Response = Input.next();
    		
    	}
    	//Cycling the loop again if the user desired.
    	while (Response.equalsIgnoreCase ("Y"));
    	
    }
    
    
}