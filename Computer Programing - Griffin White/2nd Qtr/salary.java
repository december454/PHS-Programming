/**
 * @(#)salary.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/12/15
 */
//THE COLUMNS TAB OVER AND THEN THE NUMBERS DON'T LINE UP -- USE PRINTF -- %15.2F
//GRADE = 95
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class salary {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks the user to enter their desired month.
    	System.out.println ("Please enter the month number");
    		//Their input assigned to an int variable.
    		int Month = Input.nextInt();
    		//The variable for the number of days in the month that will be updated in the following switch statement.
    		int Days  = 0;
    		//Setting up variables for the calculations outside of any loops.
    		int DayCount = 1;
    		double Salary = .01;
    		double SalaryTotal = .01;
    	
    	//The switch statement that will assign the proper number of days to the respective month.	
    	switch (Month)
    		//The case for months with 31 days.
    		{case 1: case 3: case 5: case 7: case 8: case 10: case 12:
    			Days = 31;
    			break;
    		//The case for months with 30 days, with February included as asked.
    		case 2: case 4: case 6: case 9: case 11:
    			Days = 30;
    			break;}
    	
    	//Printing out the heading for the table of results.
    	System.out.println("\nDay Number		Daily Salary		Total Salary\n");			
    	
    	//The for loop that will generate the results.				
    	for (int K = Days; K !=0; K--)
    		//Printing the results from each cycle of the loop.
    		{System.out.print (DayCount + "			" + Salary + "			");
    		//Printing the total salary rounded to the nearest hundredth.
    		System.out.printf ("%.2f", SalaryTotal);
    		System.out.println(); 
    		//Increasing the the "DayCount" by one every cycle.
    		DayCount++;    	
    		//Multiplying the salary by 2 every cycle.
    		Salary = Salary*2;	
    		//Adding the new daily salary to the total salary every cycle.
    		SalaryTotal = SalaryTotal + Salary;}
    		
    	System.out.println ();	
    }
    
    
}