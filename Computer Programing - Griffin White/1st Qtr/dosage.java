/**
 * @(#)dosage.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/16
 */
//GRADE = 100
import java.util.*;

public class dosage {

    public static void main (String [] args)
    {
    	Scanner Input = new Scanner (System.in);
    	
    	//The first prompt to greet the user where they will enter the child's age and a Double variable that their input is assigned to.
    	System.out.println ("Please enter the child\'s age in years:");
    	Double Age = Input.nextDouble();
    	
    	//The second prompt to greet the user where they will enter the adult dosage and a Double variable assigned to their input.
    	System.out.println ("\nPlease enter the adult dosage in mililiters:");
    	Double Adult = Input.nextDouble();
    	
    	//Calculating the child dosage.
    	Double Dosage = (Age/(Age + 12))*Adult;
    	
    	//The final line that displays the child dosage rounded to the thousandths place.	
    	System.out.printf ("\nThe child dosage is:\n%.3f", Dosage);
    	System.out.println (" ml\n");
  
    	
    	
    	
    }
    
    
}