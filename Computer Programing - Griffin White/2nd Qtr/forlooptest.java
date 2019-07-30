/**
 * @(#)forlooptest.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/12/19
 */
//TEST GRADE = 100
import java.io.*;
import java.util.*;

public class forlooptest {

    public static void main (String [] args) 
    {
    	Scanner Input = new Scanner (System.in);
    	
    	System.out.println ("Enter the number you want the loop to stop:");
    		int Num  = Input.nextInt();
    		int Cool = 0;
    		
    	for (int I=6;I<Num;I++)	
    		if (I%3==1 && I%4==1 && I%5==1 && I%6==1)
    			Cool++;
    			
    	System.out.println ("There are " + Cool + " cool numbers\n");		
    			
    }
    
    
}