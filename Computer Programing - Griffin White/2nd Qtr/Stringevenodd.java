/**
 * @(#)Stringevenodd.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/11/8
 */
//GRADE = 100
//Importing everything that I might need.
import java.util.*;
import java.io.*;

public class Stringevenodd {

    public static void main (String [] args)  
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that greets the user to enter a word.
    	System.out.println ("Enter a word:");
    		//Their input word assigned to a String variable.
    		String Word = Input.nextLine();
    		//Dividing the length of the word by two and assigning the remainder to an int variable.
    		int Remainder = (Word.length())%2;	
    	
    	//The if statement that will print the even response if the remainder is zero.
    	if (Remainder == 0)
    		System.out.println ("\n" + Word + " is even\n");
    	//The else statement that will print the odd response if the remainder is not zero.	
    	else 
    		System.out.println ("\n" + Word + " is odd\n");			
    	
    			
    }
    
    
}