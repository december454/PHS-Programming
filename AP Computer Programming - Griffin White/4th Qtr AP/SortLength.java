/**
 * @(#)SortLength.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/3/22
 */

//Importing everything that I may need.
import java.util.*;
import java.io.*;

public class SortLength {

	//A method which will sort the list of words alphabetically.
    public ArrayList <String> getByName  (ArrayList <String> wordList)
    {
    	//Using "Collections.sort" to sort the list.
    	Collections.sort (wordList);    	
    	//Returning the sorted list.
    	return wordList;
    }
    
    //A method which will sort the list of words by length.
    public ArrayList <String> getByLength (ArrayList <String> wordList)
    {
    	//Using "Collections.sort" to sort the list by length.
    	Collections.sort(wordList, Comparator.comparing(String::length));   	
    	//Returning the sorted list.
    	return wordList;
    }
   
   	//A method which will print out the list of words.
    public void printWords (ArrayList <String> wordList)
    {
    	//A for loop that will cycle once for each word.
    	for (int i = 0; i < wordList.size(); i++)
    		//Printing out the current word.
    		System.out.println (wordList.get(i));
    }        
}