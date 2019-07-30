/**
 * @(#)Spellbinder.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/3/28
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Spellbinder {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File("spellbinder.in"));
    	
    	//A while loop that will cycle until the data file runs out of data.
    	while (DF.hasNext())
    	{
    		//Reading in the word to be modified and assigning its value to String variable.
    		String Word    = DF.next();
    		//Reading in the letters to be replaced in the word and assigning them to a String variable.
    		String Find    = DF.next();
    		//Reading in what will replace the aforementioned letters and assigning it to a String variable.
    		String Replace = DF.next();
    		
    		//Printing out the modified version of the word.
    		System.out.println (Word.replaceAll(Find,Replace));
    	}
    }   
}