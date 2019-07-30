
/**
 * @(#)LearnWhileLoops.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/1/24
 */

import java.io.*;
import java.util.*;

public class LearnWhileLoops {

    public static void main (String [] args) 
    {
    	int run = 0;
    	while (run < 5)
    	{
    		run++;
    		System.out.println(run);
    	}
    	
    System.out.println ("\nBetween Loops\n\n");
    run = 0;
    do
    {
    	run++;
    	System.out.println(run);
    }
    	while (run < 5);
    	
    	
    	Scanner Input = new Scanner (System.in);
    	
    	String answer = "Y";
    	
    	do 
    	{
    	
    	System.out.println ("Enter a number");
    	int number = Input.nextInt();
    	
    	while (number > 0)
    	{
    		System.out.println (number%10);//prints the ones place
    		number /= 10;//removes the ones place
    		
    	}
    	System.out.println("\nDo you want to run thsi program again? (Y/N)");
    	answer = Input.next();
    	}
    	while (answer.equalsIgnoreCase("Y"));
                                                                                                                                        		                                                                                   
    }
    
    
}