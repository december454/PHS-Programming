/**
 * @(#)CellBreak.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/1/30
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class CellBreak {

    public static void main (String [] args) 
    {
    	//Seeting up a variable for the "run again" answer.
    	String Answer = "";
    	
    	//The do while loop that contains the program.
    	do
    	{
    		//Instantiating a Scanner input.
    		Scanner Input = new Scanner (System.in);
    		
    		//Setting up some variables outside of the following loop.
    		int I = 0;
    		double Total =0;
    		
    		//Asking the user to enter the how many phone minutes they used on each day of the week.
    		System.out.println ("\nEnter the number of minutes starting with Monday");
    		
    		//The main loop for calculating the total that will run once for every day of the week.
    		while (I < 7)
    		{
    			//Assigning the user's input, this value will be overwritten with each cycle of the loop.
    			double Minutes = Input.nextDouble();
    			//Setting up a value for the charge rate that will also be overwritten with each run of the loop.
    			double Rate = 0;
    			
    			//The if statement that contains the nested ifs for each of the week day rates.
    			if (I <5)
    			{
    				//The if statement for the 0-4 minute $0.32 rate.
	    			if (Minutes > 0 && Minutes <= 4)
	    				Rate = 0.32;
	    			//The if statement for the 4-8 minute $0.22 rate.	
	    			if (Minutes > 4 && Minutes <= 8)
	    				Rate = 0.22;
	    			//The if statement for the 8-20 minute $0.12 rate.
	    			if (Minutes > 8 && Minutes <= 20)
	    				Rate = 0.12;
	    			//The if statement for the 20-100 minute $0.02 rate.	
	    			if (Minutes > 20 && Minutes <= 100)	
	    				Rate = 0.02;
	    			//The if statement for the 100+ minute $ 0.01 rate.	
	    			if (Minutes > 100)
	    				Rate = 0.01;	
    			}	
    			
    			//The else statement for the weekend rate.
    			else 
    				Rate = 0.03;
    			
    			//Adding each day's charge to the total.	
    			Total += (Minutes * Rate);
    			
    			//Adding 1 to the control variable of the loop.
    			I ++;	
    		}	
    		
    	//Printing out the total bill rounded to the nearest cent.
    	System.out.print   ("\nYour total bill will be $");
    	System.out.printf  ("%.2f", Total);
    	//Asking the user if they would like to run the program again.
    	System.out.println ("\n\nWould you like to run this again? y/n");	
    	//Assigning their input to the "Answer" variable.	
    	Answer = Input.next();				
    	}
    	//The while of the do while loop that will run the program again if the user asked for it to be.
    	while (Answer.equalsIgnoreCase ("Y"));
    }
    
    
}