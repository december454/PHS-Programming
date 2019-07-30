/**
 * @(#)Triangleword.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/1/5
 */

//Inmporting everything that I may need.
import java.io.*;
import java.util.*;

public class Triangleword {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//Asking the user to enter a word.
    	System.out.print ("Enter a word:	");
    		//Assigning their input to a String variable.
    		String Word = Input.nextLine();
    		//Assigning the length of their input to an int variable.
    		int Length = Word.length();
    		
    	System.out.println();
    	
    	//The main loop that will run once for every letter of the word entered.
    	for (int K = Length; K > 0; K--)
    	{
    		//The secondary loop that will print the word one letter at a time with the word becoming shorter with each cycle of the main loop.
    		for (int L = 0; L < K; L++)
    			//Printing each aforementioned letter.
    			System.out.print (Word.substring(L,L+1));
    			
    		System.out.println();		  
    	}	
    	
    	System.out.println();
    }
    
    
}