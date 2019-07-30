/**
 * @(#)Oddevensub.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/24
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Oddevensub {

    public static void main (String [] args) 
    {
    	
    	//A String variable that will record whether or not the user wnts to run the program again.
    	String RunAgain = "";
    	
    	//A do while loop that contains the entire program.
    	do
    	{
    	//Instantiating a Scanner input.	
    	Scanner Input = new Scanner (System.in);
    	
    	//Creating an array that will hold the 10 integers the user enters.
    	int IntArray [] = new int [10];
    	
    	//Asking the user to enter 10 intergers.
    	System.out.println ("\nEnter 10 intergers.");
    	
    	//Int variables that will keep track of the odd and even subscript totals.
    	int EvenTotal = 0;
    	int OddTotal  = 0;
    		
    	//A for loop that will cycle 10 times, once for each integer the user has to enter.	
    	for (int I = 0; I < 10; I++)
    		IntArray [I] = Input.nextInt();
    		
    	//A for loop that will cycle 10 times, once for each integer the user has entered.	
    	for (int J = 0; J < 10; J++)
    	{
    		//A temporary int variable that will read in an integer from the array.
    		int Temp = IntArray [J];
    		
    		//The if statement for when the subscript is even.
    		if (J % 2 == 0)
    			//Adding the value of that location in the array to the total of the even subscript values.
    			EvenTotal += Temp;
    		//The else statement for when the subsctript is odd.	
    		else
    			//Adding the value of that location in the array to the total of the odd subscript values.
    			OddTotal += Temp;
    	}	
    		
    	//Printing out the odd subscript total.	
    	System.out.println ("\nThe sum of the odd subscripts is:  " + OddTotal);
    	//Printing out the even subscript total.
    	System.out.println ("The sum of the even subscripts is: " + EvenTotal);
    	//Asking the user if they would like to run the program again.
    	System.out.println ("\nWould you like to run this program again? (Y/N)");
    	
    	//Taking the user's response and assigning it to a String variable.
    	RunAgain = Input.next();
    	}	
    	//Running the program again if the user desired.	
    	while (RunAgain.equalsIgnoreCase("Y"));
    		
    		
    		
    
    
    }
}