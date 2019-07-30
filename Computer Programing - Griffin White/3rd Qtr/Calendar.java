/**
 * @(#)Calendar.java
 * Griffin white
 *
 * @author 
 * @version 1.00 2018/1/8
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Calendar {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The message that asks the user to enter the day on which the month starts in numerical form.
    	System.out.println ("Please enter the day the month starts: (1 = Sunday, 2 = Monday, 3 = Tuesday...)");
    		//Their input assigned to an int variable. The value which is assigned is actually one less than their input to make calculations easier.
    		int StartDay = (Input.nextInt())-1;
    	//The prompt that asks the user to enter the month in a numerical form.	
    	System.out.println ("\nPlease enter the month: (1 = January, 2 = February, 3 = March...)" );
    		//Their input assigned to an int variable.
    		int Month = Input.nextInt();
    		//A number of variables that will be used later in the program.
    		int MonthLength = 0;
    		int DayNum = 1;
    		int PrintCount = 0;
    	
    	//The switch statement that will figure out how many days are in the selected month.
    	switch (Month)
    	{
    		//The cases for months with 31 days.
    		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
    			MonthLength = 31;
    			break;
    		//The cases for months with 30 days.	
    		case 4: case 6: case 9: case 11:
    			MonthLength = 30;
    			break;
    		//The case for February. It is assumed to have 28 days.	
    		case 2:
    			MonthLength	= 28;
    			break;
    	}			
    	
    	//Printing the header of the calendar. 	
    	System.out.println ("\n  S  M  T  W  T  F  S");
    	
    	//A simple loop that will repeat seven times. It will produce a calendar with up to seven lines, more than enough.
    	for (int H = 0; H < 7; H++)
    	{
    		//A nested loop that will print each line of the calendar. It will repeat seven times as well, once for each day of the week. 
    		for (int I = 0; I < 7; I++)
    		{	
    			//The if statement that will make the program stop printing days once it has printed every day of the month.
    			if (DayNum <= MonthLength)
    			{
    				//The if statement for blanking out days prior to the first of the month.
    				if (PrintCount < StartDay)
    					//Printing the blanks.
    					System.out.print ("   ");
    				//The else if statement for the single digit dates.	
    				else if (DayNum < 10)
    				{	
    					//If the date is a single digit, another space is added to maintain formatting.		
    					System.out.print ("  " + DayNum);
    					//Moving the date forward.
    					DayNum++;
    				}
    				//The else statement for double digit dates.		
    				else 
    				{	
    					//If the date is double digits, only one space is added for formatting.
    					System.out.print (" " + DayNum);
    					//Moving the date forward. It won't interfere with the previous since they can never run in the same loop, and having it outside of the loop itself keeps the date from increasing when blanks are being put in.
    					DayNum++;
    				}	
    			}		
    				//Increasing the value of "PrintCount" so that the program can stop printing blanks.
    				PrintCount ++;
    				
    		}
    		//Moving to the next line.
    		System.out.println();
    	}	
    	}
    }
    
    
