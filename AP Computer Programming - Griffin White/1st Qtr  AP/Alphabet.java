/**
 * @(#)Alphabet.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/8/29
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Alphabet {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File("alphabet.dat"));
    	
    	//A set of string variables that represent the alphabet written "Forwards" and "Backwards".
    	String Forwards  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	String Backwards = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    	
    	//Reading in the number of data sets in the data file and assigning the value to an int variable.
    	int DSNum = DF.nextInt();
    	
    	//Moving down to  the next line of the data file.
    	DF.nextLine();
    	
    	//The main for loop that will cycle once for each data set.
    	for (int H = 0; H < DSNum; H++)
    	{
    		//A String array that will read in each character in the current data set.
    		String [] CurrentLine = DF.nextLine().split ("");
    		
    		//An int variable that will hold the location of the last character in the String array.
    		int LastChar = CurrentLine.length - 1;
    		
    		//A String variable that will hold the results for each data set.
    		String Results = "";
    		
    		//An inner for loop that will cycle once for each pair of characters in the data set.
    		for (int FirstChar = 0; FirstChar < CurrentLine.length; FirstChar++)
    		{
    			//An if statement for when both characters are the same distance from their respective ends.
    			if (Forwards.indexOf (CurrentLine [FirstChar]) == Backwards.indexOf (CurrentLine [LastChar]))
    				//Setting the results to say that they match.
    				Results = "YES";
    			
    			//An else statement for if they are differnt distances from their respective ends.
    			else
    			{
    				//Setting the results to say that they do not match.
    				Results	= "NO";
    				//Breaking out of the current loop.
    				break;
    			}
    			
    			//Moving to the next far-side character.
    			LastChar--;
    		}
    		//Printing out the results for the data set.
    		System.out.println (Results);
    	}
		    	
    	System.out.println();
    }
    
    
}