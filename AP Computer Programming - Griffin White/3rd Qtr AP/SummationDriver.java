/**
 * @(#)SummationDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/2/25
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class SummationDriver {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File ("summation.txt"));
    	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNextInt())
    	{
    		//Creating a "Summation" object to calculate a number's summation.
    		Summation Calc = new Summation ();
    		
    		//Reading in a number from the data file.
    		int num = DF.nextInt();
    		
    		//Printing out what number is being worked with.
    		System.out.print   ("Summation(" + num + ") = " );
    		
    		//Calling to the "getSum" method to calculate the summation and print out every step.
    		int Answer = Calc.getSum(num);
    		
    		//Printing out the final answer.
    		System.out.println ("1=" + Answer);
    	}
    }
    
    
}