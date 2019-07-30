/**
 * @(#)feetinches.java
 *
 *
 * @author 
 * @version 1.00 2017/9/22
 */

import java.util.*;

public class feetinches {

    public static void main (String [] args)
    {
    	//instantiate a Scanner object
    	Scanner kbreader = new Scanner (System.in);
    	
    	//enter the number of inches to convert
    	System.out.println("Enter the number of inches");
    	int totalinches = kbreader.nextInt();
    	
    	//calculate number of feet
    	int feet = totalinches / 12;
    	
    	//calculate the number of left over inches
    	int inches = totalinches % 12;
    	
    	//print results
    	System.out.println(totalinches + " inches equals " + feet + " foot and " + inches + " inches.");
    	
    }
    	
    
    
    
}