/**
 * @(#)SortWords.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/11/6
 */

//Importing the "util" folder which contains the "Arrays" class.
import java.util.*;

public class SortWords 
{
	//A private String array which will hold the words in the sentence.
	private String [] Sentence;
	
	//The main constructor which will recieve the sentence from "SortWordsDriver".
    public SortWords(String [] Sentence1) 
    {
    	//Assigning the values sent over to the "Sentence" array.
    	Sentence = Sentence1;
    }
    
    //A method which will print out the original sentence with punctuation.
    public void Original ()
    {
    	//A for loop which will cycle until reaching the last word in the sentence.
    	for (int I = 0; I < Sentence.length; I++)
    	{
    		//An if statement for when the first word in the sentence is being looked at.
    		if (I == 0)	
    			//Printing out the first word, captalized.
    			System.out.print (Sentence [I].substring (0,1).toUpperCase() + Sentence [I].substring (1) + " ");

    		//An else statement for normal words in the sentence.
    		else 	
    			//Printing out the word with no changes.
    			System.out.print (Sentence [I] + " ");
    		
    		//An if statement for sentences that begin with "W".
    		if ((I == Sentence.length - 1) && (Sentence [0].substring (0,1).equalsIgnoreCase ("W")))
    			//Ending the sentence with a question mark.
    			System.out.print ("\b?");	
    		
    		//An else if stement for normal sentences.
    		else if (I == Sentence.length - 1)
    			//Ending the sentence with a period.
    			System.out.print ("\b.");	
    	}		
    }
    
    //A method which will print out the sorted sentences.
    public void Sorted ()
    {
    	//Sorting the array alphabetically.
    	Arrays.sort (Sentence);
    	//Calling to the "Original" array now that the array has been sorted.
    	Original();
    }
    
    
    
    
}