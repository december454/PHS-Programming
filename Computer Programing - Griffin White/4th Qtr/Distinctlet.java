/**
 * @(#)Distinctlet.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/5/2
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Distinctlet {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File ("distinctlet.in"));
    	
    	//A String variable that will read in the period marking the end of the data file, whenever there is one to be read in.
    	String EndCap  = "";
    	
    	//A String variable that will hold the results for the current word.
    	String Results = "";
    	
    	//The all encompassing loop that will cycle once for each data set.
    	while (DF.hasNext())
    	{
    		//Reading in a data set from the data file.
    		String Line = DF.nextLine();
    		
    		//A String array that will divide the previous line into individual letters.
    		String [] Word = Line.split("");
    		
    		//Assigning the value of the first entry in the array to "EndCap".
    		EndCap = Word [0];
    		
    		//An if statement that will stop the program here if "EndCap" has a value of ".", marking the end of the data file.
    		if (!(EndCap.equals (".")))
    		{
    			//An outer loop that will cycle once for each letter in the current word.
	    		OuterLoop:
	    		for (int I = 0; I < Word.length; I++)
	    		{
	    			//An inner loop that will compare the current letter to every other letter in the word to see if it is repeated.
	    			for (int J = 0; J < Word.length; J++)
	    			{
	    				//An if statement that will stop the curent letter from being compared to itself.
	    				if (I != J)
	    				{
	    					//The if statement for when the current letter is distinct.
	    					if (!(Word [I].equals (Word [J])))
	    						//Marking the word as distinct.
	    						Results = "USES DISTINCT LETTERS";
	    					//The else statement for letters that aren't distinct.	
	    					else
	    					{
	    						//Marking the word as non-distinct.
	    						Results = "DOES NOT USE DISTINCT LETTERS";
	    						//Breaking out of the "OuterLoop" and stopping the examination of the word once a repeated letter is found.
	    						break OuterLoop;
	    					}			
	    				}	
	    			}
	    		}
	    		
	    		//Printing out the word that was being analysed and whether or not it was distinct.
	    		System.out.println (Line + " " + Results);
    		}
    	}
    }
    
    
}