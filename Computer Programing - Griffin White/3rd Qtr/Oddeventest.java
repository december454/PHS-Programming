/**
 * @(#)Oddeventest.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/12
 */
//TEST GRADE = 100
import java.io.*;
import java.util.*;

public class Oddeventest {

    public static void main (String [] args) 
    {
    	String Answer = "";
    		
    	do
    	{
    		Scanner Input = new Scanner (System.in);
    		
    		String Answer1 = "";
    		double Temp = 0;
    		int    OddCount = 0;
    		double OddTotal = 0;
    		int    EvenCount = 0;
    		double EvenTotal = 0;
    		
    		do
    		{
    			System.out.print ("Enter a number: ");
    				Temp = Input.nextDouble();
    			
    			if (Temp % 2 == 0)
    			{
    				EvenTotal += Temp;
    				EvenCount ++;
    			}	
    				
    			if (Temp % 2 != 0)
    			{
    				OddTotal += Temp;
    				OddCount ++;
    			}	
    				
    			System.out.print ("Do you want to enter another number? ");
    				Answer1 = Input.next();
    		}	
    		while (Answer1.equalsIgnoreCase("Y"));
    		
    		System.out.print   ("\nThere are " + EvenCount + " even numbers with a sum of ");
    		System.out.printf  ("%.2f", EvenTotal);
    		System.out.println (".\n");
    		
    		System.out.print   ("There are " + OddCount + " odd numbers with a sum of ");
    		System.out.printf  ("%.2f", OddTotal);
    		System.out.println (".\n");
    		
    		System.out.print ("Would you like to run the program again? ");
    			Answer = Input.next();
    		
    		System.out.println();	
    	}
    	while (Answer.equalsIgnoreCase("Y"));
    	
    			
    }
    
    
}