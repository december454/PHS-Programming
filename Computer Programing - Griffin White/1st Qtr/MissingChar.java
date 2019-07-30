/**
 * @(#)MissingChar.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/10
 */
//GRADE = 100
import java.util.*;

public class MissingChar {

    public static void main (String [] args) 
    {
    	//Setting up the first Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The line that greets the user, where they enter their word, and the String variable that their word is assigned to.
    	System.out.println ("Please enter a String:");
    	String Word = Input.nextLine();	
    	
    	//The second message to greet the user, where they enter the number of the character to be removed, and the int variable that the number is assigned to.
    	System.out.println ("\nPlease enter the numeric posistion of the character you wish to remove:");
    	int Char = Input.nextInt();
    	
    	//Setting up a variable to represent the word length.
    	int Length = Word.length();
    	
    	//Setting up String variables to represent the first and second half of the new word. The coordinates of the halves are determined by the character number the user entered and the length of the word they entered.
    	String One = Word.substring(0,Char);
    	String Two = Word.substring(Char + 1,Length);
    	
    	//The final line that prints the new word with its missing character.
    	System.out.println ("\n" + One + Two + "\n");
    }
    
    
}