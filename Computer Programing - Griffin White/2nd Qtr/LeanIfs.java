/**
 * @(#)LeanIfs.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/11/1
 */

import java.util.*;
import java.io.*;

public class LeanIfs {

    public static void main (String [] args) 
    {
    	Scanner Input = new Scanner (System.in);
    	
    	double cost = 0;
    	
    	System.out.println ("How manny hours did you skate?");
    	int hours = Input.nextInt();
    	
    	if (hours<=2)
    	{
    		cost = 5;
    	}
    	else
    	{
    		cost = 5 + 1.5 * (hours-2);
    	}	
    	System.out.printf ("%d hours of skating will cost %.2f\n", hours, cost);	
    	
    }
    
    
}