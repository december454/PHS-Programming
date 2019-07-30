/**
 * @(#)Watercube.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/1/4
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Watercube {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks the use to enter a number between 1 and 7.
    	System.out.println ("Enter a number between 1 and 7.");
    		//Assigning their input to an int variable.
    		int Num = Input.nextInt();
    		
    	System.out.println();	
    	
    	//The loop that will repeat as many times as the user entered.	
    	for (int J=Num; J>0; J--)
    	{	
    		//The nested loop that will print four times as many "O"s as the number entered.
    		for (int K=(Num*4); K>0; K--)
    			System.out.print("O");
    		
    		//Setting the cursor down a line at the end of each run of the loop.		
    		System.out.println();		
    	}	
    					
    	System.out.println();
    }
    
    
    
    
}