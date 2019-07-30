/**
 * @(#)Backwards.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/12/12
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Backwards {

    public static void main (String [] args) 
    {
    	//Instaniating a Scanner Input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks the user to enter a String.
    	System.out.println ("Enter a String: ");
    		//Their input assigned to a String variable.
    		String Word = Input.nextLine();
    		//The length of their input assigned to an int variable.
    		int Length  = Word.length();
    	
    	//Printing the first character of the String they entered.	
    	System.out.println ("\n" + Word.substring (0,1));
    	//Printing the last character of the String they entered.
    	System.out.println (Word.substring (Length - 1, Length));
    	
    	//The for loop that will print the String they entered in reverse, one character at a time.
    	for (int I = Length; I != 0; I--)
    		System.out.print (Word.substring (I - 1, I));
    	
    	//Printing the String they entered without any changes.	
    	System.out.println ("\n" + Word + "\n");
    	
    		
    		
    }
    
    
}