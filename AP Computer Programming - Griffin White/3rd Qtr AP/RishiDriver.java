/**
 * @(#)RishiDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/3/7
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class RishiDriver {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File ("rishi.dat"));
    	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//Creating a "rishi" object and sending over a line from the data file.
    		Rishi Compressor = new Rishi (DF.nextLine());    		    		

			//Printing out the compressed version of an expanded line or vice versa.
    		System.out.println (Compressor.calcLine());    		
    	}
    }
}