/**
 * @(#)nTwice.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/11
 */
//GRADE = 100
import java.util.*;

public class nTwice {

    public static void main (String [] args) 
    {
    	Scanner Input = new Scanner (System.in);
    	
    	//The first prompt to greet the user and a String variable (Word) that will be assigned to the word they entered. 
    	System.out.println ("Enter a String:");
    	String Word = Input.nextLine();
    	
    	//The second prompt to greet the user and an int variable (Interger) that will be assigned to the number they entered.
    	System.out.println ("\nEnter an interger (please enter a number no larger than the number of letters in the String entered):");
    	int Interger = Input.nextInt();
    	
    	//Assigning an int variable (Length) to represent the length of the word entered.
    	int Length = Word.length();
    	
    	//Setting up two String variables (First and Second) to represent the first and second half, respectively, of the new word. The halves' coordinates are determined using the number entered and the length of the word entered.
    	String First = Word.substring (0,Interger);
    	String Second = Word.substring (Length - Interger,Length);  
    	
    	//The final message that displays the two halves of the butchered word as one.	
    	System.out.println ("\n" + First + Second + "\n");
    }
    
    
}