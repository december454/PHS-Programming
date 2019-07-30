/**
 * @(#)charanalyzer.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/30
 */
//VERY NICELY FORMATTED:)
//GRADE = 100
//Importing the needed files for Character and Scanner.
import java.util.*;
import java.io.*;

public class charanalyzer {

    public static void main (String [] args) 
    {
    	//Instantiating the scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that greets the user where they enter their character.
    	System.out.print ("Enter a character: ");
    		//Setting up variables for the character they entered in String, the character they entered in char, and their character's ASCII value in int.
    		String Char1 = Input.nextLine(); 
    		char Char2 = Char1.charAt(0);
    		int Char3 = Char2;
    		
    	//Printing the characteristics of the character entered using Character.is.	
    	System.out.println ("Uppercase:  " + Character.isUpperCase(Char2));	
    	System.out.println ("Lowercase:  " + Character.isLowerCase(Char2));
    	System.out.println ("Whitespace: " + Character.isWhitespace(Char2));
    	System.out.println ("Digit:      " + Character.isDigit(Char2));
    	//Printing the ASCII value of the character by casting it to an int variable.
    	System.out.println ("ASCII==     " + Char3 + "\n");
    			
    		
    }
    
    
}