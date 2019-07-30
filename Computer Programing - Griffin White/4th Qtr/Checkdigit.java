/**
 * @(#)Checkdigit.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/25
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Checkdigit {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File ("checkdigit.dat"));
    	
    	//An int variable that reads in how many data sets there are in the data file.
    	int DSNum = DF.nextInt();
    	
    	//The main for loop that will cycle once for each data set.
    	for (int I = 0; I < DSNum; I++)
    	{
    		//A pair of int variables that will keep track of the even and odd digit totals.
    		int OddTotal  = 0;
    		int EvenTotal = 0;
    		
    		//An array that will hold the value of the incomplete UPC code.
    		int [] UPC = new int [11];
    		
    		//Assiging each digit from the data set to its appropriate location in the data file.
    		for (int K = 0; K < 11; K++) 
    			UPC [K] = DF.nextInt();
    		
    		//A for loop that will find the totals for the even and odd digit values.
    		for (int J = 0; J < 11; J++)
    		{
    			//An if statement that will add the current value to the "OddTotal" if it is in an odd location, assuming one started counting at 1.
    			if (J % 2 == 0)
    				OddTotal += UPC [J];
    			//An else statement that will add the current vale to the "EvenTotal if it is in an even location. 	
    			else 
    				EvenTotal += UPC [J];	 
    		}
    		
    		//An int variable that will hold the value of the missing number after it is calculated.
    		int MissingNum = (OddTotal * 3 + EvenTotal) % 10;
    		
    		//An if statement that will conduct the final step in determining the missing value if aplicable.
    		if (MissingNum != 0)
    			MissingNum = 10 - MissingNum;
    		
    		//A for loop that will print out each digit of the UPC code.	
    		for (int L = 0; L < 11; L++)
    			System.out.print (UPC [L]);
    		
    		//Printing out the missing number.
    		System.out.println (MissingNum);
    	}
    }
    
    
}