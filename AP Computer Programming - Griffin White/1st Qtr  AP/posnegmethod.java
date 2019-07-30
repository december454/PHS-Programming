/**
 * @(#)posnegmethod.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/9/26
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class posnegmethod {

    public static void main (String [] args) 
    {
    	//A String variable that will record whether or not the user wants to repeat the program.
    	String Response = "";
    	
    	//A do while loop that encompasses the program.
    	do
    	{
    		//Instantiating a scanner for the user's Input.
	    	Scanner Input = new Scanner (System.in);
	    	
	    	//Asking the user to enter an integer.
	    	System.out.println ("\nEnter an integer.");
	    	
	    	//Assigning their input to an int variable.
	    	int Num = Input.nextInt();
	    	
	    	//The if statement for when their number is positive.
	    	if (Num > 0)	
	    		//Calling to the positive method.
	    		Positive();
	    	
	    	//The if statement fof when their number is negative.
	    	else if (Num < 0)	
	    		//Calling to the negative method.
	    		Negative();
	    	
	    	//The if statement for when their number is zero.	
	    	else if (Num == 0)
	    		//Calling to the zero method.	
	    		Zero();
	    	
	    	//Asking the user if they want to run the program again.	
	    	System.out.println ("Would you like to enter another integer? (y/n)");	
	    	
	    	//Recording their response.
	    	Response = Input.next();
    	}
    	//Running the program again if the user desired.
    	while (Response.equalsIgnoreCase("Y"));			
    	
    }
    
    //The positive method.
    public static void Positive ()
    {
    	//Printing out that the number is positive.
    	System.out.println ("The number is positive.");
    }
    
    //The negative method.
    public static void Negative ()
    {
    	//Printing out that the number is negative.
    	System.out.println ("The number is negative.");
    }
    
    //The zero method.
    public static void Zero ()
    {
    	//Printing out that the number is zero.
    	System.out.println ("The number is zero.");
    }
    
    
}