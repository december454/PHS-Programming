/**
 * @(#)TwoDFun.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/2/13
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class TwoDFun {
	
	//A private 2d int array that will take in the sent over array.
	private int [][] Matrix = new int [4][20];
	
	//The main constructor that will take in the sent over array.
    public TwoDFun(int [][] M) 
    {
    	//Assiging the sent over array to its respective private variable.
    	Matrix = M;  	
    }
    
    //A method which will fill in the array with random values between 50 and 80.
    public int [][] randArray()
    {
    	//A set of for loops that will go through every location in the array.
    	for (int R = 0; R < 4; R++)
    		for (int C = 0; C < 20; C++)    		
    			//Setting the current location in the array to a random number between 50 and 80.
    			Matrix [R][C] = (int)Math.round((Math.random()*30+50));
    	
    	//Returning the filled in array.
    	return Matrix;  	
    }
    
    //A method which will fill in a row in the array with a given value.
    public int [][] fillRow(int R, int Val)
    {
    	//Filling in the selected row with the value sent over.
    	Arrays.fill (Matrix [R], Val);
    	
    	//Returning the modifid array.
    	return Matrix;    	
    }
    
    //A method which will find the minimum value in a given column in the array.
    public int findColMin (int C)
    {
    	//An int variable which will hold the minimum value.
    	int Min = 80;
    	
    	//A for loop that will go through every location in the column.
    	for (int R = 0; R < 4; R++)
    		//An if statment for when the current value is smaller than the minimum.
    		if (Matrix [R][C] < Min)
    			//Making that value the new minimum.
    			Min = Matrix [R][C];
    	
    	//Returning the minimum value.
    	return Min;
    }
    
    //A method which will find how many times a value appears in the array.
    public int findOccurances (int Val)
    {
    	//An int variable that will keep track of how many times the number occurred.
    	int Times = 0;
    	
    	//A set of for loops that will go through every value in the array.
    	for (int R = 0; R < 4; R++)
    		for (int C = 0; C < 20; C++)
    			//An if statement for when the value is spotted.
    			if (Matrix [R][C] == Val)
    				//Adding one to the tally.
    				Times++;

		//Returning the number of time that the value occurred.    			
    	return Times;				
    }
    
    //A method which will print out the array.
    public void printArray()
    {
    	//A set of for loops that will go through every value in the array.
    	for (int R = 0; R < 4; R++)
    	{
    		for (int C = 0; C < 20; C++)
    			//Printing out the current value.
    			System.out.print (Matrix [R][C] + " ") ;
    		
    		//Moving to the next row.
    		System.out.println();
    	}
    }                
}