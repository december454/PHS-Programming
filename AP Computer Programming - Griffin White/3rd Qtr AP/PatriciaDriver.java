/**
 * @(#)PatriciaDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/1/7
 */
//3 INCORRECT OUTPUTS
//GRADE = 85
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class PatriciaDriver {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File ("patricia.dat"));
    	
    	//An int variable that records how many data sets are in the data file.
    	int NDataSets = DF.nextInt();
    	
    	//A for loop that will cycle once for each data set.
    	for (int I = 0; I < NDataSets; I++)
    	{
    		//Reading in how many draws were made.
    		int PDraws = DF.nextInt();
    		
    		//Reading in how many red and green pebbles are in the sack.
    		int Red    = DF.nextInt();
    		int Green  = DF.nextInt();
    		
    		//A String variable that will record whether or not the pebble was put back in.
    		String Replace = "";
    		
    		//An if statement for when 2 pebbles were drawn.
    		if (PDraws == 2)
    			//Assigning whether or not the pebble was replaced.
    			Replace = DF.next();
    			
    		//A String variable that will record the first color drawn.
    		String ColorDrawn = DF.next();
    		
   			//Reading in the next color drawn, if needed.
    		if (PDraws == 2)
    			DF.next();
			
			//Sending over all of the values to the "Patricia" class.
    		Patricia Prob = new Patricia (PDraws, Red, Green, Replace, ColorDrawn);
    		
    		//Prining out the probability that was returned.
    		System.out.println (Prob.ReturnProb()); 	
    		
    	}  	
    } 
}