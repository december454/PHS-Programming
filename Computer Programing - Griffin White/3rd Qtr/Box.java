/**
 * @(#)Box.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/1/15
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Box {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks the user to enter the size of the box.
    	System.out.println ("Enter the size of the box:");
    		//Their input assigned to an int variable.
    		int Num = Input.nextInt();
    		//Setting up some variables for later in the program.
    		int A = Num;
    		int B = 1;
    		
    		System.out.println ();
    		
    		//The main loop that will repeat "Num" times before stopping.
    		for (int H = Num; H > 0; H--)
    		{
    			//The loop that will print an "*" "A" times.
    			for (int I = A; I > 0; I--)
    				System.out.print ("*");
    			//The loop that will print a "#" "B" times.	
    			for (int J = B; J > 0; J--)	
    				System.out.print ("#");
    			
    			//Decreasing the value of "A" by one before the next run of the main loop.	
    			A--;
    			//Increasing the value of "B" be one before the next run of the main loop.
    			B++;
    			
    			//Moving down to the next line before the next run of the main loop.
    			System.out.println();	
    		}		
    				
    		System.out.println();
    }
    
    
}