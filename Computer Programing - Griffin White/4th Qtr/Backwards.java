/**
 * @(#)Backwards.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/5/7
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Backwards {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File("backwards.txt"));
    	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//A String variable that will read in a line from the data file.
    		String Line = DF.nextLine();
    		
    		//A char array that will take the prior line and break it up into individual letters. 
    		char [] Reverse = Line.toCharArray();
    		
    		//A for loop that will cycle once for each character in the line.
    		for (int I = Reverse.length; I > 0; I--)
    			//Printing out each letter one at a time, staring from the last one.
    			System.out.print (Reverse [I - 1]);
    		
    		//Moving to the next line.
    		System.out.println();	
    	}
    }
}