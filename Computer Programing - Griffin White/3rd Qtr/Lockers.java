/**
 * @(#)Lockers.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/3/20
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Lockers {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object that reads in the entire data file.
    	Scanner DF = new Scanner (new File ("lockers.dat"));
    	
    	//An int variable that will read in the number of data sets in the data file.
    	int DSNum = DF.nextInt();
    	
    	//The main for loop that will cycle once for each data set.
    	for (int K = 0; K < DSNum; K++)
    	{
    		//A String variable for guess results that will be used later in the following loop.
    		String Result = "";
    		
    		//An int variable that reads in the value of the first locker in the hall.
    		int First   = DF.nextInt();
    		//An int variable that reads in the value of the last locker in the hall. 
    		int Last    = DF.nextInt();
    		//An int variable that reads in the value of the correct locker choice.
    		int Correct = DF.nextInt();
    		//An int variable that will read in the initial guess.
    		int Guess   = DF.nextInt();
    		
    		//The if statement for a correct locker guess on the first try.
    		if (Guess == Correct)	
    			//Printing out what locker was guessed and that the guess was correct on the first try.
    			System.out.println (Guess + " FOUND ON FIRST TRY");
    		
    		//The while loop that will cycle until the correct locker is guessed.	
    		while (Guess != Correct)
    		{
    			//An int variable that holds the value of how far off the first guess was.
    			int Dif1 = Math.abs(Correct - Guess);
    			
    			//Reading in the next guess.
    			Guess = DF.nextInt();
    			
    			//An int variable that holds the value of how far off the next guess was.
    			int Dif2 = Math.abs(Correct - Guess);
    			
    			//The if statement for when the next guess was correct.
    			if (Guess == Correct)	
    			{
    				//Printing out what the correct guess was and that the correct locker has been found.
    				System.out.println (Guess + " FOUND");
    				//Skipping past the rest of the loop.
    				continue;
    			}
    			
    			//The else if statement for when both guesses were just as far apart.
    			else if (Dif2 == Dif1)
    				//Setting the results of the guess to "SAME".
    				Result = "SAME";
    			//The else if statement for when the new guess was farther off than the prior.	
    			else if (Dif2 > Dif1)	
    				//Setting the results of the guess to "COLDER".
    				Result = "COLDER";
    			//The else if statement for when the new guess was closer to the correct one than the prior.	
    			else if (Dif2 < Dif1)	
    				//Setting the results of the guess to "WARMER"
    				Result = "WARMER";
    			
    			//Printing out what the next guess was and how it compared to the previous guess.
    			System.out.println (Guess + " " + Result);
    		}
    		
    		//Seperating each data set from one another.
    		System.out.println();
    	}
    	
    	System.out.println();
    }
    
    
}