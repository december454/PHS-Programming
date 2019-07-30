/**
 * @(#)DiceDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/24
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class DiceDriver 
{

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner object that will take in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//A string variable that will read in the user's response.
    	String Response = "Y";
    	
    	//A do while loop which contains the program.
    	do 
    	{
    		//Asking the user how many times they would like to roll the dice.
    		System.out.println ("\nHow many times would you like to roll the dice?");
    		//Taking in their response and sending it over to the "Dice" class.
    		Dice Boxcars = new Dice (Input.nextInt());
    		
    		//Calling the "RollDice" mwthod in the "Dice" class and printing out the number of boxcars rolled.
    		System.out.println ("\nYou rolled " + Boxcars.RollDice() + " boxcars.");
    		
    		//Asking the user if they would like to run the program again.
    		System.out.println ("\nWould you like to run the program again? (Y/N)");
    		//Recording their response.
    		Response = Input.next();
    	}
    	//Running the program again if they desired.
    	while (Response.equalsIgnoreCase("Y"));  	
    }  
}