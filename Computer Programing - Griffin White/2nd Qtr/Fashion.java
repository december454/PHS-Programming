/**
 * @(#)Fashion.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/11/17
 */
//GRADE = 100
//Importing everything that I could need.
import java.util.*;
import java.io.*;

public class Fashion {

    public static void main (String [] args){
    	
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The first prompt that asks the user to enter their stylishness on a scale of 1-10.
    	System.out.println ("Enter the stylishness of your clothes:");
    		//Their input assigned to an int variable.
    		int You  = Input.nextInt();
    	//The second prompt that asks the user to enter their date's stylishness on a scale of 1-10.
    	System.out.println ("Enter the stylishness of your date's clothes:");
    		//Their input assigned to an int variable.
    		int Date = Input.nextInt();	
    	
    	//Setting up a variable for the result outside of an if statement.
    	String Result = " ";
    	
    	//The if statement that will give the "no" result if either you or your date have a style that is less than or equal to 2.
    	if (Date <= 2 || You <=2)
    		Result = "0: no!";
    	//The else if statement that will give the "yes" result if either you or your date have a style that is greater than or equal to 8.
    	//If either had a style of 2 or less, it would have already been addressed in the previous if statement.    	
    	else if (Date >= 8 || You >= 8) 
    		Result = "2: yes!";
    	//The else statement that will print the "maybe" response if both of your styles are average.	
    	else 
    		Result = "1: Maybe";	
    	
    	//The message that will print your chances of getting a table based on the previous calculations.		
    	System.out.println("\nThe result of you getting a table is " + Result + "\n");	
    	
    }
    
    
}