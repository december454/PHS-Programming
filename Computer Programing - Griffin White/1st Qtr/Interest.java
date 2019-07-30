/**
 * @(#)Interest.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/9/28
 */
//GOOD JOB
//GRADE = 100
 import java.util.*;

public class Interest {

//IMPORTANT: I also made mine so that you can enter the interest rate as-is, so don't convert it before entering it.
    public static void main (String [] args) 
    	
    {
    	Scanner Input = new Scanner (System.in);
    	
    	//First message to greet user where they will enter the amount.
    	System.out.println ("Please enter the amount of the loan.");
    	double Amount = Input.nextDouble ();
    	
    	//Second message where they will enter the interest rate.(made to be a constant as you asked)
    	System.out.println ("\nPlease enter the interest rate.");
    	final double Rate =  Input.nextDouble ();
    	
    	//Final prompt where the number of years is entered. (int was used instead of double to simplify things when printing the number of years in the final line)
    	System.out.println ("\nPlease enter the number of years the loan is for.");  
    	int Years = Input.nextInt ();
    	
    	//These two lines probably could have been made into one, but this seemed easier at the time. Here the amount payed in interest is calculated and assigned to a variable.
    	double Interest = Amount*Rate*Years/100;
    		
    	//That amount is then casted to be an int for the solution.
    	int Solution = (int) Interest;
    		
    	//Final line stating the amount of interest spent after however many years.
    	System.out.println ("\nYou spent " + Solution + " dollars on interest over the past " + Years + " years.\n");
    	
    }
    
    
}