/**
 * @(#)Reaumur.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/9/27
 */
 //GOOD JOB
//GRADE = 100
 import java.util.*;

public class Reaumur {

    public static void main (String [] args)
    {
    	//Setting up the Scanner.
    	Scanner Input = new Scanner (System.in);
    	
    	//The first message to greet the user and the Scanner input.
    	System.out.print ("Enter Reaumur temperature: ");
    	double RT = Input.nextDouble ();
    	
    	//Calculating the temperature in Fahrenhiet and assigning it to a variable.
    	double FT = RT*2.25+32;
    	
    	//Message that tells user the Temperature in Fahrenhiet.	
    	System.out.println ("\n" + FT +" degrees Fahrenheit\n");	
    	
    }
    
    
}