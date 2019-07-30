/**
 * @(#)Evenodd.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/11/2
 */
//GRADE = 100
//Importing everything I could need, just in case.
import java.util.*;
import java.io.*;

public class Evenodd {

	public static void main (String [] args) 
    {	
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that greets the user where they will enter a whole number and then the int variable that will represent that number.
    	System.out.print ("Enter a whole number :: ");
    		int Number = Input.nextInt();
    	
    	//Using modulus to see if the number entered will have a remainder when divided by 2 and therefore whether it is even of odd.	
    	int Remainder = Number%2;
    	
    	//The if statement that will print the even reponse if the number has no remainder.
    	if (Remainder == 0)
    		System.out.println (Number + " is even\n");
    	//The else statement that will print the odd response if the number has a remainder.	
    	else 
    		System.out.println (Number + " is odd\n");
    	
    }
    
    
}