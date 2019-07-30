/**
 * @(#)Tentoany.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/10
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Tentoany {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a new Scanner that holds the value of the entire data file.
    	Scanner DF = new Scanner (new File ("tentoany.dat"));
    	
    	//A while loop that will cycle until the end of the data file is reached.
    	while (DF.hasNext())
    	{
    		//An int variable that holds the decimal value of the number to be converted.
    		int Base10  = DF.nextInt();
    		//An int variable that holds the value of what base the prior number will be converted to.
    		int NewBase = DF.nextInt();
    		
    		//Printing out the original number and what it converts to in the new base.
    		System.out.println (Base10 + " = " + (Integer.toString (Base10,NewBase)) + " in base " + NewBase + "\n");
    	}
    }
    
    
}