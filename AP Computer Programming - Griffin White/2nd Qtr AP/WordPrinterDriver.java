/**
 * @(#)WordPrinterDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/18
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class WordPrinterDriver {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File ("WordPrinter.txt"));
    	
    	//The main while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//Instantiating a "WordPrinter" object and sending over the word to be printed along with how many times to print it.
    		WordPrinter CurrentSet = new WordPrinter (DF.next(), DF.nextInt());
    		
    		//Calling to the "Print" method in the "WordPrinter" class.	
    		CurrentSet.Print();	
    	}	
    }
}