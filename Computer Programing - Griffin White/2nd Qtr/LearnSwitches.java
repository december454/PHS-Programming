/**
 * @(#)LearnSwitches.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/11/30
 */

import java.io.*;
import java.util.*;

public class LearnSwitches {

    public static void main (String [] args) {
    	
    	//Instantiating a scanner input
    	Scanner Input = new Scanner (System.in);
    	
    	//ask the user to enter their choice
    	System.out.println ("Make your selection from the choises provided below: \n");
    	System.out.println ("A. Addition\nS. Subtraction\nM. Multiplication\nD. Division\n");
    	
    	String choice = Input.nextLine();
    	
    	//ask the user to enter 2 operands
    	System.out.println ("\nEnter the first operand.");
    		double op1 = Input.nextDouble();
    		
    	System.out.println ("\nEnter the second operand.");
    		double op2 = Input.nextDouble();
    	
    	//switch statement
    	switch (choice) //choice can be int, string, or char
    	{
    		//addition
    		case "A":case "a":
    			System.out.println("\n" + op1 + " Plus " + op2 + " = " + (op1+op2));
    			break;
    		case "S":case "s":
    			System.out.println("\n" + op1 + " Minus " + op2 + " = " + (op1-op2));
    			break;
    		case "M":case"m":
    			System.out.println("\n" + op1 + " times " + op2 + " = " + (op1+op2));
    			break;
    		case "D":case"d":
    			System.out.println("\n" + op1 + " Divided By " + op2 + " = " + (op1/op2));
    			break;			
    	}
    	
    	
    }
    
    
}