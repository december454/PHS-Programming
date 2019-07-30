/**
 * @(#)Mixup.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/3/2
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Mixup {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File ("mixup.dat"));
    	
    	//An int variable that reads in how many data sets there are in the data file.
    	int DSNum = DF.nextInt();
    	
    	//The main for loop that will cycle once for each data set.
    	for (int I = 0; I <= DSNum; I++)
    	{
    		//A string variable that reads in the value of the next line of the data file.
    		String Line   = DF.nextLine();
    		//A new Scanner object that holds the value of the previous line.
    		Scanner Line1 = new Scanner (Line);
	    	
	    	//A while loop that will cycle until "Line1" runs out of words.
	    	while (Line1.hasNext())
	    	{
	    		//A string variable that reads in a word from "Line1".
		    	String Word   = Line1.next();
		    	
		    	//An int variable that holds the value of the previous word's length.	
		    	int WLength   = Word.length();
		    	
		    	//A while loop that will cycle once for each character in "Word".
		    	while (WLength > 0)
		    	{
		    		//Printing out the each letter of the word in reverse order.
		    		System.out.print (Word.substring(WLength - 1, WLength));
		    		//Moving to the next letter in the word.
		    		WLength--;
		    	}
		    	//Printing a space between each of the words in "Line1".	
		    	System.out.print (" ");
	    	}
	    	//Moving to the next line before starting on the next data set.	
	    	System.out.println();		
    	}
    	System.out.println();
    }
}