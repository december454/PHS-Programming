/**
 * @(#)Factorial.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/2/20
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Factorial {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File ("factorial.txt"));
    	
    	//A while loop that will cycle until reading in every value form the data file.
    	while (DF.hasNextLine())
    	{
    		//Reding in a value from the data file.
    		int num = DF.nextInt();
    		
    		//Sending that value to the "factorial" method and recording the answer.
    		int Answer = factorial (num);
    		
    		//Printing out the answer in human readable form.
    		System.out.println ("The factorial of " + num + " is " + String.format("%,d", Answer) + "\n");
    	}   	   	
    }
    
    //A method that will find the factorial of a value.
    public static int factorial (int num)
    {
    	//An int variable to hold the final sum.
    	int sum = 0;
    	
    	//An if statement for when the value has been decremented to 1;
    	if (num == 1)
    		//Returning 1 and stopping the recursion.
    		return 1;
    	
    	//Manking the sum equal to the "factorial" of one less than the current value.
    	sum = num * factorial (num-1);
    	
    	//Returning the final sum.	
    	return sum; 	
    }
}