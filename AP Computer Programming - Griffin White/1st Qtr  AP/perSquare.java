/**
 * @(#)perSquare.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/2
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class perSquare {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File("persquare.dat"));
    	
    	//The main while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//A double variable that will hold the value of the current number.
    		double CurrentNum = DF.nextDouble();
    		
    		//An if statement for perfect squares that will call to the method and print out the results.
    		if (SqrtMethod (CurrentNum) == 0)
    			System.out.println ((int)CurrentNum + " is a perfect square.\n");
    		
    		//An else statement for non-perfect squares that print out the results.
    		else 
    			System.out.println ((int)CurrentNum + " is not a perfect square.\n");		
    	}
    }
    
    //The method which will determine if the number is a perfect square.
    public static int SqrtMethod (double CurrentNum1)
    {
    	//An int variable that will hold the results of the tests.
    	int Results;
    	
   		//An if statement that tests to see if the square root is a whole number.
    	if ((Math.sqrt (CurrentNum1)) % .5 == 0)
    		//Setting the results to say that it is a perfects square.
    		Results = 0;	
    	
    	//An else statement for non-perfects squares.
    	else 
    		//Setting the results to say that it is not perfect.
    		Results = 1	;
    	
    	//Returing the results.
    	return Results;		
    }    
}