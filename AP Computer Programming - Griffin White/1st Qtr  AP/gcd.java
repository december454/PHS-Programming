/**
 * @(#)gcd.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/9/28
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class gcd {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File("gcd.dat"));
    	
    	//The main while loop that will run until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//Reading in the two numbers of the data set.
    		int Num0 = DF.nextInt();
    		int Num1 = DF.nextInt();
    		
    		//Printing out the results of the GCD calculations.	
    		System.out.print ("The GCD of " + Num0 + " and " + Num1 + " is ");
    		//Calling to the method and printing out the GCD.
    		GCDMethod(Num0, Num1);
    	}	
    }
    
    //The method that will calculate and print out the GCD.
    public static void GCDMethod (int MNum0,int MNum1)
    {
    	//An int variable that will hold the value of the GCD.
    	int GCD = 0;
    	
    	//A for loop that will cycle until testing every possible factor for the two numbers.
    	for (int I = 1; I <= MNum0 && I <= MNum1; I++)
    	{
    		//An if statemnt that will assign the current value of "I" to "GCD" if it is a common denominator.
    		if (MNum0 % I == 0 && MNum1 % I == 0)
    			//Assigning the current value.
    			GCD = I;
    	}
    	
    	//Printing out the GCD.
    	System.out.println (GCD);   		
    }
}