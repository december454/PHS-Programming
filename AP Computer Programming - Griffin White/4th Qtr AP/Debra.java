/**
 * @(#)Debra.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/12
 */

//////////////////////////////////////Complete//////////////////////////////////////
//GRADE = 100
//Importing everythuing that I may need.
import java.io.*;
import java.util.*;

public class Debra {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner df = new Scanner (new File ("debra.dat"));
    	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (df.hasNext())
    	{
    		//Reading in how many lines will be in the data set.
    		int lines   = df.nextInt();
    		//Reading in excess info.
			df.nextInt();
    		
    		//A for loop that will cycle once for each line in the data set.
    		for (int s = 0; s <= lines; s++)    		    		    	    
    			//Using "StringBuilder" and ".reverse" to mirror the line and then printing it out.			
    			System.out.println (new StringBuilder(df.nextLine()).reverse().toString());
    		
    		//Printing out the end marker.
    		System.out.println ("=====");
    	}
    }        
}