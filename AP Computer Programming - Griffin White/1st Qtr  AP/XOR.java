/**
 * @(#)XOR.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/8/27
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class XOR {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File ("xor.dat"));
    	
    	//An outer for loop that will cycle once for each data set.
    	for (int I = DF.nextInt(); I > 0; I--)
    	{
    		//An int variable that will record which number is unique in each data set. 
    		int Incomplete = 0;
    		
    		//An int variable that will read in how many numbers are in each data set.
    		int DSAmount = DF.nextInt();
    		
    		//An int array that will hold the values of each data set.
    		int [] DSNums = new int [DSAmount];
    		
    		//A for loop that will fill in the int array.
    		for (int J = 0; J < DSAmount; J++)
    			//Reading in the current number from the data set into the array.
    			DSNums [J] = DF.nextInt();
    		
    		//A for loop that will cycle once for each number in the data set.
    		for (int K = 0; K < DSAmount; K++)
    		{
    			//An int variable that will record how many instances there are of each number in the array.	
    			int InstanceTracker = 1;
    			
    			//A for loop that will compare every number in the data set to every other number.
    			for (int L = 0; L < DSAmount; L++)
    			{
    				//An if statement that keeps the number from being compared to itself.
    				if (L != K)
    					//An if statement that will mark if a number is repeated.
    					if (DSNums [K] == DSNums [L])
    						//Adding one to the number of instances.
    						InstanceTracker++;
    				
    				//An if statement that will mark a pair as incomplete if it is the last cycle and missing a partner.		
    				if (L == DSAmount-1 && InstanceTracker%2 != 0)
    					//Setting the value of the incomplete number.
    					Incomplete = DSNums [K];
    			}
    		}
    		//Printing out the incomplete pair.
    		System.out.println(Incomplete);
    	}
    	
    	System.out.println();
    }
    
    
}