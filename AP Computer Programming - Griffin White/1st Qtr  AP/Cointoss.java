/**
 * @(#)Cointoss.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/8/24
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Cointoss {

    public static void main (String [] args) 
    {
    	//A String variable that will record the user's answer for if they want to run the program again.
    	String Answer = "";
    	
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//A do while loop that encompasses the program.
    	do 
    	{
    		//An int variable that will keep track of how many heads were flipped.
    		int Heads = 0;
    		//An int variable that will keep track of how many tails were flipped.
    		int Tails = 0;
    		
    		//A for loop that will cycle 25 times for the 25 tosses.
    		for (int I = 0; I < 25; I++)
    		{
    			//A String variable that will record if the current toss was heads or tails.
    			String Side = "Tails";
    			
    			//An if stgatement for when heads is flipped.
    			if ((int)(Math.random()*2) < 1)
    			{
    				//Recording that it was heads.
    				Side = "Heads";
    				//Adding one to the heads count.
    				Heads++;
    			}
    			
    			//An else statement for when tails is flipped.
    			else 
    				//Adding one to the tails count.
    				Tails++;
    			
    			//Printing out what side was recorded.
    			System.out.println (Side);
    		}
    		
    		//Printing out the results of the flips and then asking if the user wants to rerun the program.
    		System.out.println("\nHeads: " + Heads + "\nTails: " + Tails + "\n\nWould you like to run this program again? (Y/N)\n");
    		
    		//Recording the user's response.
    		Answer = Input.next();
    	}
    	//Running the program again if the user chose.
    	while (Answer.equalsIgnoreCase("Y"));
    	
    }
    
    
}