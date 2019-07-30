/**
 * @(#)Flag.java
 * Griffin white
 *
 * @author 
 * @version 1.00 2018/2/22
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Flag {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner input.
    	Scanner DataFile = new Scanner (new File ("flag.dat"));
    	
    	//Setting up an int variable for the number of data sets.
    	int DSNum = DataFile.nextInt();
    	
    	//The outer loop that will cycle once for each data set.
    	for (int J = 0; J < DSNum; J++)
    	{
    		//Assigning the width of each portion of the lines to an int variable.
    		int Width  = (DataFile.nextInt())/3;
    		//Assigning the height of the entire flag (the number of lines) to an int variable.
    		int Height = (DataFile.nextInt());
    		
    		//The inner loop that will cycle once for each line of the flag.
    		for (int K = 0; K < Height; K++)
    		{
    			//The for loop that will print all of the G's for one line, one G for each value of "Width".
    			for (int L = 0; L < Width; L++)
    				System.out.print ("G");
    			
    			//The if statement for printing dashes instead of spaces in the center if it is the first of last line.	
    			if (K == 0 || K == Height - 1)	
    				//The for loop that will print out the dashes, again doing so "Width" number of times.
    				for (int M = 0; M < Width; M++)
    					System.out.print ("-");
    			//The else statement for all other lines that will print spaces in the center.		
    			else 
    				//The for loop that will print "Width" number of spaces.
    				for (int N = 0; N < Width; N++)		
    					System.out.print (" ");
    			
    			//The final for loop that will Print out "Width" number of R's.
    			for (int O = 0; O < Width; O++)		
    				System.out.print ("R");
    			
    			//Moving down to the next line.
    			System.out.println();		
    		}
    		
    		//Putting a line between each of the flags.
    		System.out.println();
    	}
    }
    
    
}