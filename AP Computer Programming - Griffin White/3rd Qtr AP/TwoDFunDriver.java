/**
 * @(#)TwoDFunDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/2/13
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class TwoDFunDriver {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF    = new Scanner (new File ("TwoDFun.txt"));
    	//Instantiating a Scanner to take in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNextInt())
    	{ 
    		//Creating a 2d int array to be filled with random values.
    		int [][] Matrix = new int [4][20];
    		
    		//Creating a "TwoDFun" onject and sending over the 2d array.
    		TwoDFun Calculator = new TwoDFun (Matrix);
    		
    		//Calling to the "randArry" method in the "TwoDFun" class and filling the array with random values.
    		Matrix = Calculator.randArray();
    		
    		//Printing out the list now that it has been filled in.
    		System.out.println ("\nOriginal Array:");
    		Calculator.printArray();
    		
    		//Asking the user what row they want to be modified.
    		System.out.println ("\nWhich row do you want to modify? (0 - 3):");    		
    		//Taking in their input and sending it over to the method which will fill in the row.
    		Matrix = Calculator.fillRow(Input.nextInt(), DF.nextInt());
    		
    		//Printing out the array now that the row has been filled in.
    		System.out.println ("\nModified Array:");
    		Calculator.printArray();
    		
    		//Reading in the column to be searched through.
    		int C = DF.nextInt();
    		
    		//Printing out the minimum value from that column.
    		System.out.println("\nMinimum Value in column " + C + ":");
    		System.out.println (Calculator.findColMin(C));
    		
    		//Printing out the array.
    		System.out.println ("\nCurrent Array:");
    		Calculator.printArray();
    		
    		//Reading in the number to be searched for.
    		int searchNum = DF.nextInt();
    		
    		//Printing out how many times the number was found in that column.
    		System.out.println ("\nNumber of Occurances of " + searchNum + ":");
    		System.out.println (Calculator.findOccurances(searchNum));
    		
    		//Printing out the array.
    		System.out.println ("\nCurrent Array:");
    		Calculator.printArray();
    		
    		
    		
    		
    		
    		
    		
    		
    	}
    	

    		   		
    	
    	
    	
    	
    	
    	
    }
    
    
}