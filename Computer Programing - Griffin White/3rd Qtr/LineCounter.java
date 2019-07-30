/**
 * @(#)LineCounter.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/26
 */
//GRADE = 100
//Importing everything that I could need.
import java.io.*;
import java.util.*;

public class LineCounter {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner input for the entire data file.
    	Scanner DataFile = new Scanner (new File ("linecounter.txt"));
    	
    	//The outer while loop that will cycle until the data file runs out of data sets.
    	while (DataFile.hasNextLine())
    	{
    		//Creating a String variable that will hold the value of one data set (line) of the data file.
    		String DSLine   = DataFile.nextLine();
    		//Instantiating a "Chopper" Scanner input that reads in the previously mentioned line from the variable "DSLine".
    		Scanner Chopper = new Scanner (DSLine);
    		//An int variable that will record how many numbers are in each data set.
    		int NumCount    = 0;
    		//An int variable that will hold the value of each number in the line.
    		int Temp        = 0;
    		
    		//The inner while loop that will cycle once for each number in the line.
    		while (Chopper.hasNextInt())
    		{
    			//Reading in a number from the line.
    			Temp = Chopper.nextInt();
    			//Adding 1 to the count of how many numbers there are.
    			NumCount++;
    		}
   			
   			//Printing out the line and how many numbers were in it.
    		System.out.println (DSLine + "\ncount = " + NumCount + "\n");
    	
    	}
    }
}