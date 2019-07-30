/**
 * @(#)Digital.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/13
 */

import java.io.*;
import java.util.*;

public class Digital {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object
    	Scanner df = new Scanner (new File ("digital.dat"));
    	
    	//read in how many data sets 
    	int numtimes = df.nextInt();	//read in the 2
    	
    	//loop to run the program numtimes
    	for (int k = 0; k<numtimes; k++)
    	{
    		//variable to store cost
    		double cost = 0;
    		
    		String size = df.next();	//reads the 4x6
    		int howmany = df.nextInt();	//reads in the 3
    		
    		//find the cost of the 4x6 pictures
    		cost = cost + howmany * .19;
    		
    		size = df.next();	//read in the 5x7
    		howmany = df.nextInt();	//read in the 10
    		
    		//add the 5x7 cost to the 4x6 cost
    		cost += howmany * .27;
    		
    		System.out.printf("$%.2f\n", cost);
    	}
    }
    
    
}