/**
 * @(#)KostasDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/5/13
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class KostasDriver {

    public static void main (String [] args) throws IOException
    {
    	//Creating a Scanner for the data file.
    	Scanner df = new Scanner (new File ("kostas.dat"));
    	
    	//A while loop that will go through each value in the data file.
    	while (df.hasNext())
    	{
    		//Creating a "leeter" object that will be used to encode each line.
    		Kostas leeter = new Kostas (df.nextLine());
    		
    		//Calling to the "getleet" method and printing out the encoded line.
    		System.out.println (leeter.getLeet());    		
    	}
    }        
}