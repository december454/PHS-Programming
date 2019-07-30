/**
 * @(#)LetterBoxDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/19
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class LetterBoxDriver {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File ("LetterBox.txt"));
    	
    	//The main while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//Instantiating a "CurrentDS" object and sending over the values from the data set.
    		LetterBox CurrentDS = new LetterBox (DF.next(), DF.nextInt());
    		
    		//Calling the "PrintLetters" method in the "LetterBox" class.
    		CurrentDS.PrintLetters();

    	}
    }
    
    
}