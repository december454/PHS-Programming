/**
 * @(#)NeelamDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/1/8
 */
//GRADE = 100
//Importing everything that I might need.
import java.io.*;
import java.util.*;

public class NeelamDriver {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File("neelam.dat"));
    	
    	//The main while loop that will cycle once for each value.
    	while (DF.hasNextInt())
    	{
    		//Reading in a value from the data set.
    		int Num = DF.nextInt();
    		
    		//Sending over that value to the "Neelam" class.
    		Neelam Abacus = new Neelam (Num);
    		
    		//Printing out the current value.
    		System.out.println (Num);
    		
    		//Calling to the method that makes the abacus and sending the results to be printed.
    		Abacus.PrintAbacus (Abacus.MakeAbacus());  						
    	}
    }       
}