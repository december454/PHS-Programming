/**
 * @(#)Fibonacci.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/4
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Fibonacci {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File ("Fibonacci.dat"));
    	
    	//The main while loop that will print out the fibonacci location values.
    	while (DF.hasNext())
    	{
    		//Moving to the actual size value of the data set.
    		DF.next();
    		DF.next();
    		DF.next();
    		
    		//An int variable that will read in the size of the fibonacci sequence.
    		int Size = DF.nextInt();
    		//An int vaqriable that will hold the value of the current location being analyized. 
    		int CurrentNum;
    		
    		//An inner while loop that will print out each location value for this data set.
    		while (DF.hasNextInt())
    		{
    			//Reading in the current location to be analyized.
    			CurrentNum = DF.nextInt();
    			
    			//Calling to the "FibMethod" and printing out what it had to return.
    			System.out.println (FibMethod(Size, CurrentNum));
    		}
    	}
    }
    
    //The method which will calculate the location values.
    public static int FibMethod (int Size1, int CurrentNum1)
    {
 		
 		//An int array that will hold the values of the fibonacci sequence.
    	int [] FibArray = new int [Size1 + 1];
    	
    	int Test = FibArray.length;
    		
    	//Assiging the first two values of the fibonacci sequence.
    	FibArray [0] = 1;
    	FibArray [1] = 1;
    	
    	//An int varible that will hold the value of the location being looked at.
    	int Result;
    	
    	//A for loop that will fill in the array until reaching the desired "Size".
    	for (int I = 2; I < Size1; I++)
    		//Adding up the two prior values to find the current value.
    		FibArray [I] = FibArray [I-2] + FibArray [I-1];
    	
    	//An if statement for when the requested location is out of bounds.
    	if (CurrentNum1 > Size1 || CurrentNum1 < 0)	
    		//Setting the "Result" to -1.
    		Result = -1;
    	
    	//An else statement for an appopriate location.	
    	else 
    		//Assigning the value of that location to the "Result" variable.
    		Result = FibArray [CurrentNum1 - 1];
    	
    	//Returning the value of "Result".	
    	return Result;		
	
    	
    }
    
    
}