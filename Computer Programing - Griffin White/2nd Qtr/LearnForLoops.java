/**
 * @(#)LearnForLoops.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/12/7
 */

import java.io.*;
import java.util.*;

public class LearnForLoops {

    public static void main (String [] args)
    {
    	//Print the odd numbers from 1 to 100
    	for (int k = 1; k <= 100; k = k + 1)
    	{
    		//determine if the number is odd
    		if (k%2 != 0)
    			System.out.println(k);
    	}		
    	
    		//Print the even numbers from 0 to 100
    		for (int k = 0; k<=100; k=k+2)
    		{
    			System.out.println(k);
    		}
    		
    	
    	
   		for (int Y = 2; Y <1025; Y = Y*2)
   		{
   		
   			
   			if (Y == 64)
   				continue;
   			
   			if (Y==512)
   				break;
   			
   			System.out.print (Y + " ");
   			
   			System.out.println ("\n\n\n\n\n\n");
   				for (int H = 1; H<5;H=H+1 )
   					System.out.println(H);
   		
   		}
    	
    	
    }
    
    
}