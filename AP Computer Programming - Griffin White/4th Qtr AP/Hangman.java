/**
 * @(#)Hangman.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/3/20
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Hangman {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner for the data file.
    	Scanner df = new Scanner (new File ("hang.dat"));
    	
    	//A while loop that will cycle until reaching the end of the file.
    	while (df.hasNext())
    	{
    		//Reading in a word from the data file.
    		String word = df.next();
    		
    		//Reading in the number of guesses.
    		int n = df.nextInt();
    		
    		//Reading in all of the guesses that were made.
    		String [] letters = df.nextLine().split(" ");
    		
    		//An int varriable that holds the number of incorrect guesses.
    		int numWrong = 0;
    		
    		//A for loop that will will tally up the incorrect guesses.
    		for (int i = 0; i <= n; i++)
    			//An if statement for when the guess was not found int the word.
    			if (!(word.contains (letters [i])))
    				//Adding to the tally.
    				numWrong++;
			
			//Printing out the current word.
			System.out.println (word);
			
			//Calling to the "manPrinter" method which will print out the hangman figure.
			manPrinter (numWrong);			
    	}
    }
    
    //A method which will print out a hangman figure.
    public static void manPrinter (int num)
    {
    	//An array that holds all of the body parts for the hang man.
    	String [] man = {"  O", "\n*", "=", "|", "=", "*", "\n  |", "\n / ", "\\"};    	
    	
    	//An if statement for when there were no incorrect guesses.
    	if (num == 0)
    		//Printing out "SAFE";
    		System.out.println ("SAFE");
    	
    	//An else statement for when there were incorrect guesses.
    	else
    		//A for loop that will cycle once for each incorrect guess.
    		for (int i = 0; i < num; i++)
    			//Printing out a part of the hangman.
    			System.out.print (man [i]);	    				
		 
		//Moving down a line.       	
    	System.out.println("\n");
    }       
}