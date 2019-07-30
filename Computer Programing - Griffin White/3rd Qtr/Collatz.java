/**
 * @(#)Collatz.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/26
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Collatz {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner Input.
    	Scanner DataFile = new Scanner (new File ("collatz.dat"));
    	
    	//The outer loop that will cycle once for each data set of the data file.
    	while (DataFile.hasNextLine())
    	{
    		//A long variable that reads in the data set.
    		long Temp = DataFile.nextLong();
    		//An int variable that will hold the value of the number of steps needed.
    		int Steps = 0;
    		
    		//The inner loop that will cycle until "Temp" equals 1.
    		while (Temp != 1)
    		{
    			//The if statement for a number that is even.
    			if (Temp % 2 == 0)
    				//Dividing the number by 2.
    				Temp = Temp/2;
    			//The else if statement for a number that is odd.	
    			else if (Temp % 2 != 0)
    				//Multiplying the number by 3 and then adding 1.
    				Temp = Temp * 3 + 1;
    			
    			//Keeping track of many steps it took to get the number down to 1.
    			Steps++;	
    		}
    		//Printing out how many steps it took.
    		System.out.println (Steps);
    	}	
    }
}