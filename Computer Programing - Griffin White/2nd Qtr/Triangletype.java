/**
 * @(#)Triangletype.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/11/9
 */
 //SPREAD OUT YOUR COMMENTS OVER THE CODE THEY GO WITH
 //GRADE = 100
//Importing everything that I might need.
import java.util.*;
import java.io.*;

public class Triangletype {

    public static void main (String [] args){
    
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks the user to enter the lengths of the three sides of the triangle and a double variable for each length.
    	System.out.println ("Enter the three sides of a triangle.");
    		double A = Input.nextDouble();
    		double B = Input.nextDouble();
    		double C = Input.nextDouble();
    	
    	//The if statement that will check to see if all the lengths are equal and print the equalateral response if they are.
    	if (A==B)
    		if (A==C)
    			System.out.println ("\nYou have an equalateral triangle.\n");
    	
    	//The if statement that will check to see if none of the lengths are equal and print the scalene statement if none are.	
    	if (A!=B)
    		if (A!=C)
    			if (B!=C)
    				System.out.println ("\nYou have a scalene triangle.\n");
    
    	//The if statement that will check to see if only two sides are equal and print the isosceles response if two are. 	
    	//An if/else if statement is provided to check for any combination of two sides.
    	if (A==B){
    		if (A!=C)
    			System.out.println ("\nYou have an isosceles triangle.\n");}
    	else if (A==C)
    		{if (A!=B)
    			System.out.println ("\nYou have an isosceles triangle.\n");}	
    	else if (B==C)
    		{if (A!=B)
    			System.out.println ("\nYou have an isosceles triangle.\n");}
    		
    			
    	 
    }
    
    
}