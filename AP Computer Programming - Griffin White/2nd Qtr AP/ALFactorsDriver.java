/**
 * @(#)ALFactorsDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/11/14
 */

//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;


public class ALFactorsDriver {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File("ALFactors.dat"));
    	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNextInt())
    	{
    		//Sending the current value over to the "ALFactors" class.
    		ALFactors Calculations = new ALFactors (DF.nextInt());
    		
    		//Printing the results of the "Factors" method in the "ALFactors" class.
    		System.out.println (Calculations.Factors());
    		
    		//Printing out the results of the "CompNums" method in the "ALFactors" class.
    		System.out.println (Calculations.CompNums());
    		
    		//Moving to the next line.
    		System.out.println();
    		
    		
    	}
    	
    	
    }
    
    
}