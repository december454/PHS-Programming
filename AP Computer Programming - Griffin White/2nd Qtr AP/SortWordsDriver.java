/**
 * @(#)SortWordsDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/11/6
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class SortWordsDriver 
{

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File ("sortwords.txt"));
    	
    	//A while loop that will cycle until reaching the last data set.
    	while (DF.hasNext())
    	{
    		//A String array which will take in the data set and split it up into individual words.
    		String [] SentenceRaw = DF.nextLine().split (" ");
    		
    		//Sending the "SentenceRaw" array over to the "SortWords" class.
    		SortWords Sorter = new SortWords (SentenceRaw);
    		
    		//Calling to the "Original" method which will print the sentence in its original form.
    		Sorter.Original();
    		
    		//Moving down to the next line.
    		System.out.println();
    		
    		//Calling to the "Sorted" method which prints out the sentence in alphabetical order.
    		Sorter.Sorted();
    		
    		//Moving to the next line.
    		System.out.println ("\n");
    	}
    	
    }
    
    
}