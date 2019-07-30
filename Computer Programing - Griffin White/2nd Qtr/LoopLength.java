/**
 * @(#)LoopLength.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/12/11
 */
//GRADE = 100
//Importing eveything that I might need.
import java.io.*;
import java.util.*;

public class LoopLength {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks the user to enter a word.
    	System.out.print ("Enter a word: ");
    		//Their input assigned to a String variable.
    		String Word = Input.nextLine();
    		//The length of the word they entered assigned to a String variable.
    		int Length  = Word.length();
    		
    	System.out.println();
    	
    	//The for loop that will print the input of the user one time for every character of their input.
    	for (int I = Length; I != 0; I--)
    		System.out.println (Word);	
    		
    	System.out.println();	
    		
    }
    
    
}