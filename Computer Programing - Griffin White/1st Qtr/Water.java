/**
 * @(#)Water.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/13
 */
//GRADE = 100
import java.util.*;

public class Water {

    public static void main (String [] args) 
    {
    	//Setting up the Scanner.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that will greet the user and an int variable that is assigned to their input.
    	System.out.println ("Please enter the weekly usage rate.");
    	int Rate = Input.nextInt();
    	
    	//Using the number they entered to calculate the number of weeks the water will last.
    	int Weeks = 10000/Rate;
    	
    	//The final line of dialogue to greet the user that displays the solution.  
    	System.out.println ("\n" + Rate + " gallons per week will last " + Weeks + " weeks.\n");
    	
    	
    }
    
    
}