/**
 * @(#)Palindrome.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/2/21
 */
//OUTPUT SAYS SUCCESS IS A PALINDROME
//GRADE = 90
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File ("palindrome.txt"));
    	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//Reading in a word from the file.
    		String Word = DF.nextLine();
    		
    		//Printing out the word.
    		System.out.print (Word);
    		
    		//An if statement for when the word is a palindrome, determined with the "palindromeFinder" method.
    		if (palindromeFinder(Word) == true)
    			//Printing that it is a palindrome.
    			System.out.println (" is a palindrome");
    		
    		//An else statement for when it isn't a plaindrome.	
    		else 
    			//Printing out that it isn't.
    			System.out.println (" is NOT a palindrome");	   		
    	}
    }
    
    //A method which will determine if a word is a palindrome with recursion.
    public static boolean palindromeFinder (String Word)
    {
    	//An if statement for when the word has been completely cycled through.
    	if (Word.length() == 1)
    		//Returing that it is a plaindrome.
    		return true;
    			
    	//An if statement for when the last letter is the same as the first.
    	if (Word.substring (0,1).equals(Word.substring(Word.length()-1, Word.length())) )
    		//Sending the word to the method again, minus those two letters.
    		palindromeFinder (Word.substring(1,Word.length()-1));    		
    	
    	//An else statement for when the first and last letters are not the same.
    	else
    		//Returning that it is not a palindrome.
    		return false;
    	
    	//The base case that will keep a true from becoming false.
    	return true;	
    }    
}