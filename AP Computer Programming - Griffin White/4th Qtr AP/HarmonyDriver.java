/**
 * @(#)HarmonyDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/25
 */

////////////////////////////////Complete////////////////////////////////
//1 INCORRECT OUTPUT
//1 INCORRECT VALUE
//GRADE = 93
//Importing everything that I will need.
import java.io.*;
import java.util.*;

public class HarmonyDriver {

    public static void main (String [] args) throws IOException
    {
    	//Creating a Scanner for the data file.
    	Scanner df = new Scanner (new File ("harmony.dat"));
    	
    	//Creating a new "Harmony" object to test the series of digits.
    	Harmony tester = new Harmony();
    	
    	//A for loop that will cycle once for each data set.
    	for (int i = df.nextInt(); i > 0; i--)
    	{
    		//Reading in the current line.
    		String line = df.next();
    		
    		//Printing out the current line.
    		System.out.print (line + " ");
    		//Calling to the "digitsTester" method and printing out the results for that line.    			
    		tester.digitsTester (line);
    	}    	    	
    }        
}