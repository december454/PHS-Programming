/**
 * @(#)Ssnum.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/3/27
 */
//GRADE = 100
//Importing everything that I might need.
import java.io.*;
import java.util.*;

public class Ssnum {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a new Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File ("ssnum2.dat"));
    	
    	//An int variable that reads in the number of data sets in the data file.
    	int DSNum = DF.nextInt();
    	
    	//Moving down to the next line of the data file.
    	DF.nextLine();
    	
    	//The main for loop that will cycle once for each data set.
    	for (int I = 0; I < DSNum; I++)
    	{
    		//Reading in a line from the data file.
    		String  line = DF.nextLine();
    		//Creating another Scanner obect from the above String variable.
    		Scanner Line = new Scanner (line);
    		
    		//Using a Delimiter on the previous Scanner to remove the dashes and replace them with spaces.
    		Line.useDelimiter ("\\-");
    		
    		//An int variable that will hold the value of the sum of the Social Security Number's digits.
    		int Sum = 0;
    		
    		//A while loop that will cycle until the social security number runs out of digits.
    		while (Line.hasNext())
    			//Adding each value to the total sum.
    			Sum += Line.nextInt();
    			
    		//Printing out the Social Security Number and what the sum of all of its digits is.
    		System.out.println ("SS# " + line + " has a sum of " + Sum + "\n");
    	}
    }
}