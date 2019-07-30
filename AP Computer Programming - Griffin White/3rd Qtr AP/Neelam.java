/**
 * @(#)Neelam.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/1/8
 */

//Importing everything that I might need.
import java.io.*;
import java.util.*;

public class Neelam {
	
	//A private int variable that will hold the value being analyized.
	private int Num = 0;
	
	//The main constructor that takes in the values sent over.
    public Neelam(int A) 
    {
    	//Assigning the sent over value to the "Num" variable.
    	Num = A;
    }
    
    //A method that will create the abacus and return it in the form of a 2d String array.
    public String[][] MakeAbacus ()
    {
    	//An int variable to hold the value of "Num" when it needs to be modified.
    	int TempNum   = Num;
    	//An int variable that holds the length of the number.
    	int NumLength = 0;
    	
    	//A while loop to calculate the length.
    	while (TempNum > 0)
    	{
    		//Removing a digit from the number.
    		TempNum /= 10;
    		//Tallying the number's length.
    		NumLength++;
    	}
    	
    	//A 2d String array that will represent the abacus.
    	String [][] Results = new String [8][NumLength];
    	
    	//A for loop that will fill in the 2d array with "o"s.
    	for (int I = 0; I < 8; I++)  
    		//Filling in the current row. 	
    		Arrays.fill (Results [I], "o");
    	
    	//Adding the separator to the array.
   		Arrays.fill (Results [2], "=");
   		
   		//A while loop for filling in the abacus.
    	while (Num > 0)
    	{
    		//Moving down one digit at a time.
    		NumLength--;
    		
    		//Assigning the current digit to "TempNum".
    		TempNum = Num % 10;
    		
    		//Removing one digit from the number.
    		Num /= 10;
    		
    		//An if statement for when the number is less than five.
    		if (TempNum < 5)
    		{
    			//Filling in the proper mark for the first half.
    			Results [1][NumLength] = "|";
    		}
    		
    		//An else statement for when the number is five or greater.
    		else 
    		{
    			//Filling in the proper mark for the first half.
    			Results [0][NumLength] = "|";
    			//Preparign the number for the second half.
    			TempNum -= 5;
    		}
    		
    		//Assigning the proper mark for the second half.
    		Results [TempNum + 3][NumLength] = "|";
    	}
    	
    	//Returning the completed abacus array.
    	return Results;
    }
    
    //A method which prints out the abacus.
    public void PrintAbacus (String [][] FinalResults)
    {
    	//A set of for loops that will print out the abacus.
    	for (int I = 0; I < 8; I++)
    	{
    		//The inner for loop that cycles for each value in the row.
    		for (int J = 0; J < FinalResults [0].length; J++)
    			//Printing the current coordinate.
    			System.out.print (FinalResults [I][J]);
    		
    		//Moving to the next row.
    		System.out.println();
    	}
    	
    	//Preparing for the next abacus.
    	System.out.println();    	
    }    
}