/**
 * @(#)LSElement.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/9/17
 */
//GRADE = 100
//Importing everythiing that I may need.
import java.io.*;
import java.util.*;

public class LSElement {

    public static void main (String [] args) 
    {
    	//Creating a two dimensional array to hold the random values.
    	int [][] Matrix = new int [4][4];
    	
    	//A set of for loops that will fill in the array and print it out.
    	for (int I = 0; I < 4; I++)
    	{
    		//The inner loop that will cycle once for each column.
    		for (int N = 0; N < 4; N++)
    		{
    			//Assigning a random value between 0 and 500 to the current location in the array.
    			Matrix [I][N] = (int)(Math.random()*500);
    			
    			//Printing out the current value.
    			System.out.print (Matrix [I][N] + "  ");
    			
    			//An if statement for when the number is less than 100.
    			if (Matrix [I][N] < 100)
    				//Printing an extra space.
    				System.out.print (" ");
    			
    			//An if statement for when the number is less than 10.
    			if (Matrix [I][N] < 10)	
    				//Printing another space.
    				System.out.print (" ");
    		}
    		
    		//Moving down to print on the next line.
    		System.out.println();
    	}
    	
    	//A set of int variable that will hold the "Smallest" and "Largest" values in the array.
    	int Smallest  = 0;
    	int Largest   = 0;
    	
    	//A set of string variables that will hold the coordinates of the pior values.
    	String SmallLoc = "";
    	String LargeLoc = "";
    	
    	//A set of for loops that will find the smallest value.
    	SmallMain:for (int J = 0; J < 4; J++)
    		for (int K = 0; K < 4; K++)
    			//A set of inner for loops that will compare the current value to every other value.
    			SmallInner:for (int L = 0; L < 4; L++)
    				for (int M = 0; M < 4; M++)
    				{
    					//An if statment for when the value is determined to not be the smallest.
    					if (Matrix [J][K] > Matrix [L][M])
    						//Moving on to the next value.
    						break SmallInner;
    					
    					//An if statment for when it is confirmed that a value is the smallest.
    					if (L == 3 && M == 3)	
    					{
    						//Assigning that value to the "Smallest" variable.
    						Smallest = Matrix [J][K];
    						//Recording the coordinates of the value.
    						SmallLoc = J + "," + K;
    						//Breaking out of the main loop.
    						break SmallMain;
    					}
    				}
    	
    	//A set of for loops that will find the largest value.			
    	LargeMain:for (int N = 0; N < 4; N++)
    		for (int O = 0; O < 4; O++)
    			//A set of inner for loops that will compare the current value to every other value.
    			LargeInner:for (int P = 0; P < 4; P++)
    				for (int Q = 0; Q < 4; Q++)
    				{
    					//An if statment for when the value is determined to not be the largest.
    					if (Matrix [N][O] < Matrix [P][Q])
    						//Moving to the next value.
    						break LargeInner;
    					
    					//An if statment for when it is confirmed that a value is the largest.	
    					if (P == 3 && Q == 3)	
    					{
    						//Assigning that value to the "Largest" variable.
    						Largest = Matrix [N][O];
    						//Recording the coordinates of the value.
    						LargeLoc = N + "," + O;
    						//Breaking out of the main loop.
    						break LargeMain;
    					}
    				}
    	
    	//Printing out the smallest value and where it is located.
    	System.out.println ("\nThe smallest element is " + Smallest + " and is located in position " + SmallLoc + ".");
    	//Printing out the largest value and where it is located.
    	System.out.println ("The largest element is " + Largest + " and is located in position " + LargeLoc + ".\n");
    		
    }
}