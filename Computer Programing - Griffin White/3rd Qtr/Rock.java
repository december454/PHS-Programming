/**
 * @(#)Rock.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/7
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Rock {

    public static void main (String [] args)
    {
    	//Setting up the variable for the "run again" choice. 
    	String Answer = "";
    	
    	//The do while loop that surrounds the program.
    	do
    	{
    		//Instantiating a Scanner input.
    		Scanner Input = new Scanner (System.in);
    		
    		//An int variable that carries the value of the computer's random choice in a numerical equivelent.
    		int Computer     = (int)(3 * (Math.random())) + 1;
    		//Some variables that will be properly assignined later in the program.
    		int Player       = 0;
    		String Computer1 = "";
    		String Results   = "";
    		
    		//Asking the user to choose Rock, Paper, or Scissors.
    		System.out.println ("\nRock-Paper-Scissors - pick your weapon [R,P,S]:: ");
    			//Assiging their choice to a String variable.
    			String Player1 = Input.next();
    		
    		//The switch statement that will turn the player's letter choice into a numerical choice.(R, P, S to 1, 2, 3 respectively)	
    		switch (Player1)
    		{
    			//The Case for Rock.
    			 case ("R"): case ("r"):
    			 	Player = 1;
    			 	break;
    			//The case for Paper. 	
    			case ("P"): case ("p"):
    				Player = 2;
    				break;
    			//The case for Scissors.	
    			case ("S"): case ("s"):
    				Player = 3;
    				break;
    		}
    		
    		//The switch statement that will turn the computer's numerical choice into a letter choice. (1, 2, 3 to R, P, S respectively) 
    		switch (Computer)
    		{
    			//The case for 1.
    			case (1):
    				Computer1 = "R";
    				break;
    			//The case for 2.
    			case (2):
    				Computer1 = "P";
    				break;
    			//The case for 3.	
    			case (3):
    				Computer1 = "S";
    				break;		
    		}		
    		
    		//The series of if statements for calculating the results of the game and assiging those results to a variable..
    		
    		//The if statement for a Draw.
    		if (Player == Computer)	
    			Results = "!Draw Game!";
    		//The else if statement for the player winning with "Rock Breaks Scissors".
    		else if (Player == 1 && Computer == 3)
    			Results = "!Player wins <<Rock Breaks Scissors>>!";
    		//The else if statement for the player winning with "Paper Covers Rock".	
    		else if (Player == 2 && Computer == 1)
    			Results = "!Player wins <<Paper Covers Rock>>!";
    		//The else if statement for the player winning with "Scissors Cuts Paper".
    		else if (Player == 3 && Computer == 2)
    			Results = "!Player wins <Scissors Cuts Paper>>!";
    		//The else if statement for the computer winning with "Rock Breaks Scissors".	
    		else if (Computer == 1 && Player == 3)
    			Results = "!Computer wins <<Rock Breaks Scissors>>!";
    		//The else if statement for the computer winning with "Paper Covers Rock". 	
    		else if (Computer == 2 && Player == 1)
    			Results = "!Computer wins <<Paper Covers Rock>>!";
    		//The else if statement for the computer winning with "Scissors Cuts Paper".
    		else if (Computer == 3 && Player == 2)
    			Results = "!Computer wins <<Scissors Cut Paper>>!";
    		
    		//Printing out what each of players chose. 	 			
    		System.out.println ("\nPlayer had " + Player1);
    		System.out.println ("Computer had " + Computer1);
    		//Printing out who won and under what conditions they did.
    		System.out.println (Results);
    		
    		//Asking the user if they want to play the game again.
    		System.out.print ("\nDo you wint to play again?");
    			//Recording their response.
    			Answer = Input.next();
    	}
    	//Running the program again if they chose for it to be.
    	while (Answer.equalsIgnoreCase("Y"));
    	
    }
    
    
}