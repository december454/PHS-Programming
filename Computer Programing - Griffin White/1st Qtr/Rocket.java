/**
 * @(#)Rocket.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/9/25
 */
//GOOD JOB
//GRADE = 100
//Importing needed files.
import java.util.*;

public class Rocket {

    public static void main (String [] args) 
    {
    	//Setting up a Scanner.
    	Scanner Input = new Scanner (System.in);
    	
    	//User will be greeted with this message.	
    	System.out.print ("Please enter the mass in Ounces: ");
    		
    	//Assigning and Defining variables.	
    	double Ounces = Input.nextDouble();
    	double Grams = 28.3495;
    	
    	//Final line showing output of the conversion.
        System.out.println ("\n" + Ounces + " Ounces is equal to " + Ounces*Grams + " Grams.\n");
    	
    }
    
    
}