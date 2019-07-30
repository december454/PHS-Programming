/**
 * @(#)multiples.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/3
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class multiples {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object that will read in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//A String variable that will record whether or not the user wishes to run the program again.
    	String Results = "";
    	
    	//The main do while loop that encompasses the program.
    	do
    	{
    		//Asking the user to enter two integers.
    		System.out.println ("\nEnter two integers:");
    		
    		//A pair of int variables that will hold the values of those integers.
    		int IntA = Input.nextInt();
    		int IntB = Input.nextInt();
    		
    		//An if statement for when the numbers are multiples that calls to the method.
    		if (MultMethod (IntA, IntB) == true)
    			//Printing out that they are multiples.
    			System.out.println ("\nMultiple\n");
    		
    		//An else statement for when the numbers are not multiples.
    		else 
    			//Printing out that they are not multiples.
    			System.out.println ("\nNot a Multiple\n");
    		
    		//Asking the user if they want to run the program again.
    		System.out.println ("Would you like to run the program again? (Y/N)");
    		
    		//Recoring their response.	
    		Results = Input.next();
    	}
    	//Running the program again if desired.
    	while (Results.equalsIgnoreCase ("y"));
    }
    
    //The method which will determine if the numbers are multiples.
    public static boolean MultMethod (int IntA1, int IntB1)
    {
    	//A boolean variable that will record if the numbers are multiples.
    	boolean TF = true;
    	
    	//The if statement for when the numbers are multiples.
    	if (Math.max (IntA1, IntB1) % Math.min (IntA1, IntB1) == 0)
    		//Setting the "TF" variable to true.
    		TF = true;	
    	
    	//The else statement for when the numbers are not multiples.
    	else 
    		//Setting the "TF" variable to false.
    		TF = false;			
    	
    	//Returning the value of the "TF" variable.
    	return TF;   	
    }   
}