/**
 * @(#)ValueName.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/1/3
 */
//GRADE = 100
//Importing everything that I need.
import java.io.*;
import java.util.*;

public class ValueName {

    public static void main (String [] argd) 
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks the user to enter their name.
    	System.out.println ("Enter your name:");
    		//Assigning their input to a String variable.
    		String Name1 = Input.nextLine();
    		//Making their input all capital so that things are easier later in the program.
    		String Name2 = Name1.toUpperCase();
    		//Finding the length of the user's input.
    		int Length   = Name1.length();
    		//Setting up some variables to be used later in the program.
    		int Total    = 0;
    		int LetValue = 0;
    		char Let     = 0;
    	
    	//The loop that will repeat once for every letter of the user's name.
    	for (int I = 0; I < Length; I++)
    	{
    		//Assigning a new value to "Let" every time the loop runs, moving forward one letter in the name each time.
    		Let = Name2.charAt(I); 
    		
    		//The if statement for letters "A", "B", and "C".
    		if      (Let == 'A' || Let == 'B' || Let == 'C')
    			LetValue = 2;
    		//The else if statement for letters "D", "E", and "F".
    		else if (Let == 'D' || Let == 'E' || Let == 'F')
    			LetValue = 3;
    		//The else if statement for letters "G", "H", and "I".	
    		else if (Let == 'G' || Let == 'H' || Let == 'I')
    			LetValue = 4;
    		//The else if statement for letters "J", "K", and "L".	
    		else if (Let == 'J' || Let == 'K' || Let == 'L')
    			LetValue = 5;
    		//The else if statement for letters "M", "N", and "O".	
    		else if (Let == 'M' || Let == 'N' || Let == 'O')
    			LetValue = 6;
    		//The else if statement for letters "P", "R", and "S", skipping "Q".	
    		else if (Let == 'P' || Let == 'R' || Let == 'S')
    			LetValue = 7;
    		//The else if statement for letters "T", "U", and "V".
    		else if (Let == 'T' || Let == 'U' || Let == 'V')
    			LetValue = 8;
    		//The else if statement for letters "W", "X", and "Y".	
    		else if (Let == 'W' || Let == 'X' || Let == 'Y')
    			LetValue = 9;
    		//The else if statement for letters "Q" and "Z".
    		else if (Let == 'Q' || Let == 'Z')
    			LetValue = 0;	
    		
    		//Adding the value of each letter from each run to the total value of the name.		
    		Total = Total + LetValue;	
    				
    	}
    	
    	//Printing the total value of the name.
    	System.out.println ("The value of " + Name1 + " is " + Total + ".\n");
    		
    }
    
    
}