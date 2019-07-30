/**
 * @(#)ProgTest2.java
 *
 *
 * @author 
 * @version 1.00 2017/9/29
 */
//GOOD JOB
//TEST GRADE = 100
import java.util.*;

public class ProgTest2 {

    public static void main (String [] args)
    {
    	Scanner Input = new Scanner (System.in);
    	
    	System.out.println ("Enter the weekly usage:");
    	int Usage = Input.nextInt ();
    	
    	System.out.println ("\nEnter the number of gallons of water in the tank:");
    	int Gallons = Input.nextInt ();
    	
    	int Answer = Gallons/Usage;
    		
    	System.out.println ("\nThe water will last " + Answer + " weeks.\n");
    }
    
    
    
}