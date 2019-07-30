/**
 * @(#)Deshi.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/3/19
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Deshi {

    public static void main (String [] args) throws IOException 
    {
    	//Creating a Scanner for the data file.
    	Scanner df = new Scanner (new File ("deshi.dat"));
    	
    	//A while loop that will cycle until reaching the end ofthe data file.
    	while (df.hasNext())
    	{    
    		//Reading in a line from the data file.
    		String rawLine = df.nextLine();		
    		//Splitting the line into an array.
    		String [] line = rawLine.split("");
    		
    		//A set of counters to keep track of consecutive vowels and consonants.
    		int v = 0;
    		int c = 0;
    		
    		//A boolean value that tracks if the line is acceptable.
    		boolean acceptable = true;
    		
    		//A for loop that will go through every character in the line.
    		for (int i = 0; i < line.length; i++)
    		{
    			//An if statement that checks to see if the current character is a vowel.
    			if (line [i].equals("a") || line [i].equals("e") || line [i].equals("i") || line [i].equals("o") || line [i].equals("u") )
    			{
    				//Adding one to the vowel tally.
    				v++;
    				//Setting the consonant tally back to zero.
    				c = 0;
    			}
    			
    			//An else statement for when the letter is a consonant.
    			else 
    			{
    				//Adding one to the consonant tally.
    				c++;
    				//Setting the vowel count back to zero/
    				v = 0;
    			}
    			
    			//An if statement for if either tally exceeds the acceptable values.
    			if (c > 7 || v > 4)
    				//Setting "acceptable" to false.
    				acceptable = false;    				
    		}
			
			//An if statement for when the line was not acceptable. 		
    		if (acceptable == false)
    			//Printing out that it was not.
    			System.out.print ("NOT ");
    		
    		//Printing out the current line.
    		System.out.println ("ACCEPTABLE " + rawLine);    		
    	}    	
    }   
}