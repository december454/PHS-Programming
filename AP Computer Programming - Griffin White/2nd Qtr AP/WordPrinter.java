/**
 * @(#)WordPrinter.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/18
 */


public class WordPrinter 
{
	
	//A set of private variables that will hold the word to be printed and how many times to print it.
	private String  Word;
	private int NumTimes;
	
	//The default constructor that takes in the values from "WordPrinterDriver".
    public WordPrinter(String Word1, int NumTimes1) 
    {
    	//Assigning the values sent over to the "Word" and "NumTimes" variables.
    	Word = Word1;
    	NumTimes = NumTimes1;
    }
    
    //A method that will print out the word the desired number of times.
    public void Print()
    {
    	//A for loop that will cycle "NumTimes" times.
    	for (int I = 0; I < NumTimes; I++)
    		//Printing out the "Word".
    		System.out.println (Word);
    	
    	//Skipping a line between the data sets.
    	System.out.println ();
    }
    
    
}