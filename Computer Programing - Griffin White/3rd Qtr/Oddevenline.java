/**
 * @(#)Oddevenline.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/27
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Oddevenline {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner input for the entire data file.
    	Scanner DataFile = new Scanner (new File ("oddevenline.txt"));
    	
    	//The outer while loop that will cycle until the data file runs out of data sets.
    	while (DataFile.hasNextInt())
    	{
    		//Assiging the value of one data set to a String variable.
    		String Line = DataFile.nextLine();
    		
    		//Turning that String variable, "Line" into another Scanner input, "DFLine".
    		Scanner DFLine = new Scanner (Line);
    		
    		//Creating a pair of int variables that will keep track of the number of odd and even intergers. They will be modified in the following loop.
    		int EvenTotal = 0;
    		int OddTotal  = 0;
    		
    		//The inner while loop that will run until the current line from the data file runs out of intergers.
    		while (DFLine.hasNextInt())
    		{
    			//Reading in a number from the Scanner "DFLine".
    			int Current = DFLine.nextInt();
    			
    			//The if statement for when that number is even.
    			if (Current % 2 == 0)
    				//Adding one to the even number count.
    				EvenTotal++;
    				
    			//The else if statement for when that number is odd.	
    			else if (Current % 2 != 0)	
    				//Adding one to the odd number count.
    				OddTotal++;
    		}
    		
    		//Printing out current line that was being analyized and the number of odd and even numbers within it.
    		System.out.println (Line + "\neven count = " + EvenTotal + "\nodd count = " + OddTotal + "\n");
    	}
    }
}