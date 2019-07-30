/**
 * @(#)EndString.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/9
 */
 //GRADE = 100
 import java.util.*;


public class EndString {

    public static void main (String [] args) 
    {
    	//Setting up the Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The first line to greet the user.
    	System.out.println ("Enter a word (at least 2 letters please):");
    	//Setting up the String variable for the word entered.
    	String Word = Input.nextLine();
    	//Setting up a String variable for the last 2 letters of the word to make it quicker to type in the next line.
    	String Letters = (Word.substring (Word.length()-2));
    	//The final line that prints the last 2 letters of the word 3 times.
    	System.out.println ("\n" + Letters + Letters + Letters + "\n");
    	
    	
    }
    
    
}