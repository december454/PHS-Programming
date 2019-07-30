/**
 * @(#)Avenum.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/12/13
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Avenum {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks teh user to enter 20 intergers.
    	System.out.println ("Please enter 20 intergers.");
    	
    	//Setting up variables outside of any loops/if statements.
    	//Their input assigned to a double variable.
    	double Num = 0;
    	//The total of all the positive intergers entered.
    	double PosTotal = 0;
    	//The number of positive intergers entered.
    	int PosCount = 0;
    	//The total of all the negative intergers.
    	double NegTotal = 0;
    	//The number of negative intergers entered.
    	int NegCount = 0;
    	
    	//The for loop that will calculate the number of and totals of the positive and negative intergers. 
    	for (int K = 0; K != 20; K++)
    	{
    		//Each interger assigned to the variable "Num".
    		Num = Input.nextDouble();
    		
    		//The if statement for a positive interger.
    		if (Num>=0)
    			//Adding one to the number of positive intergers entered.
    			{PosCount++;
    			//Adding the interger to the positive total.
    			PosTotal = PosTotal + Num;}
    		
    		//The if statement for a negative interger.	
    		if (Num<0)
    			//Adding one to the number of negative intergers entered.
    			{NegCount++;
    			//Adding the interger to the negative total.
    			NegTotal = NegTotal + Num;}	
    	}
    	
    	//Printing the first part of the positive response.
    	System.out.println ("\nThere were " + PosCount + " positive numbers that have an average of");
    	//Printing the positive average rounded to the nearest hundredth.
    	System.out.printf  ("%.2f", (PosTotal/PosCount));
    	//Printing the first part of the negative response.
    	System.out.println ("\n\nThere were " + NegCount + " negative numbers that have an average of");	
    	//Printing the negative average rounded to the nearest hundredth.
    	System.out.printf  ("%.2f", (NegTotal/NegCount));	
    	System.out.println ("\n");
    }
    
    
}