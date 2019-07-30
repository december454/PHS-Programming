/**
 * @(#)Decoder.java
 * Griffin white
 *
 * @author 
 * @version 1.00 2017/11/6
 */
//GRADE = 100
//Importing everything that I will need.
import java.util.*;
import java.io.*;

public class Decoder {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner variable.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that greets the user to enter a character.
    	System.out.println ("Enter a character:");
    		//Thier input in String.
    		String Char  = Input.nextLine();
    		//Their input in char so that it can be analyzed further on.
    		char   Char2 = Char.charAt(0);
    		//Their input in int to be used if they entered a digit.
    		int    Char3 = Char2 + 17;
    		//The previous varible in char so that its ASCII value can be displayed.
    		char   Char4 = (char) Char3;
    		
    	//The if statement that will capitalize their input if it was lowercase.
    	if (Character.isLowerCase(Char2))
    		System.out.println ("\n" + Char2 + " decodes to " + (Char.toUpperCase()) + "\n");
    	
    	//The if statement that will make their input lowercase if it was capitalized.
    	if (Character.isUpperCase(Char2))
    		System.out.println ("\n" + Char2 + " decodes to " + (Char.toLowerCase()) + "\n");	
    			
    	//The if statement that will print A-J, with respective assignment, if their imput was a digit.
    	if (Character.isDigit(Char2))
    		System.out.println ("\n" + Char2 + " decodes to " + Char4 + "\n");
		
		//The if statement that will print "#" if their input was not a letter of digit.
		if (Character.isLetterOrDigit(Char2) == false)
			System.out.println ("\n" + Char2 + " decodes to # " + "\n");			
    }
    
    
}