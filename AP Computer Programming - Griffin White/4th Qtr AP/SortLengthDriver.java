/**
 * @(#)SortLengthDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/3/22
 */
//GRADE = 100
//Importing everything that I may need.
import java.util.*;
import java.io.*;

public class SortLengthDriver {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner for the data file.
    	Scanner df = new Scanner (new File ("words.dat"));
    	
    	//Creating an ArrayList to hold the words.
    	ArrayList <String> wordList = new ArrayList <String> ();
    	
    	//Creating a "SortLength" object to sort the list of words.
    	SortLength sorter = new SortLength ();
    	
    	//A while loop that will go through the data file.
    	while (df.hasNext())
    	{
    		//Reading in a word and adding it to the "wordList".
    		wordList.add (df.next());
    	}
    	
    	//Calling to "SortLength" and sorting the list alphabetically.
    	wordList = sorter.getByName(wordList);
    	
    	//Printing out the now sorted list of words.
    	System.out.println ("Sorted By Name:");
    	sorter.printWords (wordList);
    	
    	//Calling to "SortLength" again and sorting the list of words by length.
    	wordList = sorter.getByLength (wordList);
    	
    	//Printing out the now re-sorted list of words.
    	System.out.println ("\nSorted By Length:");
    	sorter.printWords (wordList);
    }  
}