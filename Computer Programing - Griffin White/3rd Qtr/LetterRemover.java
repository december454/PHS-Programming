/**
 * @(#)LetterRemover.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/6
 */
//GRADE = 100
//Importing everything that I could need.
import java.io.*;
import java.util.*;

public class LetterRemover {

    public static void main (String [] args) 
    {
    	//Setting up a String variable for the "run again" answer.
    	String Answer = "";
    	
    	//The do while loop that contains the program.
    	do
    	{
    		//Instantiating a Scanner input.
    		Scanner Input = new Scanner (System.in);
    		
    		//Asking the user to enter a word or phrase.
    		System.out.println ("\nEnter a word or phrase:");
    			//Assigning their input to a String variable.
    			String Phrase = Input.nextLine();
    			
    		//Asking the user to enter the letter they wish to remove.	
    		System.out.println ("\nEnter the letter you wish to remove:");
    			//Assigning their input to a String variable.
    			String Letter = Input.next();
    			//Some variables that will be used in the following loop.
    			String Result = "";
    			int I = 0;
    			
    		//The main loop that will run once for each character of the word or phrase entered.	
    		while (I < (Phrase.length()))
    		{
    			//A string variable that represents a certain character in the word or phrase. Its value is changed to the next character with each cycle of the loop.
    			String Temp = Phrase.substring (I,(I+1));
    			//The if statement that will only be true with values of "Temp" that are differnt from "Letter".
    			if (!Temp.equalsIgnoreCase (Letter))
    				//Adding "Temp" to "Result". Rewriting the initial word or phrase, minus the selected "Letter", one character at a time.
    				Result += Temp;
    				
    			//Adding 1 to the value of I.	
    			I++;	
    		}		
    			
    	//Printing out the new word or phrase that is now missing any examples of the desired character.		
    	System.out.println ("\n" + Result + "\n");
    	
    	//Asking the user if they want to run the program again.
    	System.out.println ("Do you wish to run this program again (y/n)?");		
    		//Recording their response.
    		Answer = Input.next();
    	}
    	//Running the program again if the user wanted to.
    	while (Answer.equalsIgnoreCase ("Y"));
    }
    
    
}