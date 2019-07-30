/**
 * @(#)Summation.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/2/25
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Summation {
    
    //A method that will find the summation of a value.
    public static int getSum (int num)
    {
    	//An int variable to hold the final sum.
    	int sum = 0;
    	
    	//An if statement for when the value has been decremented to 1;
    	if (num == 1)
    		//Returning 1 and stopping the recursion.
    		return 1;
    	
    	//Printing out the current step in the summation.	
    	System.out.print (num + "+");
    	
    	//Making the sum equal to the "summation" of one more than the current value.
    	sum = num + getSum (num-1);
    		
    	//Returning the final sum.	
    	return sum; 
    }
    
}