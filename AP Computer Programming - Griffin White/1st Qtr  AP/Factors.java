/**
 * @(#)Factors.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/8/23
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Factors {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File("factors.txt"));
    	
    	//The main while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//Reading in a value from the data file and assigning its value to an int variable.
    		int CurrentNum = DF.nextInt();
    		
    		//Printing out the number being factored.
    		System.out.print (CurrentNum + "-");
    		
    		//An inner for loop that will cycle until every possible factor has been tried.
    		for (int I = 1; I <= CurrentNum; I++)
    		{
    			//An if statement for when a factor is found.
    			if (CurrentNum % I == 0)
    			{
    				//Printing out the value of the factor.
    				System.out.print (I);
    				
    				//An if statemnet that will print a comma to seperate the factors unless it would be hanging of the end.
    				if (I != CurrentNum)
    					System.out.print (",");		
    			}
    		}
    		
    		//Moving down to the next line.
    		System.out.println();
    	}
    	
    	System.out.println();
    }
    
    
}