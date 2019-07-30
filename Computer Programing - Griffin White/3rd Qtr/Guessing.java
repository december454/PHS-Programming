/**
 * @(#)Guessing.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/2
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Guessing {

    public static void main (String [] args) 
    {
    	//Setting up the run again response variable.
    	String Answer = "";
    	
    	//The do while loop that contains the program.
    	do
    	{
    		//Instantiating a Scanner input.
    		Scanner Input = new Scanner (System.in);
    		
    		//Asking the user to enter the maximum number in their range.
    		System.out.print ("\nGuessing Game - how many numbers? ");
    			//Assigning their input to an int vaiable.
    			int Range    = Input.nextInt();
    			//Generating a random number that will fall in their range using Math.random.
    			int Correct  = (int)((Math.random()) * Range + 1);
    			//Setting up some variables that will be used in the following loop.
    			int Response = 0;
    			int Guesses  = 0;
    			 
    		//The while loop that will continue cycling until the user's response is the correct answer.	 
    		while (Response != Correct)
    		{
    			//Asking the user to guess the correct number.
    			System.out.print ("\nEnter a number between 1 and " + Range + " ");
    				//Assigning their response to an int variable.
    				Response = Input.nextInt();
    				
    			//The if statement for when their response is outside of the range they defined.	
    			if (Response <1 || Response > Range)
    				//Printing that the number was outside of the range.
    				System.out.print ("Number out of range!");
    			//The else if statement for when their response is greater than the correct number.
    			else if (Response > Correct)
    			{	
    				//Telling the user that they need to choose a lower number.
    				System.out.print("Lower");
    				//Keeping track of how many times the user has guessed.
    				Guesses ++;
    			}	
    			//The else if statement for when their response is less than the correct number. 	
    			else if (Response < Correct)
    			{
    				//Telling the user that they need to choose a higher number.
    				System.out.print("Higher");
    				//Keeping track of how many times they guessed.
    				Guesses ++;
    			}
    			//The else if statement for when their response is correct.
    			else if (Response == Correct)
    				//Keeping track of how many times they guessed.
    				Guesses ++;		
    		}
    		
    		//The message that tells the user how many tries it took them to guess the correct number.
    		System.out.println ("\nIt took " + Guesses + " guesses to guess " + Correct + ".");
    		//Asking the user if they want to play the game again.
    		System.out.print ("Do you want to play again?");	
    			//Recoring their response.
    			Answer = Input.next();
    	}
    	//Running the program again if they so desired.
    	while (Answer.equalsIgnoreCase("Y"));
    }
    
    
}